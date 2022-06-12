package com.aike.controller;

import com.aike.pojo.Student;
import com.aike.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/student")
public class StudentAction {

    @Resource
    StudentService studentService;
    //登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(String aUsername,String aPassword ){
        Integer sno;
        try{
            sno = Integer.parseInt(aUsername);
        }catch (Exception e){
            return null;
        }
        Student login = studentService.login(sno, aPassword);
        return login!=null ? login.getsName() : null;
    }

    @RequestMapping("/oneselfChangePassword")
    @ResponseBody
    //自行修改密码
    public String oneselfChangePassword(@RequestParam(value = "name") Integer name, String oldPassword, String newPassword){
        Student student = studentService.selectToId(name);
        if(student!=null && student.getsPassword().equals(oldPassword)){
            student.setsPassword(newPassword);
            int i = studentService.updateStudent(student);
            return i>0 ? "true" : null;
        }
        return null;
    }

    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        studentService.exportExcelAll(request,response);
    }

    @RequestMapping("/exportExcelCondition")
    public void exportExcelCondition(String className, HttpServletRequest request, HttpServletResponse response) {
        studentService.exportExcelAll(request,response,className);
    }

}


