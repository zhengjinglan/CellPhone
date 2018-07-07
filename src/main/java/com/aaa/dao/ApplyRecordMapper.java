package com.aaa.dao;

import com.aaa.entity.ApplyRecord;
import com.aaa.entity.ApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyRecordMapper {
    long countByExample(ApplyRecordExample example);

    int deleteByExample(ApplyRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(ApplyRecord record);

    int insertSelective(ApplyRecord record);

    List<ApplyRecord> selectByExample(ApplyRecordExample example);

    ApplyRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") ApplyRecord record, @Param("example") ApplyRecordExample example);

    int updateByExample(@Param("record") ApplyRecord record, @Param("example") ApplyRecordExample example);

    int updateByPrimaryKeySelective(ApplyRecord record);

    int updateByPrimaryKey(ApplyRecord record);
}