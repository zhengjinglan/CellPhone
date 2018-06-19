package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaa.entity.Brand;
import com.aaa.entity.Color;
import com.aaa.entity.Fault;
import com.aaa.entity.Order;
import com.aaa.entity.Series;
import com.aaa.entity.User;
import com.aaa.service.ColorService;
import com.aaa.service.FaultService;
import com.aaa.service.ModelService;
//import com.aaa.entity.Model;
import com.aaa.service.OrderService;
import com.aaa.service.UserService;


@Controller
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	OrderService oservice;
	
	@Autowired
	UserService uservice;
/*	@Autowired
	SeriesSerice sservice;*/
	@Autowired
	FaultService fservice;
/*	@Autowired
	BrandService bservice;*/
	@Autowired
	ModelService mservice;
	@Autowired
	ColorService cservice;
	
	
	
	@RequestMapping("/add")
	public String add(User u,Order o){
		uservice.add(u);
		oservice.add(o);
		return "city";
	}
	
	//初始加载数据
	@RequestMapping("/query")
	public String query(Model m,Brand b,Series s, Fault f, com.aaa.entity.Model model,Color c){
		//List<Brand> blist=bservice.queryBrand(b);
		//List<Series> slist=sservice.querySeries(s);
		List<com.aaa.entity.Model> mlist=mservice.queryAll(model);
		List<Fault> flist=fservice.queryAll(f);
		List<Color> clist=cservice.queryAll(c);
		//m.addAttribute("blist", blist);
		//m.addAttribute("slist", slist);
		m.addAttribute("mlist", mlist);
		m.addAttribute("flist", flist);
		m.addAttribute("clist", clist);
		
		return "/before/macservice";
	}

}
