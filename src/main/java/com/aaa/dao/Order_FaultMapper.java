package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Order_Fault;
import com.aaa.entity.User;

public interface Order_FaultMapper {

	int add(Order_Fault orderFault);
	List<Map<String ,Object>> queryOfa(User u);
	List<Map<String, Object>> query(Order_Fault of);
}
