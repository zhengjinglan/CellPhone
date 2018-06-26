package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Fault;
import com.aaa.service.FaultService;

@Controller
@RequestMapping("fault")
public class FaultController {
	@Autowired
	private FaultService faultService;

	@RequestMapping("/add")
	@ResponseBody
	public int add(Fault fault) {
		System.out.println(fault);
		return faultService.add(fault);
	}

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Fault> list = faultService.queryPage(page, rows);
		Long total = (long) faultService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("query")
	@ResponseBody
	public EasyuiPage query(Fault fault, int page, int rows) {
		List<Map<String, Object>> list = faultService.query(fault, page, rows);
		System.out.println(list);
		Long total = (long) faultService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(int[] ids) {
		return faultService.dels(ids);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Fault fault) {
		return faultService.update(fault);
	}
}
