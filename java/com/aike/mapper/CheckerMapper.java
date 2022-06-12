package com.aike.mapper;

import com.aike.pojo.Checker;
import com.aike.pojo.CheckerExample;
import com.aike.service.vo.SelectHelp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckerMapper {
    int countByExample(CheckerExample example);

    int deleteByExample(CheckerExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Checker record);

    int insertSelective(Checker record);

    List<Checker> selectByExample(CheckerExample example);

    Checker selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Checker record, @Param("example") CheckerExample example);

    int updateByExample(@Param("record") Checker record, @Param("example") CheckerExample example);

    int updateByPrimaryKeySelective(Checker record);

    int updateByPrimaryKey(Checker record);

    List<Checker> selectAllCondition(SelectHelp selectHelp);
}