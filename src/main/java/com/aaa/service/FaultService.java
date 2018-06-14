package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.FaultMapper;
import com.aaa.entity.Fault;
import com.aaa.entity.FaultExample;

@Service
public class FaultService {
	@Autowired
	private FaultMapper faultMapper;

	public List<Fault> queryPage(Integer pageNum, Integer pageSize) {
		FaultExample fault = new FaultExample();

		if (pageNum != null) {
			fault.setOffset((pageNum - 1) * pageSize);
			fault.setLimit(pageSize);
		}
		return faultMapper.selectByExample(fault);
	}

	public List<Fault> queryAll(Fault fault) {
		FaultExample faultExample = new FaultExample();

		return faultMapper.selectByExample(faultExample);
	}

	public int add(Fault fault) {
		return faultMapper.insert(fault);

	}

	public int dels(int[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		FaultExample fault = new FaultExample();
		fault.createCriteria().andFaultIdIn(list);
		int rs = faultMapper.deleteByExample(fault);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int update(Fault fault) {
		FaultExample faultExample = new FaultExample();
		faultExample.createCriteria().andTypeIdEqualTo(fault.getFaultId());

		return faultMapper.updateByExampleSelective(fault, faultExample);
	}

	public long getCount() {
		return faultMapper.countByExample(null);
	}

}
