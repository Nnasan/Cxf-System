package com.aike.service.impl;

import com.aike.mapper.DataerMapper;
import com.aike.pojo.Dataer;
import com.aike.pojo.DataerExample;
import com.aike.service.DataerService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataerServiceImpl implements DataerService {
    @Resource
    DataerMapper dataerMapper;

    @Override
    public Dataer login(Integer username, String password) {
        DataerExample dataerExample = new DataerExample();
        dataerExample.createCriteria().andDSnoEqualTo(username);
        List<Dataer> dataers = dataerMapper.selectByExample(dataerExample);
        if(!dataers.isEmpty()){
            Dataer dataer = dataers.get(0);
            String nowPass = dataer.getdPassword();
            if(password.equals(nowPass)){
                return dataer;
            }
        }
        return null;
    }

    @Override
    public PageInfo<Dataer> selectAllCondition(SelectHelp selectHelp) {
        PageHelper.startPage(selectHelp.getPageIndex(),selectHelp.getPageSize());
        List<Dataer> dataers = dataerMapper.selectAllCondition(selectHelp);
        PageInfo<Dataer> pageInfo = new PageInfo<>(dataers);
        return pageInfo;
    }

    @Override
    public int addDataer(Dataer dataer) {

        int insert;
        try{
            insert = dataerMapper.insert(dataer);
        }catch (Exception e){
            insert = -1;
        }
        return insert;
    }

    @Override
    public int deleteDataer(int did) {
        int i = dataerMapper.deleteByPrimaryKey(did);
        return i;
    }

    @Override
    public int updateDataer(Dataer dataer) {
        int i = dataerMapper.updateByPrimaryKey(dataer);
        return i;
    }

    @Override
    public Dataer selectToId(Integer id) {
        DataerExample dataerExample = new DataerExample();
        dataerExample.createCriteria().andDSnoEqualTo(id);
        List<Dataer> dataers = dataerMapper.selectByExample(dataerExample);
        if(dataers!=null && !dataers.isEmpty()){
            Dataer dataer = dataers.get(0);
            return dataer;
        }
        return null;
    }

}
