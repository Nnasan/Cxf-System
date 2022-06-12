package com.aike.controller;

import com.aike.pojo.Checker;
import com.aike.service.CheckerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/checker")
public class CheckerAction {

    @Resource
    CheckerService checkerService;
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

        Checker login = checkerService.login(sno, aPassword);
        return login!=null ? login.getcName() : null;
    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(@RequestBody Checker checker){
        int i = checkerService.addChecker(checker);
        return i>0 ? "true" : null;
    }

    @RequestMapping("/changepass")
    @ResponseBody
    //修改密码
    public String changePass(@RequestBody Checker tableData){
        int i = checkerService.updateChecker(tableData);
        return i>0 ? "true" : null;
    }

    @RequestMapping("/delete")
    @ResponseBody
    //删除账户
    public String delete(@RequestBody Checker tableData){
        int i = checkerService.deleteChecker(tableData.getcId());
        return i>0 ? "true" : null;
    }
    @RequestMapping("/oneselfChangePassword")
    @ResponseBody
    //自行修改密码
    public String oneselfChangePassword(@RequestParam(value = "name") Integer name, String oldPassword, String newPassword){
        Checker checker = checkerService.selectToId(name);
        if(checker!=null && checker.getcPassword().equals(oldPassword)){
            checker.setcPassword(newPassword);
            int i = checkerService.updateChecker(checker);
            return i>0 ? "true" : null;
        }
        return null;
    }

}
