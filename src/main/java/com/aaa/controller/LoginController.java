package com.aaa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Manager;
import com.aaa.service.ManagerService;

@Controller
@RequestMapping("login")
public class LoginController {

	@Autowired
	ManagerService service;

	@RequestMapping("/backLogin")
	@ResponseBody
	public int BackLogin(HttpSession session, Manager manager) {
		return service.checkUsers(manager, session);

	}

}
