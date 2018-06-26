package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Parameter;
import com.aaa.service.ParameterService;


@Controller
@RequestMapping("parameter")
public class ParameterController {

	@Autowired
	ParameterService service;
	
	@RequestMapping("/queryParameter")
	@ResponseBody
	public List<Parameter> queryParameter(Parameter p){
		return service.queryParameter(p);
		
	}
	@RequestMapping("/add")
	@ResponseBody
	public int add(Parameter p){
		return service.add(p);
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public int del(int[] ids){
		return service.del(ids);
	}
	
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(Parameter p){
		return service.update(p);
		
	}
}
