package com.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.TreeNode;
import com.aaa.entity.Users;
import com.aaa.service.LibararyService;

@Controller
@RequestMapping("lib")
public class LibararyController {

	@Autowired
	private LibararyService libService;

	@RequestMapping("getTree")
	@ResponseBody
	public List<TreeNode> getTree() {
		return libService.getTree();
	}

	@RequestMapping("getTreeByRid")
	@ResponseBody
	public List<TreeNode> getTreeByRid(HttpSession session) {
		Users u = (Users) session.getAttribute("logUser");
		return libService.getTreeByRid(u.getRid());
	}
}
