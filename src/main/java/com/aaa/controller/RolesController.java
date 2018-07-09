package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.roles;
import com.aaa.service.RolesService;

@Controller
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private RolesService rolesService;

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Map<String, Object>> queryAll() {
		// System.out.println(rolesService.queryAll());
		return rolesService.queryAll();
	}

	@RequestMapping("savePermission")
	@ResponseBody
	public int savePermission(Integer rid, int[] lids) {
		System.out.println("rid:" + rid);
		System.out.println("lids:" + lids);
		// 先删除该角色原来的所有信息
		Integer ls = rolesService.dels(rid);
		// 保存新权限
		int rs = rolesService.add(rid, lids);
		return rs;
	}

	@RequestMapping("insert")
	@ResponseBody
	public int insert(roles rol) {
		return rolesService.insert(rol);
	}
}
