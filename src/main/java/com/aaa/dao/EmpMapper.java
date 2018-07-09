package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Emp;
import com.aaa.entity.EmpExample;

public interface EmpMapper {
	List<Map<String, Object>> query(Emp emp, int page, int rows);

	Integer selectAll(Integer deptId);

	long countByExample(EmpExample example);

	int deleteByExample(EmpExample example);

	int deleteByPrimaryKey(Integer empId);

	int insert(Emp record);

	int insertSelective(Emp record);

	List<Emp> selectByExample(EmpExample example);

	Emp selectByPrimaryKey(Integer empId);

	int updateByExampleSelective(@Param("record") Emp record,
			@Param("example") EmpExample example);

	int updateByExample(@Param("record") Emp record,
			@Param("example") EmpExample example);

	int updateByPrimaryKeySelective(Emp record);

	int updateByPrimaryKey(Emp record);
}