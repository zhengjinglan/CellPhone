package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Manager;
import com.aaa.entity.TreeNode;
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
		Manager u = (Manager) session.getAttribute("logUser");
		return libService.getTreeByRid(u.getRid());
	}

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {

		List<Map<String, Object>> libarary = libService.queryPage(page, rows);
		long total = libService.queryPage(null, null).size();
		return new EasyuiPage(libarary, total);

	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Map<String, Object>> queryAll() {
		return libService.queryPage(null, null);
	}

	// 接收json字符串
	@RequestMapping("addNode")
	@ResponseBody
	public boolean addNode(@RequestBody Map<String, Object> node,
			HttpSession session) {

		return libService.addNode(node, session);
	}

	@RequestMapping("updateNode")
	@ResponseBody
	public boolean updateNode(@RequestBody Map<String, Object> node,
			HttpSession session) {
		System.out.println("1111111");
		System.out.println("update lib" + libService.updateNode(node, session));
		return libService.updateNode(node, session);
	}
}
