package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Order;
import com.aaa.entity.Order_Fault;
import com.aaa.entity.User;
//import com.aaa.entity.Model;
import com.aaa.service.OrderService;
import com.aaa.service.Order_FalutService;
import com.aaa.service.UserService;

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService oservice;
	@Autowired
	UserService uservice;
	@Autowired
	Order_FalutService ofservice;

	@RequestMapping("/add")
	@ResponseBody
	public int add(User u, Order o, Order_Fault ofa) {
		int us = uservice.add(u);
		int rs = oservice.add(o);
		ofservice.add(ofa);
		System.out.println(ofa);
		return rs;
	}

	@RequestMapping("query")
	@ResponseBody
	public EasyuiPage query(Order order, int page, int rows) {
		List<Map<String, Object>> list = oservice.query(order, page, rows);
		long total = oservice.count();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("update")
	@ResponseBody
	public int query(Order order) {

		return oservice.update(order);
	}

}
