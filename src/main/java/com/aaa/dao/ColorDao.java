package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Color;

public interface ColorDao {
	public List<Map<String, Object>> queryPage(Integer offset, Integer pageSize);

	public int add(Color e);

	public int update(Color e);

	public int dels(int[] ids);
}
