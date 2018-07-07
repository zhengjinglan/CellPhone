package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.OrderMapper;
import com.aaa.entity.Order;
import com.aaa.entity.OrderExample;

@Service
public class OrderService {

	@Autowired
	OrderMapper maper;

	public int add(Order o) {
		return maper.insert(o);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月5日
	 * @return
	 */
	public List<Order> list(){
	    return maper.selectByExample(null);
	}
	/**
	 * @author 小黑
	 * @param fettlerId
	 * @return
	 */
	public List<Order> listByFettler(int fettlerId){
	    OrderExample exp = new OrderExample();
	    exp.createCriteria().andFettlerIdEqualTo(fettlerId);
	    return maper.selectByExample(exp);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月7日 下午2:14:37
	 *
	 * @param orderId
	 * @return
	 */
	public Order get(int orderId){
	    return maper.selectByPrimaryKey(orderId);
	}
	public List<Map<String, Object>> query(Order order, int page, int rows) {
		Integer offer = null;
		if (page != 0) {
			offer = (page - 1) * rows;
		}
		return maper.query(order, offer, rows);
	}

	public long count() {
		return maper.countByExample(null);
	}

	public int update(Order order) {
	    return maper.updateByPrimaryKeySelective(order);
	}
}
