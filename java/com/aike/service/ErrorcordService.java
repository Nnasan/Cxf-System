package com.aike.service;

import com.aike.pojo.Errorcord;
import com.aike.pojo.Record;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageInfo;


public interface ErrorcordService {
    //查询未被驳回的错误数据
    PageInfo<Record> selectErrorAll(SelectHelp selectHelp);

    //增加错误记录
    int addErrorcord(Errorcord errorcord);
}
