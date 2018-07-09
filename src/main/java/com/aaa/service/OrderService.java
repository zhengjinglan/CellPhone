package com.aaa.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.OrderMapper;
import com.aaa.entity.Fettler;
import com.aaa.entity.Order;
import com.aaa.entity.OrderExample;

@Service
public class OrderService {

	@Autowired
	OrderMapper maper;

	@Autowired
	FettlerService fettlerService;

	/**
	 *
	 * @author zjl
	 * @date 2018年7月8日 下午10:34:39
	 * @param o
	 * @return 后台添加订单时添加判断条件
	 */
	public int add(Order o) {
		Fettler fettler = new Fettler();
		fettler.setFettlerId(o.getFettlerId());
		fettler.setState("维修中");
		Order order = new Order();
		order.setOrderId(o.getOrderId());
		order.setState("处理中");
		if (o.getFettlerId() != null) {
			fettlerService.update(fettler);
			update(order);
		}
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
	/*
	 * 订单季度报表
	 */
    public List<Map<String, Object>> OrderReports() {
			return maper.OrderReport();
		}
    /*
	 * 订单月份报表
	 */
    public List<Map<String, Object>> OrderReportsMonth() {
			return maper.OrderReportMonth();
		}
	public int update(Order order) {
	    order.setGmtModified(new Date());
	    return maper.updateByPrimaryKeySelective(order);
	}
}
