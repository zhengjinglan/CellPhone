package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.ConsumeItem;
import com.aaa.entity.ConsumeItemExample;
import com.aaa.entity.ConsumeItemType;

public interface ConsumeItemMapper {
    long countByExample(ConsumeItemExample example);

    int deleteByExample(ConsumeItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ConsumeItem record);

    int insertSelective(ConsumeItem record);
    
    List<ConsumeItem> selectFullByExample(@Param("example")ConsumeItemExample example,@Param("typeId")Integer typeId);
    
    List<ConsumeItem> selectByExample(ConsumeItemExample example);

    ConsumeItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ConsumeItem record, @Param("example") ConsumeItemExample example);

    int updateByExample(@Param("record") ConsumeItem record, @Param("example") ConsumeItemExample example);

    int updateByPrimaryKeySelective(ConsumeItem record);

    int updateByPrimaryKey(ConsumeItem record);
}