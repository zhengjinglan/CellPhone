package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Model;
import com.aaa.service.ModelService;

@Controller
@RequestMapping("model")
public class ModelController {
	@Autowired
	private ModelService modelService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Model> list = modelService.queryPage(page, rows);
		long total = modelService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(int[] ids) {
		return modelService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Model model) {
		System.out.println(model);
		return modelService.add(model);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Model model) {
		return modelService.update(model);
	}
}