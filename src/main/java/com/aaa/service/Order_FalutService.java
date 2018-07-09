package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.Order_FaultMapper;
import com.aaa.entity.Order_Fault;

@Service
public class Order_FalutService {

	@Autowired
	Order_FaultMapper maper;

		/**
		 *
		 * @author lqx
		 * @date 2018年7月5日
		 * @param o
		 * @return
		 */
	public int add(Order_Fault o){

		return maper.add(o);

	}

	/**
	 *
	 * @author zjl
	 * @date 2018年7月7日 下午4:04:42
	 * @return
	 */
	public List<Map<String, Object>> query(Order_Fault of) {
		return maper.query(of);
	}

}
