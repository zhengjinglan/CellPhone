package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.EmpIncome;
import com.aaa.service.EmpIncomeService;

@Controller
@RequestMapping("income")
public class EmpIcomeController {

	@Autowired
	private EmpIncomeService incomeService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<EmpIncome> list = incomeService.queryPage(page, rows);
		long total = incomeService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<EmpIncome> queryAll(EmpIncome income) {

		return incomeService.queryAll(income);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {

		return incomeService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(EmpIncome income) {

		return incomeService.add(income);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(EmpIncome income) {

		return incomeService.update(income);
	}
}
