package com.aaa.entity;

import java.util.Date;

public class roles {
	private Integer rid;
	private String rname;
	private Integer uid;
	private Date uptime;

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	@Override
	public String toString() {
		return "roles [rid=" + rid + ", rname=" + rname + ", uid=" + uid
				+ ", uptime=" + uptime + "]";
	}

}
