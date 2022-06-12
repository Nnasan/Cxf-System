package com.aike.controller;

import com.aike.service.DataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Controller
@RequestMapping("/data")
public class DataAction {

    @Resource
    DataService dataService;

    @RequestMapping("/reset")
    @ResponseBody
    public String resetData(@RequestParam("file") MultipartFile file){
        int i = dataService.resetData(file) - 1;
        return i>0 ? String.valueOf(i) : null;
    }

   /* //累加计算
    @RequestMapping("/cumulation")
    @ResponseBody
    public String cumulationData(@RequestParam("file") MultipartFile file){
        int i = dataService.cumulationData(file,dName,dSno) - 1;
        return i>0 ? String.valueOf(i) : null;
    }*/

    //累加计算
    @RequestMapping("/cumulation")
    @ResponseBody
    public String cumulationData(@RequestParam("file") MultipartFile file,
                                 @RequestParam("dName") String dName,
                                 @RequestParam("dSno") Integer dSno){
        int i = dataService.cumulationData(file,dName,dSno) - 1;
        return i>0 ? String.valueOf(i) : null;
    }
}
