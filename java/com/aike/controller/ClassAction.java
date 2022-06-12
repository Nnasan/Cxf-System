package com.aike.controller;

import com.aike.pojo.Class;
import com.aike.service.ClassService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassAction {

    @Resource
    ClassService classService;

    @RequestMapping("/select")
    @ResponseBody
    public PageInfo selectClass(SelectHelp selectHelp){
        PageInfo<Class> classAll = classService.getClassAll(selectHelp);
        return classAll;
    }

    @RequestMapping("/selectall")
    @ResponseBody
    public List<Class> selectALLClass(){
        List<Class> classAll = classService.getClassAll();
       /* for(Class c : classAll){
            System.out.println(c);
        }*/
        return classAll;
    }

    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) {
        classService.exportExcelAll(request,response);
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadExcel(@RequestParam("file") MultipartFile file) {
        System.out.println(file.getSize());
        return null;
    }
}
