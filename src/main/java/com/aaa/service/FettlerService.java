package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.EmpMapper;
import com.aaa.dao.FettlerMapper;
import com.aaa.dao.OrderMapper;
import com.aaa.entity.Fettler;
import com.aaa.entity.FettlerExample;
import com.aaa.entity.Order;

@Service
public class FettlerService {

	@Autowired
	FettlerMapper fettlerMapper;
	@Autowired
	OrderMapper orderMapper;
	@Autowired
	EmpMapper empMapper;
	public List<Fettler> queryPage(Integer pageNum, Integer pageSize) {
		FettlerExample fettlerExample = new FettlerExample();
		if (pageNum != null) {
			fettlerExample.setOffset((pageNum - 1) * pageSize);
			fettlerExample.setLimit(pageSize);
		}
		return fettlerMapper.selectByExample(fettlerExample);
	}

	public List<Map<String, Object>> queryAll() {
		return fettlerMapper.queryAll();
	}

	public List<Map<String, Object>> queryByState() {

		return fettlerMapper.queryByState();
	}

	public List<Map<String, Object>> query(String empName, int page, int rows) {

		Integer offer = null;
		if (page != 0) {
			offer = (page - 1) * rows;
		}
		return fettlerMapper.query(empName, offer, rows);
	}

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			list.add(i);
		}
		FettlerExample fettlerExample = new FettlerExample();
		fettlerExample.createCriteria().andFettlerIdIn(list);
		int rs = fettlerMapper.deleteByExample(fettlerExample);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(Fettler fettler) {
		System.out.println(fettler);
		return fettlerMapper.insert(fettler);
	}

	public int update(Fettler fettler) {
		return fettlerMapper.updateByPrimaryKeySelective(fettler);
	}

	public long getCount() {
		return fettlerMapper.countByExample(null);
	}
	/**
	 * 返回符合订单要求的维修工，条件包括
	 * ①同处一市
	 * ②状态为闲置
	 * @param orderId
	 * @return
	 */
	public List<Fettler> listWithOrder(int orderId){
	    Order order = orderMapper.selectByPrimaryKey(orderId);
	    String address = order.getAddress();
	    String city = address.split("省")[1].split("市")[0];
	    System.out.println(city);
	    FettlerExample exp = new FettlerExample();
	    exp.createCriteria().andWorkCityLike("%"+city+"%").andStateEqualTo("闲置");
	    List<Fettler> list = fettlerMapper.selectByExample(exp);
	    for (Fettler fettler : list) {
            fettler.setEmp(empMapper.selectByPrimaryKey(fettler.getEmpId()));
        }
	    return list;
	}
	public Fettler get(int fettlerId){
	    return fettlerMapper.selectByPrimaryKey(fettlerId);
	}

}
