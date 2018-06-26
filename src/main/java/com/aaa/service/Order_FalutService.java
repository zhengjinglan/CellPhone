package com.aaa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Order_FaultMapper;
import com.aaa.entity.Order_Fault;

@Service
public class Order_FalutService {

	@Autowired
	Order_FaultMapper maper;
	
	public int add(Order_Fault o){
		
		return maper.add(o);
		
	}
	
}
