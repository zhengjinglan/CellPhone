package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Brand;
import com.aaa.entity.Color;
import com.aaa.entity.Fault;
import com.aaa.entity.Order;
import com.aaa.entity.Order_Fault;
import com.aaa.entity.Series;
import com.aaa.entity.User;
import com.aaa.service.BrandService;
import com.aaa.service.ColorService;
import com.aaa.service.FaultService;
import com.aaa.service.ModelService;
//import com.aaa.entity.Model;
import com.aaa.service.OrderService;
import com.aaa.service.Order_FalutService;
import com.aaa.service.SeriesService;
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
	public int add(User u,Order o ,Order_Fault ofa){
		int us=uservice.add(u);
		int rs=oservice.add(o);
		ofservice.add(ofa);
		System.out.println(ofa+"***********");
		return rs;
	}
	

}
