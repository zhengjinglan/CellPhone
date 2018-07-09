package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.IncomeType;
import com.aaa.service.IncomeTypeService;

@Controller
@RequestMapping("incomeType")
public class IcomeTypeController {

	@Autowired
	private IncomeTypeService incomeService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<IncomeType> list = incomeService.queryPage(page, rows);
		long total = incomeService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<IncomeType> queryAll(IncomeType income) {

		return incomeService.queryAll(income);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {

		return incomeService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(IncomeType income) {

		return incomeService.add(income);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(IncomeType income) {

		return incomeService.update(income);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月10日 上午2:35:50
	 * @see com.aaa.controller.CompanyController#existCompanyName(String)
	 * @param incomeTypeName
	 * @return
	 */
	public boolean existIncomeTypeName(String incomeTypeName){
	    return incomeService.existIncomeTypeName(incomeTypeName);
	}
}
