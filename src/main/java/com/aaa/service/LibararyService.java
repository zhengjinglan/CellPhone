package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.entity.TreeNode;
import com.aaa.util.EasyuiTreeByRidUtil;
import com.aaa.util.EasyuiTreeUtil;

@Service
public class LibararyService {

	@Autowired
	EasyuiTreeUtil util;
	@Autowired
	EasyuiTreeByRidUtil treeutil;

	public List<TreeNode> getTree() {
		return util.getTree(0);
	}

	public List<TreeNode> getTreeByRid(Integer rid) {
		return treeutil.getTree(0, rid);
	}
}
