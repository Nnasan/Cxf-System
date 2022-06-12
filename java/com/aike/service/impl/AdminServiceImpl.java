package com.aike.service.impl;

import com.aike.mapper.AdminMapper;
import com.aike.pojo.Admin;
import com.aike.pojo.AdminExample;
import com.aike.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAUsernameEqualTo(username);

        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if(!admins.isEmpty()){
            Admin admin = admins.get(0);
            String nowPass = admin.getaPassword();
            if(password.equals(nowPass)){
                return admin;
            }
        }
        return null;
    }

    @Override
    public Admin selectToName(String name) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAUsernameEqualTo(name);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if(admins!=null && !admins.isEmpty()){
            return admins.get(0);
        }
        return null;
    }

    @Override
    public int updateAdmin(Admin admin) {
        int i = adminMapper.updateByPrimaryKey(admin);
        return i;
    }
}
