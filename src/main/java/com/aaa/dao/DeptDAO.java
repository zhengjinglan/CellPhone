package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Dept;

/**
 * Dept增删改查接口
 * @author pwd
 *
 */
public interface DeptDAO {
	//查询
	public List<Dept> query();
}
