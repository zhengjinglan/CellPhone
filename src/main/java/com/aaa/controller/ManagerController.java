package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Manager;
import com.aaa.service.ManagerService;

@Controller
@RequestMapping("manager")
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@RequestMapping("getLogUsers")
	@ResponseBody
	public Manager getLogUsers(HttpSession session) {
		return (Manager) session.getAttribute("logUser");
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Manager manager) {
		return managerService.add(manager);
	}

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(Manager manager, int page, int rows) {
		List<Manager> list = managerService.queryUsers(manager, page, rows);
		long total = managerService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("query")
	@ResponseBody
	public List<Map<String, Object>> query() {

		return managerService.query();
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {
		System.out.println(ids);
		return managerService.dels(ids);
	}

	@RequestMapping("outlogin")
	public String outlogin(HttpSession session) {
		session.invalidate();
		return "back/login";
	}

	@RequestMapping("edit")
	@ResponseBody
	public int edit(Manager manager) {
		System.out.println(manager);
		return managerService.update(manager);
	}

}
