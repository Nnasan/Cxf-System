package com.aike.controller;

import com.aike.pojo.Record;
import com.aike.service.RecordService;
import com.aike.service.vo.SelectRecord;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/record")
public class RecordAction {

    @Resource
    RecordService recordService;

    @RequestMapping("/selectAllCondition")
    @ResponseBody
    public PageInfo selectAllCondition(SelectRecord selectRecord){
        PageInfo<Record> pageInfo = recordService.selectAllCondition(selectRecord);
        return pageInfo;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Record record){
        int insert = recordService.dataerInsert(record);
        return insert>0 ? "true" : null;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Record record){
        int delete = recordService.delete(record.getrId());
        return delete>0 ? "true" : null;
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(Record record){
        int delete = recordService.update(record);
        return delete>0 ? "true" : null;
    }

    @RequestMapping("/checkerUpdate")
    @ResponseBody
    public String checkerUpdate(@RequestBody Record record){
        //System.out.println(record);
        int delete = recordService.checkerUpdate(record);
        return delete>0 ? "true" : null;
    }

    @RequestMapping("/checkerAll")
    @ResponseBody
    public String checkerAll(Integer cSno){
        boolean isOk = recordService.checkerAll(cSno);
        return isOk ? "true" : null;
    }



}
