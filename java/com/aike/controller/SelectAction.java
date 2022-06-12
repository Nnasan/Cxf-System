package com.aike.controller;


import com.aike.pojo.Checker;
import com.aike.pojo.Dataer;
import com.aike.pojo.Student;
import com.aike.service.CheckerService;
import com.aike.service.ClassService;
import com.aike.service.DataerService;
import com.aike.service.StudentService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/select")
public class SelectAction {
    @Resource
    CheckerService checkerService;
    @Resource
    DataerService dataerService;
    @Resource
    StudentService studentService;
    @Resource
    ClassService classService;

    @RequestMapping("/student")
    @ResponseBody
    public PageInfo selectStudent(SelectHelp selectHelp){
        //System.out.println(selectHelp);
        PageInfo<Student> students = studentService.selectAllCondition(selectHelp);;
        return students;
    }

    @RequestMapping("/studentAll")
    @ResponseBody
    public List<Student> selectStudent(){
        List<Student> students = studentService.selectAll();
        return students;
    }

    @RequestMapping("/dataer")
    @ResponseBody
    public PageInfo selectDataer(SelectHelp selectHelp){
        PageInfo<Dataer> dataer = dataerService.selectAllCondition(selectHelp);
        return dataer;
    }

    @RequestMapping("/checker")
    @ResponseBody
    public PageInfo selectChecker(SelectHelp selectHelp){
        PageInfo<Checker> checker = checkerService.selectAllCondition(selectHelp);
        return checker;
    }

    @RequestMapping("/selectIdToClass")
    @ResponseBody
    //通过班级找到所有学生
    public PageInfo selectIdToClass(@RequestParam Integer dSno, SelectHelp selectHelp){
        Student student = studentService.selectToId(dSno);
        selectHelp.setClassname(student.getsClass().getClName());
        PageInfo<Student> pageInfo = studentService.selectAllCondition(selectHelp);
        return pageInfo;
    }

}
