package com.aike.mapper;

import com.aike.pojo.Student;
import com.aike.pojo.StudentExample;
import com.aike.service.vo.SelectHelp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAllCondition(SelectHelp selectHelp);


}