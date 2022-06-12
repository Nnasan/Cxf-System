package com.aike.service;

import com.aike.pojo.Class;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ClassService {
    PageInfo<Class> getClassAll(SelectHelp selectHelp);

    List<Class> getClassAll();

    Class getClass(Integer sno);

    Class getClass(String className);

    void exportExcelAll(HttpServletRequest request, HttpServletResponse response);
}
