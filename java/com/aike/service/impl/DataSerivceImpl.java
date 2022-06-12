package com.aike.service.impl;

import com.aike.mapper.*;
import com.aike.pojo.Class;
import com.aike.pojo.*;
import com.aike.service.DataService;
import com.aike.service.vo.SelectHelp;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.*;

@Service
public class DataSerivceImpl implements DataService {

    @Resource
    AdminMapper adminMapper;

    @Resource
    StudentMapper studentMapper;

    @Resource
    ClassMapper classMapper;

    @Resource
    DataerMapper dataerMapper;

    @Resource
    CheckerMapper checkerMapper;

    @Resource
    RecordMapper recordMapper;

    @Resource
    ErrorcordMapper errorcordMapper;

    @Override
    @Transactional
    public int cumulationData(MultipartFile file, String dName, Integer dSno) {
        int studentSum = 1;
        try {
            InputStream inputStream = file.getInputStream();
            Workbook workbook = new HSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row sheetRow = sheet.getRow(i);
                List<String> list = new ArrayList<>();
                for (int j = 0; j < sheetRow.getPhysicalNumberOfCells(); j++) {   //
                    if(sheetRow.getCell(j)!=null){
                        sheetRow.getCell(j).setCellType(CellType.STRING);
                        list.add(sheetRow.getCell(j).getStringCellValue());
                    }
                }
                // 学号 学生名字 修改分值 描述
                if(list.size() > 0){
                    studentSum++;
                    Record record = new Record();
                    /*System.out.println(dSno + " " + dName +
                            " " + list.get(0) + " " + list.get(1) +
                           " " + list.get(2) + " ");*/
                    record.setdSno(dSno);
                    record.setdName(dName);
                    record.setsSno(Integer.parseInt(list.get(0)));
                    record.setsName(list.get(1));
                    record.setUpdatescore(Double.parseDouble(list.get(2)));
                    String remark = "";
                    if(list.size() >= 4){
                        remark = list.get(3);
                    }
                    record.setRemarks(remark);

                    record.setDate(new Date());
                    record.setStatus(false);

                    int insert = recordMapper.dataerInsert(record);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("出现运行错误");
        }
        return studentSum;
    }

    @Override
    @Transactional
    public int resetData(MultipartFile file) {

        int studentSum = 1;
        try {
            //取出审核员和录入员
            List<Dataer> dataers = dataerMapper.selectAllCondition(new SelectHelp());
            List<Checker> checkers = checkerMapper.selectAllCondition(new SelectHelp());

            //清空所有数据库
            int i0 = errorcordMapper.deleteByExample(new ErrorcordExample());
            int i1 = recordMapper.deleteByExample(new RecordExample());
            int i2 = checkerMapper.deleteByExample(new CheckerExample());
            int i3 = dataerMapper.deleteByExample(new DataerExample());
            int i4 = studentMapper.deleteByExample(new StudentExample());
            int i5 = classMapper.deleteByExample(new ClassExample());
            //重置主键
            //adminMapper.resetIncrement();

            //获取所有出现的班级名
            InputStream inputStream = file.getInputStream();
            Workbook workbook = new HSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            HashMap<String,Integer> temp = new HashMap<>();
            int index = 1;
            //System.out.println(sheet.getPhysicalNumberOfRows());
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row sheetRow = sheet.getRow(i);
                //获取班级栏
                if(sheetRow.getCell(2)!=null){
                    sheetRow.getCell(2).setCellType(CellType.STRING);
                    String className = sheetRow.getCell(2).getStringCellValue();
                    if(!temp.containsKey(className)){
                        temp.put(className,index++);
                    }
                }
            }
            //对其班级名进行创建数据库 班级
              for(Map.Entry<String,Integer> map : temp.entrySet()){
                  Class clazz = new Class(map.getValue(),map.getKey());
                  int insert = classMapper.insert(clazz);
                  //insertCheck(insert,clazz);
              }
            //创建学生数据库
            //0 - 学号
            //1 - 姓名
            //2 - 班级
            //3 - 分数
            //4 - 年龄
            //5 - 性别

            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row sheetRow = sheet.getRow(i);
                List<String> list = new ArrayList<>();
                for (int j = 0; j < sheetRow.getPhysicalNumberOfCells(); j++) {   //
                    if(sheetRow.getCell(j)!=null){
                        //System.out.println(sheetRow.getCell(j));
                        sheetRow.getCell(j).setCellType(CellType.STRING);
                        list.add(sheetRow.getCell(j).getStringCellValue());
                    }
                }
                if(list.size() > 0){
                    Student student = new Student(
                            studentSum++,
                            list.get(0),
                            list.get(1),
                            Integer.parseInt(list.get(0)),
                            Double.parseDouble(list.get(3)),
                            temp.get(list.get(2)),
                            list.get(5),
                            Integer.parseInt(list.get(4))
                    );
                    int insert = studentMapper.insert(student);
                }
                //insertCheck(insert,student);
            }
            //录回录入员和审核员
            for(Dataer dataer : dataers){
                dataer.setdClassId(temp.get(dataer.getdClass().getClName()));
                int insert = dataerMapper.insert(dataer);
                insertCheck(insert,dataer);
            }
            for(Checker checker : checkers){
                checker.setcClassId(temp.get(checker.getcClass().getClName()));
                int insert = checkerMapper.insert(checker);
                insertCheck(insert,checker);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("出现运行错误");
        }
        return studentSum;
    }

    @Transactional
    public void insertCheck(int insert,Object object){
        if(insert<=0){
            throw new RuntimeException(insert + ":insert出错," + object);
        }
    }
}
