package com.aaa.entity;

/**
 * 
 * @author zjl
 * @see菜单
 * 
 */
public class Libarary {

	private Integer libid;
	private String lname;
	private String url;
	private String icon;
	private String parentlibid;
	private String uid;
	private String uptime;

	public Integer getLibid() {
		return libid;
	}

	public void setLibid(Integer libid) {
		this.libid = libid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getParentlibid() {
		return parentlibid;
	}

	public void setParentlibid(String parentlibid) {
		this.parentlibid = parentlibid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

}
