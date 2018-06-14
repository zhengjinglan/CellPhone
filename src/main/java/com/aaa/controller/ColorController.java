package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Color;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.ColorService;

@Controller
@RequestMapping("color")
public class ColorController {

	@Autowired
	private ColorService colorService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Color> list = colorService.queryPage(page, rows);
		long total = colorService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {
		System.out.println(ids);
		return colorService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Color c) {
		System.out.println(c);
		return colorService.add(c);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Color c) {
		System.out.println(c);
		return colorService.update(c);
	}
}
