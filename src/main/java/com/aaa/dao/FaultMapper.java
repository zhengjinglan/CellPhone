package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Fault;
import com.aaa.entity.FaultExample;

public interface FaultMapper {

    List<Map<String, Object>> queryPage(Fault fault, Integer page, Integer rows);

    long countByExample(FaultExample example);

    int deleteByExample(FaultExample example);

    int deleteByPrimaryKey(Integer faultId);

    int insert(Fault record);

    int insertSelective(Fault record);

    List<Fault> selectByExample(FaultExample example);

    Fault selectByPrimaryKey(Integer faultId);

    int updateByExampleSelective(@Param("record") Fault record,
            @Param("example") FaultExample example);

    int updateByExample(@Param("record") Fault record,
            @Param("example") FaultExample example);

    int updateByPrimaryKeySelective(Fault record);

    int updateByPrimaryKey(Fault record);

    List<Fault> selectFullByExample(FaultExample fault, Integer typeId);
    List<Fault> queryFault(Fault f);
}