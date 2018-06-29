package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.EmpIncomeMapper;
import com.aaa.entity.EmpIncome;
import com.aaa.entity.EmpIncomeExample;

@Service
public class EmpIncomeService {

	@Autowired
	EmpIncomeMapper incomeMapper;

	public List<EmpIncome> queryPage(Integer pageNum, Integer pageSize) {
		EmpIncomeExample incomeExample = new EmpIncomeExample();
		if (pageNum != null) {
			incomeExample.setOffset((pageNum - 1) * pageSize);
			incomeExample.setLimit(pageSize);
		}
		return incomeMapper.selectByExample(incomeExample);
	}

	public List<EmpIncome> queryAll(EmpIncome income) {
		EmpIncomeExample incomeExample = new EmpIncomeExample();
		return incomeMapper.selectByExample(incomeExample);
	}

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			list.add(i);
		}
		EmpIncomeExample incomeExample = new EmpIncomeExample();
		incomeExample.createCriteria().andIncomeIdIn(list);
		int rs = incomeMapper.deleteByExample(incomeExample);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(EmpIncome income) {
		return incomeMapper.insert(income);
	}

	public int update(EmpIncome income) {
		EmpIncomeExample incomeExample = new EmpIncomeExample();
		incomeExample.createCriteria().andIncomeIdEqualTo(income.getIncomeId());
		return incomeMapper.updateByExampleSelective(income, incomeExample);
	}

	public long getCount() {
		return incomeMapper.countByExample(null);
	}
}
