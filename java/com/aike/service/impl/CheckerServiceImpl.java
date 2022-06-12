package com.aike.service.impl;

import com.aike.mapper.CheckerMapper;
import com.aike.pojo.Checker;
import com.aike.pojo.CheckerExample;
import com.aike.service.CheckerService;
import com.aike.service.vo.SelectHelp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CheckerServiceImpl implements CheckerService {
    @Resource
    CheckerMapper checkerMapper;

    @Override
    public Checker login(Integer username, String password) {
        CheckerExample checkerExample = new CheckerExample();
        checkerExample.createCriteria().andCSnoEqualTo(username);

        List<Checker> checkers = checkerMapper.selectByExample(checkerExample);
        if(!checkers.isEmpty()){
            Checker checker = checkers.get(0);
            String nowPass = checker.getcPassword();
            if(password.equals(nowPass)){
                return checker;
            }
        }
        return null;
    }

    @Override
    public PageInfo<Checker> selectAllCondition(SelectHelp selectHelp) {
        PageHelper.startPage(selectHelp.getPageIndex(),selectHelp.getPageSize());
        List<Checker> dataers = checkerMapper.selectAllCondition(selectHelp);
        PageInfo<Checker> pageInfo = new PageInfo<>(dataers);
        return pageInfo;
    }

    @Override
    public int addChecker(Checker checker) {
        int insert;
        try{
            insert = checkerMapper.insert(checker);
        }catch (Exception e){
            insert = -1;
        }
        return insert;
    }

    @Override
    public int deleteChecker(int cid) {
        int i = checkerMapper.deleteByPrimaryKey(cid);
        return i;
    }

    @Override
    public int updateChecker(Checker checker) {
        int i = checkerMapper.updateByPrimaryKey(checker);
        return i;
    }

    @Override
    //此id为学号
    public Checker selectToId(Integer id) {
        CheckerExample checkerExample = new CheckerExample();
        checkerExample.createCriteria().andCSnoEqualTo(id);
        List<Checker> checkers = checkerMapper.selectByExample(checkerExample);
        if(checkers!=null && !checkers.isEmpty()){
            Checker checker = checkers.get(0);
            return checker;
        }

        return null;
    }
}
