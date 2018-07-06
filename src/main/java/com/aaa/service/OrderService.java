package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.OrderMapper;
import com.aaa.entity.Order;
import com.aaa.entity.OrderExample;

@Service
public class OrderService {
	
	@Autowired
	OrderMapper maper;
	
	public int add(Order o){
		return maper.insert(o);
	}

}
