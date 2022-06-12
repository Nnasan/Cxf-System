package com.aike.service;

import com.aike.pojo.Dataer;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;

public interface DataerService {
    Dataer login(Integer username, String password);

    //条件全查
    PageInfo<Dataer> selectAllCondition(SelectHelp selectHelp);

    //增
    int addDataer(Dataer dataer);

    //删
    int deleteDataer(int cid);

    //改
    int updateDataer(Dataer dataer);

    //单查
    Dataer selectToId(Integer id);

}
