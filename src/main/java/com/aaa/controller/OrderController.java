package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.Order;
import com.aaa.entity.User;
import com.aaa.service.OrderService;
import com.aaa.service.UserService;


@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	OrderService oservice;
	
	@Autowired
	UserService uservice;
	
	@RequestMapping("/add")
	public String add(User u,Order o){
		uservice.add(u);
		oservice.add(o);
		return "/before/macservice";
	}

}
