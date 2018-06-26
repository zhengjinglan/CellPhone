package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.FaultTypeMapper;
import com.aaa.entity.FaultType;
import com.aaa.entity.FaultTypeExample;

@Service
public class FaultTypeService {
	@Autowired
	private FaultTypeMapper faultMapper;

	public List<FaultType> queryPage(Integer pageNum, Integer pageSize) {
		FaultTypeExample fault = new FaultTypeExample();

		if (pageNum != null) {
			fault.setOffset((pageNum - 1) * pageSize);
			fault.setLimit(pageSize);
		}
		return faultMapper.selectByExample(fault);
	}

	public List<FaultType> queryAll(FaultType faultType) {
		FaultTypeExample fault = new FaultTypeExample();

		return faultMapper.selectByExample(fault);
	}

	public int add(FaultType faultType) {
		return faultMapper.insert(faultType);

	}

	public int dels(int[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		FaultTypeExample fault = new FaultTypeExample();
		fault.createCriteria().andTypeIdIn(list);
		int rs = faultMapper.deleteByExample(fault);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int update(FaultType fault) {
		FaultTypeExample faultType = new FaultTypeExample();
		faultType.createCriteria().andTypeIdEqualTo(fault.getTypeId());

		return faultMapper.updateByExampleSelective(fault, faultType);
	}

	public long getCount() {
		return faultMapper.countByExample(null);
	}

}
