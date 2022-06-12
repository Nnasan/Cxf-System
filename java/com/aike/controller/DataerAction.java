package com.aike.controller;

import com.aike.pojo.Dataer;
import com.aike.service.DataerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/dataer")
public class DataerAction {

    @Resource
    DataerService dataerService;
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
        Dataer login = dataerService.login(sno, aPassword);
        return login!=null ? login.getdName() : null;
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestBody Dataer dataer){
        //System.out.println(dataer);
        int i = dataerService.addDataer(dataer);
        return i>0 ? "true" : null;
    }

    @RequestMapping("/changepass")
    @ResponseBody
    //修改密码
    public String changePass(@RequestBody Dataer tableData){
        int i = dataerService.updateDataer(tableData);
        return i>0 ? "true" : null;

    }

    @RequestMapping("/delete")
    @ResponseBody
    //删除账户
    public String delete(@RequestBody Dataer tableData){
        int i = dataerService.deleteDataer(tableData.getdId());
        return i>0 ? "true" : null;
    }

    @RequestMapping("/oneselfChangePassword")
    @ResponseBody
    //自行修改密码
    public String oneselfChangePassword(@RequestParam(value = "name") Integer name, String oldPassword, String newPassword){
        Dataer dataer = dataerService.selectToId(name);
        if(dataer!=null && dataer.getdPassword().equals(oldPassword)){
            dataer.setdPassword(newPassword);
            int i = dataerService.updateDataer(dataer);
            return i>0 ? "true" : null;
        }
        return null;
    }





}
