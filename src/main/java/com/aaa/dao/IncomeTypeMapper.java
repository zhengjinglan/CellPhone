package com.aaa.dao;

import com.aaa.entity.IncomeType;
import com.aaa.entity.IncomeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IncomeTypeMapper {
    long countByExample(IncomeTypeExample example);

    int deleteByExample(IncomeTypeExample example);

    int deleteByPrimaryKey(Integer incomeTypeId);

    int insert(IncomeType record);

    int insertSelective(IncomeType record);

    List<IncomeType> selectByExample(IncomeTypeExample example);

    IncomeType selectByPrimaryKey(Integer incomeTypeId);

    int updateByExampleSelective(@Param("record") IncomeType record, @Param("example") IncomeTypeExample example);

    int updateByExample(@Param("record") IncomeType record, @Param("example") IncomeTypeExample example);

    int updateByPrimaryKeySelective(IncomeType record);

    int updateByPrimaryKey(IncomeType record);
}