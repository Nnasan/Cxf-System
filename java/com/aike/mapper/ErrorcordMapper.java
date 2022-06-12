package com.aike.mapper;

import com.aike.pojo.Errorcord;
import com.aike.pojo.ErrorcordExample;
import com.aike.pojo.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ErrorcordMapper {
    int countByExample(ErrorcordExample example);

    int deleteByExample(ErrorcordExample example);

    int deleteByPrimaryKey(Integer erId);

    int insert(Errorcord record);

    int insertSelective(Errorcord record);

    List<Errorcord> selectByExample(ErrorcordExample example);

    Errorcord selectByPrimaryKey(Integer erId);

    int updateByExampleSelective(@Param("record") Errorcord record, @Param("example") ErrorcordExample example);

    int updateByExample(@Param("record") Errorcord record, @Param("example") ErrorcordExample example);

    int updateByPrimaryKeySelective(Errorcord record);

    int updateByPrimaryKey(Errorcord record);

    List<Record> selectNotReject();
}