package com.aaa.entity;

import java.util.List;

/**
 * 
 * @author zjl
 * @see eazyui分页数据实体类
 */

@SuppressWarnings("rawtypes")
public class EasyuiPage {

	private List rows;// 显示的数据
	private Long total;// 总条数

	public EasyuiPage() {
		super();
	}

	public EasyuiPage(List rows, Long total) {
		super();
		this.rows = rows;
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
