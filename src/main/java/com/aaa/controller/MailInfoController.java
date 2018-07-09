package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.MailInfo;
import com.aaa.entity.Order;
import com.aaa.entity.Order_Fault; 
import com.aaa.entity.User;
import com.aaa.service.MailService;
import com.aaa.service.OrderService;
import com.aaa.service.Order_FalutService;
import com.aaa.service.UserService;

@Controller
@RequestMapping("mail")
public class MailInfoController { 
	
	@Autowired
	MailService mserice;
	@Autowired
	OrderService oservice;	
	@Autowired
	UserService uservice;
	@Autowired
	Order_FalutService ofservice;
	
	
	@RequestMapping("/addMail")
	@ResponseBody
	public int addMail(MailInfo m,User u,Order o ,Order_Fault ofa){
		m.setSender(u.getUserName()); 
		System.out.println("***********************************");
		System.out.println("userPhone"+u.getUserPhone());
		int us=uservice.add(u);
		int rs=oservice.add(o);
		ofservice.add(ofa);
		int ms=mserice.add(m);
		return ms;		
	}
	/**
	 * 
	 * @author lqx
	 * @date 2018年7月8日
	 * @param m
	 * @return
	 */
	@RequestMapping("/updateMail")
	@ResponseBody
	public int updateMail(MailInfo m){
		
		return mserice.update(m);
		
	}

}
