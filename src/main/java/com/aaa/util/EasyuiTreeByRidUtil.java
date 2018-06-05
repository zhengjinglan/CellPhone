package com.aaa.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aaa.dao.LibararyDao;
import com.aaa.entity.TreeNode;

@Component
public class EasyuiTreeByRidUtil {

	@Autowired
	private LibararyDao dao;

	public List<TreeNode> getTree(Integer paratId, Integer rid) {
		// 查询一级菜单
		List<Map<String, Object>> nodes = dao.queryByRid(paratId, rid);
		return getChildrenNodes(nodes, rid);
	}

	// 获取子节点
	private List<TreeNode> getChildrenNodes(List<Map<String, Object>> nodes,
			Integer rid) {

		List<TreeNode> nodeList = new ArrayList<TreeNode>();

		for (Map<String, Object> node : nodes) {

			TreeNode treeNode = new TreeNode();

			// 标识符
			treeNode.setId(Integer.parseInt(node.get("id").toString()));
			// 显示文本
			treeNode.setText(node.get("text").toString());
			// 图标
			treeNode.setIconCls(node.get("iconCls").toString());

			// 获取子节点
			List<Map<String, Object>> childrenNodes = dao.query(Integer
					.parseInt(node.get("id").toString()));
			treeNode.setState("open");
			// 有子节点,获取子节点的下级节点
			if (childrenNodes.size() > 0) {
				List<TreeNode> childrenlist = getChildrenNodes(childrenNodes,
						rid);
				treeNode.setChildren(childrenlist);
				// 展开状态
				// treeNode.setState("closed");
			} else {
				// 没有子节点
				Map<String, String> map = new HashMap<String, String>();
				map.put("url", node.get("url").toString());

				treeNode.setAttributes(map);
				// treeNode.setState("open");
			}

			nodeList.add(treeNode);
		}
		return nodeList;
	}
}
