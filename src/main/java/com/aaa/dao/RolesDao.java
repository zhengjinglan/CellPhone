package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.roles;

/**
 * 
 * @author zjl
 * @see 角色管理接口类
 */
public interface RolesDao {

	public List<Map<String, Object>> queryAll();

	public int dels(int ids);

	public int add(int rid, int[] lids);

	public int insert(roles rol);
}
