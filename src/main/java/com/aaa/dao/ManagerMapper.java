package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Manager;
import com.aaa.entity.ManagerExample;

public interface ManagerMapper {
	List<Map<String, Object>> query();

	long countByExample(ManagerExample example);

	int deleteByExample(ManagerExample example);

	int deleteByPrimaryKey(Integer uid);

	int insert(Manager record);

	int insertSelective(Manager record);

	List<Manager> selectByExample(ManagerExample example);

	Manager selectByPrimaryKey(Integer uid);

	int updateByExampleSelective(@Param("record") Manager record,
			@Param("example") ManagerExample example);

	int updateByExample(@Param("record") Manager record,
			@Param("example") ManagerExample example);

	int updateByPrimaryKeySelective(Manager record);

	int updateByPrimaryKey(Manager record);
}