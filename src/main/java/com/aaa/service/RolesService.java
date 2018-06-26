package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.RolesDao;
import com.aaa.entity.roles;

/**
 * 
 * @author zjl
 * @see 角色管理业务逻辑层
 */
@Service
public class RolesService {

	@Autowired
	RolesDao rolesDao;

	public List<Map<String, Object>> queryAll() {
		return rolesDao.queryAll();
	}

	public int dels(int id) {
		int rs = rolesDao.dels(id);
		if (rs == 1) {
			return 0;// 成功
		} else {
			return -1;// 失败
		}
	}

	public int add(int rid, int[] list) {
		int rs = rolesDao.add(rid, list);
		if (rs > 0) {
			return 0;
		} else {
			return -1;
		}
	}

	public int insert(roles rol) {
		int rs = rolesDao.insert(rol);
		if (rs == 1) {
			return 0;
		} else {
			return -1;
		}
	}

}
