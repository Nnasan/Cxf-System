package com.aike.controller;

import com.aike.pojo.Admin;
import com.aike.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/admin")
public class AdminAction {
    @Resource
    AdminService adminService;

    //登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(String aUsername,String aPassword){
        Admin login = adminService.login(aUsername, aPassword);
        return login!=null ? login.getaName() : null;
    }

    //更改密码
    @RequestMapping("/oneselfChangePassword")
    @ResponseBody
    public String changePass(String name,String oldPassword,String newPassword){
        Admin admin = adminService.selectToName(name);
        if(admin!=null && admin.getaPassword().equals(oldPassword)){
            admin.setaPassword(newPassword);
            int i = adminService.updateAdmin(admin);
            return i>0 ? "true" : null;
        }
        return null;
    }

    //清空数据库
    @RequestMapping("/dropStudentData")
    @ResponseBody
    public String clearStudentData(){

        return null;
    }

}
