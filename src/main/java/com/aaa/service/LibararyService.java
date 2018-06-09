package com.aaa.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.LibararyDao;
import com.aaa.entity.TreeNode;
import com.aaa.entity.Users;
import com.aaa.util.EasyuiTreeByRidUtil;
import com.aaa.util.EasyuiTreeUtil;

@Service
public class LibararyService {

	@Autowired
	EasyuiTreeUtil util;
	@Autowired
	EasyuiTreeByRidUtil treeutil;
	@Autowired
	private LibararyDao libararydao;

	public List<TreeNode> getTree() {
		return util.getTree(0);
	}

	public List<TreeNode> getTreeByRid(Integer rid) {
		return treeutil.getTree(0, rid);
	}

	public List<Map<String, Object>> queryPage(Integer page, Integer rows) {
		Integer offset = null;
		if (page != null) {
			offset = (page - 1) * rows;

		}
		System.out.println("sevice" + libararydao.queryPage(page, rows));
		return libararydao.queryPage(offset, rows);
	}

	public boolean addNode(Map<String, Object> node, HttpSession session) {
		System.out.println(node.get("_parentId"));
		node.put("parentlibid", node.get("_parentId"));
		System.out.println(session.getAttribute("logUser"));
		Users u = (Users) session.getAttribute("logUser");
		System.out.println(u.getRid());
		node.put("uid", u.getRid());
		System.out.println(node);
		int i = libararydao.addNode(node);
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean updateNode(Map<String, Object> node, HttpSession session) {
		System.out.println(node.get("_parentId"));
		node.put("parentlibid", node.get("_parentId"));
		System.out.println(session.getAttribute("logUser"));
		Users u = (Users) session.getAttribute("logUser");
		System.out.println(u.getRid());
		node.put("uid", u.getRid());
		System.out.println(node);
		int rs = libararydao.updateNode(node);
		if (rs == 1) {
			return true;
		} else {
			return false;
		}
	}
}
