package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.User;
import com.aaa.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping("/queryOfa")
	public String queryOfa(User u,Model m){
		List<Map<String,Object>>list=service.queryOfa(u);
		m.addAttribute("olist", list);
		return "/before/personal";
				
	}
	
	@RequestMapping("/checkUser")
	@ResponseBody
	public int checkUser(User u) {
		return service.queryuser(u);
	}


	


}
