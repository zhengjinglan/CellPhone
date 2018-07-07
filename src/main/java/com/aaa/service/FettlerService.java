package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.FettlerMapper;
import com.aaa.entity.Fettler;
import com.aaa.entity.FettlerExample;

@Service
public class FettlerService {

	@Autowired
	FettlerMapper fettlerMapper;

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
		FettlerExample fettlerExample = new FettlerExample();
		fettlerExample.createCriteria().andFettlerIdEqualTo(
				fettler.getFettlerId());
		return fettlerMapper.updateByExampleSelective(fettler, fettlerExample);
	}

	public long getCount() {
		return fettlerMapper.countByExample(null);
	}

}
