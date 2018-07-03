package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Emp;
import com.aaa.service.EmpService;

@Controller
@RequestMapping("emp")
public class EmpController {

	@Autowired
	private EmpService empService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Emp> list = empService.queryPage(page, rows);
		long total = empService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Emp> queryAll(Emp emp) {

		return empService.queryAll(emp);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {
		System.out.println(ids);
		return empService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Emp emp) {
		System.out.println(emp);
		return empService.add(emp);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Emp emp) {
		System.out.println(emp);
		return empService.update(emp);
	}
}
