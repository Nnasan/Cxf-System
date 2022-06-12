package com.aike.service;

import com.aike.pojo.Checker;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;

public interface CheckerService {
    Checker login(Integer username,String password);

    //条件全查
    PageInfo<Checker> selectAllCondition(SelectHelp selectHelp);

    //增
    int addChecker(Checker checker);

    //删
    int deleteChecker(int cid);

    //改
    int updateChecker(Checker checker);

    //单查
    Checker selectToId(Integer id);
}
