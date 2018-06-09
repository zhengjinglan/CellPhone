package com.aaa.dao;

import com.aaa.entity.Fault;
import com.aaa.entity.FaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FaultMapper {
    long countByExample(FaultExample example);

    int deleteByExample(FaultExample example);

    int deleteByPrimaryKey(Integer faultId);

    int insert(Fault record);

    int insertSelective(Fault record);

    List<Fault> selectByExample(FaultExample example);

    Fault selectByPrimaryKey(Integer faultId);

    int updateByExampleSelective(@Param("record") Fault record, @Param("example") FaultExample example);

    int updateByExample(@Param("record") Fault record, @Param("example") FaultExample example);

    int updateByPrimaryKeySelective(Fault record);

    int updateByPrimaryKey(Fault record);
}