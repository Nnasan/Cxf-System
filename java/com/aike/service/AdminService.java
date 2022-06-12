package com.aike.service;

import com.aike.pojo.Admin;

public interface AdminService {
    Admin login(String username,String password);

    Admin selectToName(String name);

    int updateAdmin(Admin admin);
}
