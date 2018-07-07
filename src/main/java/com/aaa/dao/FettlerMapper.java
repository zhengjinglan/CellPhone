package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Fettler;
import com.aaa.entity.FettlerExample;

public interface FettlerMapper {

	List<Map<String, Object>> queryByState();

	List<Map<String, Object>> query(String empName, int page, int rows);

	List<Map<String, Object>> queryAll();

	long countByExample(FettlerExample example);

	int deleteByExample(FettlerExample example);

	int deleteByPrimaryKey(Integer fettlerId);

	int insert(Fettler record);

	int insertSelective(Fettler record);

	List<Fettler> selectByExample(FettlerExample example);

	Fettler selectByPrimaryKey(Integer fettlerId);

	int updateByExampleSelective(@Param("record") Fettler record,
			@Param("example") FettlerExample example);

	int updateByExample(@Param("record") Fettler record,
			@Param("example") FettlerExample example);

	int updateByPrimaryKeySelective(Fettler record);

	int updateByPrimaryKey(Fettler record);
}