package com.aike.mapper;

import com.aike.pojo.Class;
import com.aike.pojo.Dataer;
import com.aike.pojo.DataerExample;
import com.aike.service.vo.SelectHelp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataerMapper {
    int countByExample(DataerExample example);

    int deleteByExample(DataerExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Dataer record);

    int insertSelective(Dataer record);

    List<Dataer> selectByExample(DataerExample example);

    Dataer selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Dataer record, @Param("example") DataerExample example);

    int updateByExample(@Param("record") Dataer record, @Param("example") DataerExample example);

    int updateByPrimaryKeySelective(Dataer record);

    int updateByPrimaryKey(Dataer record);

    List<Dataer> selectAllCondition(SelectHelp selectHelp);

    Class selectIdToClass(Integer sno);
}