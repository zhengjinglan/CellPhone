package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer uid;
	private String uname;
	private String pwd;
	private Integer status;
	private Integer empid;
	private Date uptime;
	private Integer rid;
	private Integer upuid;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getUpuid() {
		return upuid;
	}

	public void setUpuid(Integer upuid) {
		this.upuid = upuid;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd
				+ ", status=" + status + ", empid=" + empid + ", uptime="
				+ uptime + ", rid=" + rid + ", upuid=" + upuid + "]";
	}

}
