package com.aaa.dao;

import com.aaa.entity.Assessment;
import com.aaa.entity.AssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessmentMapper {
    long countByExample(AssessmentExample example);

    int deleteByExample(AssessmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    List<Assessment> selectByExample(AssessmentExample example);

    Assessment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Assessment record, @Param("example") AssessmentExample example);

    int updateByExample(@Param("record") Assessment record, @Param("example") AssessmentExample example);

    int updateByPrimaryKeySelective(Assessment record);

    int updateByPrimaryKey(Assessment record);
}