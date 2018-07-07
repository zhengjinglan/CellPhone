package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.User;
import com.aaa.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@ResponseBody
	@RequestMapping("queryUser")
	public List<User> queryUser(){
		return service.queryUser();
	}

}
