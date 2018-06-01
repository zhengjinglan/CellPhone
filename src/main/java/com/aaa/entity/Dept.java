package com.aaa.entity;

/**
 * 部门实体类
 * @author pwd
 *
 */
public class Dept {
	private Integer deptId;
	private String deptName;
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
