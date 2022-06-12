package com.aike.service;


import com.aike.pojo.Student;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface StudentService {
    Student login(Integer username, String password);

    //条件全查
    PageInfo<Student> selectAllCondition(SelectHelp selectHelp);

    //全查
    List<Student> selectAll();

    //增
    int addStudent(Student student);

    //删
    int deleteStudent(int cid);

    //改
    int updateStudent(Student student);

    //单查
    Student selectToId(Integer id);

    //修改学生参数
    int updateStudentPoint(Integer sSno,Double updatescope);

    void exportExcelAll(HttpServletRequest request, HttpServletResponse response);
    void exportExcelAll(HttpServletRequest request, HttpServletResponse response,String className);

}
