package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Model;
import com.aaa.entity.ModelExample;

public interface ModelMapper {
	List<Map<String, Object>> query(Model model, int page, int rows);

	long countByExample(ModelExample example);

	int deleteByExample(ModelExample example);

	int deleteByPrimaryKey(Integer modelId);

	int insert(Model record);

	int insertSelective(Model record);

	List<Model> selectByExample(ModelExample example);

	Model selectByPrimaryKey(Integer modelId);

	int updateByExampleSelective(@Param("record") Model record,
			@Param("example") ModelExample example);

	int updateByExample(@Param("record") Model record,
			@Param("example") ModelExample example);

	int updateByPrimaryKeySelective(Model record);

	int updateByPrimaryKey(Model record);
}