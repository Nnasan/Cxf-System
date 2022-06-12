package com.aike.controller;

import com.aike.pojo.Errorcord;
import com.aike.pojo.Record;
import com.aike.service.ErrorcordService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/errorcode")
public class ErrorcodeAction {
    @Resource
    ErrorcordService errorcordService;


    @RequestMapping("/select")
    @ResponseBody
    public PageInfo<Record> selectNotReject(SelectHelp selectHelp){
        PageInfo<Record> pageInfo = errorcordService.selectErrorAll(selectHelp);
        return pageInfo;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addReject(Errorcord errorcord){
        int i = errorcordService.addErrorcord(errorcord);
        return i>0 ? "true" : "false";
    }
}
