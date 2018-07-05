package com.aaa.dao;

import com.aaa.entity.ConsumeItemRecord;
import com.aaa.entity.ConsumeItemRecordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ConsumeItemRecordMapper {
    long countByExample(ConsumeItemRecordExample example);

    int deleteByExample(ConsumeItemRecordExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(ConsumeItemRecord record);

    int insertSelective(ConsumeItemRecord record);

    List<ConsumeItemRecord> selectByExample(ConsumeItemRecordExample example);

    ConsumeItemRecord selectByPrimaryKey(Integer recordId);

    int updateByExampleSelective(@Param("record") ConsumeItemRecord record, @Param("example") ConsumeItemRecordExample example);

    int updateByExample(@Param("record") ConsumeItemRecord record, @Param("example") ConsumeItemRecordExample example);

    int updateByPrimaryKeySelective(ConsumeItemRecord record);

    int updateByPrimaryKey(ConsumeItemRecord record);
    List<ConsumeItemRecord> selectFullByExample(@Param("example")ConsumeItemRecordExample example,@Param("orderId")Integer orderId,@Param("itemId")Integer itemId);
}