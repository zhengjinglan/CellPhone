package com.aaa.dao;

import com.aaa.entity.FaultType;
import com.aaa.entity.FaultTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultTypeMapper {
    long countByExample(FaultTypeExample example);

    int deleteByExample(FaultTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(FaultType record);

    int insertSelective(FaultType record);

    List<FaultType> selectByExample(FaultTypeExample example);

    FaultType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") FaultType record, @Param("example") FaultTypeExample example);

    int updateByExample(@Param("record") FaultType record, @Param("example") FaultTypeExample example);

    int updateByPrimaryKeySelective(FaultType record);

    int updateByPrimaryKey(FaultType record);
}