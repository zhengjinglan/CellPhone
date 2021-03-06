package com.aaa.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Fettler;
import com.aaa.entity.Order;
import com.aaa.entity.Order_Fault;
import com.aaa.entity.User;
import com.aaa.service.FettlerService;
import com.aaa.service.OrderService;
import com.aaa.service.Order_FalutService;
import com.aaa.service.UserService;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService oservice;
    @Autowired
    UserService uservice;
    @Autowired
    Order_FalutService ofservice;
    @Autowired
    FettlerService fettlerService;

    @RequestMapping("/add")
    @ResponseBody
    public int add(User u, Order o, Order_Fault ofa) {
        int us = uservice.add(u);
        int rs = oservice.add(o);
        ofservice.add(ofa);
        System.out.println(ofa);
        return rs;
    }

	/*
	 * 订单季度报表
	 */
	@RequestMapping("/OrderReport")
	@ResponseBody
	public List<Map<String, Object>> test() {
		return oservice.OrderReports();
	}
	/*
	 * 订单月份报表
	 */
	@RequestMapping("/OrderReportMonth")
	@ResponseBody
	public List<Map<String, Object>> testMonth() {
		return oservice.OrderReportsMonth();
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Map<String, Object>> queryAll(Order_Fault of) {
		return ofservice.query(of);
	}
    @RequestMapping("query")
    @ResponseBody
    public EasyuiPage query(Order order, int page, int rows) {
        List<Map<String, Object>> list = oservice.query(order, page, rows);
        long total = oservice.count();
        return new EasyuiPage(list, total);
    }

    /**
     * 
     * @author 小黑
     * @date 2018年7月5日
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public List<Order> list() {
        return oservice.list();
    }

    @RequestMapping("update")
    @ResponseBody
    public int query(Order order) {
        System.out.println(order);
        return oservice.update(order);
    }

    @RequestMapping("allot")
    @ResponseBody
    public int allot(Integer orderId, Integer fettlerId,String assigner) {
        int res = 0;
        System.out.println("==================="+assigner);
        if (orderId != null && fettlerId != null) {
            Order order = oservice.get(orderId);
            if(order != null){
                Fettler fettler = fettlerService.get(fettlerId);
                if (fettler != null) {
                    order.setFettlerId(fettlerId);
                    order.setAssignTime(new Date());
                    order.setState("已分配");
                    order.setAssigner(assigner);
                    System.out.println(order);
                    res = oservice.update(order);
                    fettler.setState("维修中");
                    res = fettlerService.update(fettler);
                }
            }
        }
        return res;
    }

    @RequestMapping("orderDone")
    @ResponseBody
    public int orderDone(Order order) {
        int res = 0;
        if (order.getOrderId() != null) {
            order.setState("已完成");
            res = oservice.update(order);
            Fettler fettler = fettlerService.get(order.getFettlerId());
            fettler.setState("闲置");
            res = fettlerService.update(fettler);
        }
        return res;
    }
}
