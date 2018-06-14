package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.FaultType;
import com.aaa.service.FaultTypeService;

@Controller
@RequestMapping("faultType")
public class FaultTypeController {
	@Autowired
	private FaultTypeService faultService;

	@RequestMapping("/add")
	@ResponseBody
	public int add(FaultType faultType) {
		System.out.println(faultType);
		return faultService.add(faultType);
	}

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<FaultType> list = faultService.queryPage(page, rows);
		Long total = (long) faultService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<FaultType> queryAll(FaultType faultType) {

		return faultService.queryAll(faultType);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(int[] ids) {
		return faultService.dels(ids);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(FaultType fault) {
		return faultService.update(fault);
	}
}
