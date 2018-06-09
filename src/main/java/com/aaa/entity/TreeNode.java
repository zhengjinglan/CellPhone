package com.aaa.entity;

import java.util.List;
import java.util.Map;

public class TreeNode {

	private Integer id;// 绑定节点的标识值。
	private String text;// 显示的节点文本。
	private String iconCls;// 显示的节点图标CSS类ID
	private String state;// 节点状态，'open' 或 'closed'
	private Map<String, String> attributes;// 绑定该节点的自定义属性。
	private List<TreeNode> children;// 子节点

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", text=" + text + ", iconCls=" + iconCls
				+ ", state=" + state + ", attributes=" + attributes
				+ ", children=" + children + "]";
	}

}
