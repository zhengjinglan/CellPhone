package com.aaa.dao;

import com.aaa.entity.ConsumeItemType;
import com.aaa.entity.ConsumeItemTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumeItemTypeMapper {
    long countByExample(ConsumeItemTypeExample example);

    int deleteByExample(ConsumeItemTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(ConsumeItemType record);

    int insertSelective(ConsumeItemType record);

    List<ConsumeItemType> selectByExample(ConsumeItemTypeExample example);

    ConsumeItemType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") ConsumeItemType record, @Param("example") ConsumeItemTypeExample example);

    int updateByExample(@Param("record") ConsumeItemType record, @Param("example") ConsumeItemTypeExample example);

    int updateByPrimaryKeySelective(ConsumeItemType record);

    int updateByPrimaryKey(ConsumeItemType record);
}