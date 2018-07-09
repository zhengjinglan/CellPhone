package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.EmpIncome;
import com.aaa.entity.EmpIncomeExample;

public interface EmpIncomeMapper {
	List<Map<String, Object>> query(EmpIncome emp, int page, int rows);

	long countByExample(EmpIncomeExample example);

	int deleteByExample(EmpIncomeExample example);

	int deleteByPrimaryKey(Integer incomeId);

	int insert(EmpIncome record);

	int insertSelective(EmpIncome record);

	List<EmpIncome> selectByExample(EmpIncomeExample example);

	EmpIncome selectByPrimaryKey(Integer incomeId);

	int updateByExampleSelective(@Param("record") EmpIncome record,
			@Param("example") EmpIncomeExample example);

	int updateByExample(@Param("record") EmpIncome record,
			@Param("example") EmpIncomeExample example);

	int updateByPrimaryKeySelective(EmpIncome record);

	int updateByPrimaryKey(EmpIncome record);
}