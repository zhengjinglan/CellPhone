package com.aaa.entity;

import java.util.Date;

/**
 * 
 * @author zjl
 * @see 颜色
 * 
 */
public class Color {
	private Integer color_id;
	private String color_name;
	private String color_code;// 颜色编码
	private Date gmt_create;// 创建时间
	private Date gmt_modified;// 修改时间
	private String operator;// 修改人

	public Color() {
		super();
	}

	public Integer getColor_id() {
		return color_id;
	}

	public void setColor_id(Integer color_id) {
		this.color_id = color_id;
	}

	public String getColor_name() {
		return color_name;
	}

	public void setColor_name(String color_name) {
		this.color_name = color_name;
	}

	public String getColor_code() {
		return color_code;
	}

	public void setColor_code(String color_code) {
		this.color_code = color_code;
	}

	public Date getGmt_create() {
		return gmt_create;
	}

	public void setGmt_create(Date gmt_create) {
		this.gmt_create = gmt_create;
	}

	public Date getGmt_modified() {
		return gmt_modified;
	}

	public void setGmt_modified(Date gmt_modified) {
		this.gmt_modified = gmt_modified;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "Color [color_id=" + color_id + ", color_name=" + color_name
				+ ", color_code=" + color_code + ", gmt_create=" + gmt_create
				+ ", gmt_modified=" + gmt_modified + ", operator=" + operator
				+ "]";
	}

}
