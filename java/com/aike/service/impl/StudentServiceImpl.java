package com.aike.service.impl;

import com.aike.mapper.StudentMapper;
import com.aike.pojo.Class;
import com.aike.pojo.Student;
import com.aike.pojo.StudentExample;
import com.aike.service.ClassService;
import com.aike.service.StudentService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentMapper studentMapper;

    @Resource
    ClassService classService;


    @Override
    public Student login(Integer username, String password) {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andSSnoEqualTo(username);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students!=null && !students.isEmpty()){
            Student student = students.get(0);
            String nowPass = student.getsPassword();
            if(password.equals(nowPass)){
                return student;
            }
        }
        return null;
    }

    @Override
    public PageInfo<Student> selectAllCondition(SelectHelp selectHelp) {
        //System.out.println(selectHelp.getPageIndex() + " " + selectHelp.getPageSize());
        PageHelper.startPage(selectHelp.getPageIndex(),selectHelp.getPageSize());
        List<Student> student = studentMapper.selectAllCondition(selectHelp);
        PageInfo<Student> pageInfo = new PageInfo<>(student);

        return pageInfo;
    }


    @Override
    public List<Student> selectAll() {
        List<Student> student = studentMapper.selectByExample(new StudentExample());
        return student;
    }

    @Override
    public Student selectToId(Integer id) {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andSSnoEqualTo(id);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students!=null && !students.isEmpty()){
            Student student = students.get(0);
            return student;
        }
        return null;
    }



    @Override
    public int addStudent(Student student) {
        return 0;
    }

    @Override
    public int deleteStudent(int cid) {
        return 0;
    }

    @Override
    public int updateStudent(Student student) {
        int i = studentMapper.updateByPrimaryKey(student);
        return i;
    }

    @Override
    public int updateStudentPoint(Integer sid, Double updatescope) {
        StudentExample studentExample = new StudentExample();
        //studentExample.createCriteria().andSSnoEqualTo(sSno);
        //更改为主键查询
        studentExample.createCriteria().andSIdEqualTo(sid);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students!=null && !students.isEmpty()){
            Student student = students.get(0);
            Double nowPoint = student.getsPoint();
            student.setsPoint(nowPoint+updatescope);
            return studentMapper.updateByPrimaryKey(student);
        }
        return -1;
    }



    @Override
    public void exportExcelAll(HttpServletRequest request, HttpServletResponse response) {
        try {

            List<Student> records = studentMapper.selectByExample(new StudentExample());

            @SuppressWarnings("resource")
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("学生表");

            HSSFRow row = null;

            int columnIndex = 0;

            row = sheet.createRow(0);
            row.setHeight((short) (22.50 * 20));//设置行高
            row.createCell(columnIndex).setCellValue("学号");
            row.createCell(++columnIndex).setCellValue("学生名");
            row.createCell(++columnIndex).setCellValue("班级");
            row.createCell(++columnIndex).setCellValue("分数");
            row.createCell(++columnIndex).setCellValue("年龄");
            row.createCell(++columnIndex).setCellValue("性别");
            for (int i = 0; i < records.size(); i++) {
                row = sheet.createRow(i + 1);
                Student entity = records.get(i);

                columnIndex = 0;

                //row.createCell(columnIndex).setCellValue(i + 1);
                row.createCell(columnIndex).setCellValue(entity.getsSno());
                row.createCell(++columnIndex).setCellValue(entity.getsName());
                row.createCell(++columnIndex).setCellValue(entity.getsClass().getClName());
                row.createCell(++columnIndex).setCellValue(entity.getsPoint());
                row.createCell(++columnIndex).setCellValue(entity.getsAge());
                row.createCell(++columnIndex).setCellValue(entity.getsSex());
            }

            sheet.setDefaultRowHeight((short) (16.5 * 20));

            //列宽自适应
            for (int i = 0; i <= 5; i++) {
                sheet.autoSizeColumn(i);
            }

            String title= "学生数据";

            response.setHeader("Content-disposition", "attachment;fileName=" + title + ".xls");
            response.setContentType("application/octet-stream;charset=utf-8");
            OutputStream ouputStream = response.getOutputStream();
            wb.write(ouputStream);
            ouputStream.flush();
            ouputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void exportExcelAll(HttpServletRequest request, HttpServletResponse response,String className) {
        try {
            Class aClass = classService.getClass(className);
            StudentExample studentExample = new StudentExample();
            studentExample.createCriteria().andSClassIdEqualTo(aClass.getClId());
            List<Student> records = studentMapper.selectByExample(studentExample);

            @SuppressWarnings("resource")
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("学生表");

            HSSFRow row = null;

            int columnIndex = 0;

            row = sheet.createRow(0);
            row.setHeight((short) (22.50 * 20));//设置行高
            row.createCell(columnIndex).setCellValue("学号");
            row.createCell(++columnIndex).setCellValue("学生名");
            row.createCell(++columnIndex).setCellValue("班级");
            row.createCell(++columnIndex).setCellValue("分数");
            row.createCell(++columnIndex).setCellValue("年龄");
            row.createCell(++columnIndex).setCellValue("性别");
            for (int i = 0; i < records.size(); i++) {
                row = sheet.createRow(i + 1);
                Student entity = records.get(i);

                columnIndex = 0;

                //row.createCell(columnIndex).setCellValue(i + 1);
                row.createCell(columnIndex).setCellValue(entity.getsSno());
                row.createCell(++columnIndex).setCellValue(entity.getsName());
                row.createCell(++columnIndex).setCellValue(entity.getsClass().getClName());
                row.createCell(++columnIndex).setCellValue(entity.getsPoint());
                row.createCell(++columnIndex).setCellValue(entity.getsAge());
                row.createCell(++columnIndex).setCellValue(entity.getsSex());
            }

            sheet.setDefaultRowHeight((short) (16.5 * 20));

            //列宽自适应
            for (int i = 0; i <= 5; i++) {
                sheet.autoSizeColumn(i);
            }

            String title= "学生数据";

            response.setHeader("Content-disposition", "attachment;fileName=" + title + ".xls");
            response.setContentType("application/octet-stream;charset=utf-8");
            OutputStream ouputStream = response.getOutputStream();
            wb.write(ouputStream);
            ouputStream.flush();
            ouputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
