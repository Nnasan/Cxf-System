package com.aike.service.impl;

import com.aike.mapper.ErrorcordMapper;
import com.aike.pojo.Errorcord;
import com.aike.pojo.Record;
import com.aike.service.ErrorcordService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ErrorcordServiceImpl implements ErrorcordService {
    @Resource
    ErrorcordMapper errorcordMapper;

    @Override
    public PageInfo<Record> selectErrorAll(SelectHelp selectHelp) {
        PageHelper.startPage(selectHelp.getPageIndex(),selectHelp.getPageSize());
        List<Record> errorcords = errorcordMapper.selectNotReject();
        PageInfo<Record> pageInfo = new PageInfo<>(errorcords);
        return pageInfo;
    }

    @Override
    public int addErrorcord(Errorcord errorcord) {
        int insert;
        try{
            insert = errorcordMapper.insertSelective(errorcord);
        }catch (Exception e){
           insert = -1;
        }
        return insert;
    }
}
