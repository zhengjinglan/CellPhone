package com.aaa.dao;

import com.aaa.entity.EmpIncome;
import com.aaa.entity.EmpIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpIncomeMapper {
    long countByExample(EmpIncomeExample example);

    int deleteByExample(EmpIncomeExample example);

    int deleteByPrimaryKey(Integer incomeId);

    int insert(EmpIncome record);

    int insertSelective(EmpIncome record);

    List<EmpIncome> selectByExample(EmpIncomeExample example);

    EmpIncome selectByPrimaryKey(Integer incomeId);

    int updateByExampleSelective(@Param("record") EmpIncome record, @Param("example") EmpIncomeExample example);

    int updateByExample(@Param("record") EmpIncome record, @Param("example") EmpIncomeExample example);

    int updateByPrimaryKeySelective(EmpIncome record);

    int updateByPrimaryKey(EmpIncome record);
}