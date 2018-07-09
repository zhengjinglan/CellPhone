package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Order;
import com.aaa.entity.OrderExample;

public interface OrderMapper {
	/*
	 * 订单季度报表
	 */
	public List<Map<String, Object>> OrderReport();
	/*
	 * 订单月份报表
	 */
	public List<Map<String, Object>> OrderReportMonth();
	
	List<Map<String, Object>> query(Order order, int page, int rows);

	long countByExample(OrderExample example);

	int deleteByExample(OrderExample example);

	int deleteByPrimaryKey(Integer orderId);

	int insert(Order record);

	int insertSelective(Order record);

	List<Order> selectByExample(OrderExample example);

	Order selectByPrimaryKey(Integer orderId);

	int updateByExampleSelective(@Param("record") Order record,
			@Param("example") OrderExample example);

	int updateByExample(@Param("record") Order record,
			@Param("example") OrderExample example);

	int updateByPrimaryKeySelective(Order record);

	int updateByPrimaryKey(Order record);
}