package com.aike.service.impl;

import com.aike.mapper.ClassMapper;
import com.aike.pojo.Class;
import com.aike.pojo.ClassExample;
import com.aike.service.ClassService;
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
public class ClassServiceImpl implements ClassService {
    @Resource
    ClassMapper classMapper;


    @Override
    public PageInfo<Class> getClassAll(SelectHelp selectHelp) {
        if(selectHelp!=null && selectHelp.getPageSize()!=null && selectHelp.getPageIndex()!=null){
            PageHelper.startPage(selectHelp.getPageIndex(),selectHelp.getPageSize());
        }
        ClassExample classExample = new ClassExample();
        List<Class> classes = classMapper.selectByExample(classExample);
        PageInfo<Class> pageInfo = new PageInfo<>(classes);

        return pageInfo;
    }

    @Override
    public List<Class> getClassAll() {
        ClassExample classExample = new ClassExample();
        List<Class> classes = classMapper.selectByExample(classExample);
        return classes;
    }

    @Override
    public Class getClass(Integer sno) {
        Class aClass = classMapper.selectByPrimaryKey(sno);
        return aClass;
    }

    @Override
    public void exportExcelAll(HttpServletRequest request, HttpServletResponse response) {
        try {

            List<Class> records = classMapper.selectByExample(new ClassExample());

            @SuppressWarnings("resource")
            HSSFWorkbook wb = new HSSFWorkbook();
            HSSFSheet sheet = wb.createSheet("班级表");

            HSSFRow row = null;

            int columnIndex = 0;

            row = sheet.createRow(0);
            row.setHeight((short) (22.50 * 20));//设置行高
            row.createCell(columnIndex).setCellValue("序列");
            row.createCell(++columnIndex).setCellValue("班级名");
            for (int i = 0; i < records.size(); i++) {
                row = sheet.createRow(i + 1);
                Class entity = records.get(i);

                columnIndex = 0;

                //row.createCell(columnIndex).setCellValue(i + 1);
                row.createCell(columnIndex).setCellValue(entity.getClId());
                row.createCell(++columnIndex).setCellValue(entity.getClName());
            }           sheet.setDefaultRowHeight((short) (16.5 * 20));

            //列宽自适应
            for (int i = 0; i <= 11; i++) {
                sheet.autoSizeColumn(i);
            }

            String title= "班级数据";

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
    public Class getClass(String className) {
        ClassExample classExample = new ClassExample();
        classExample.createCriteria().andClNameEqualTo(className);
        List<Class> classes = classMapper.selectByExample(classExample);
        if(classes!=null && !classes.isEmpty()){
            return classes.get(0);
        }
        return null;
    }
}
