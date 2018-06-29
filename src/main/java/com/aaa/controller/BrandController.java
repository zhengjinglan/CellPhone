package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Brand;
import com.aaa.service.BrandService;

@Controller
@RequestMapping("brand")
public class BrandController {

	@Autowired
	BrandService service;

	@RequestMapping("/queryBrand")
	@ResponseBody
	public List<Brand> queryBrand(Brand b) {
		return service.queryBrand(b);

	}

	@RequestMapping("/add")
	@ResponseBody
	public int add(Brand b) {
		System.out.println(b);
		return service.add(b);
	}

	@RequestMapping("/del")
	@ResponseBody
	public int del(int[] ids) {
		return service.del(ids);
	}

	@RequestMapping("/update")
	@ResponseBody
	public int update(Brand b) {
		return service.update(b);
	}

}
