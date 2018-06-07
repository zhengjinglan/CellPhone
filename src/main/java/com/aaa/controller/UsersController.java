package com.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Users;
import com.aaa.service.UsersService;

@Controller
@RequestMapping("users")
public class UsersController {

	@Autowired
	private UsersService userService;

	@RequestMapping("getLogUsers")
	@ResponseBody
	public Users getLogUsers(HttpSession session) {
		return (Users) session.getAttribute("logUser");
	}

	@RequestMapping("queryUsers")
	@ResponseBody
	public List<Users> queryUsers(Users u) {
		return userService.queryUsers(u);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Users u) {
		return userService.update(u);
	}

	@RequestMapping("outlogin")
	public String outlogin(HttpSession session) {
		session.invalidate();
		return "back/login";
	}

}
