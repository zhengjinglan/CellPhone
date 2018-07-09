package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.IncomeTypeMapper;
import com.aaa.entity.IncomeType;
import com.aaa.entity.IncomeTypeExample;

@Service
public class IncomeTypeService {

	@Autowired
	IncomeTypeMapper incomeMapper;

	public List<IncomeType> queryPage(Integer pageNum, Integer pageSize) {
		IncomeTypeExample incomeExample = new IncomeTypeExample();
		if (pageNum != null) {
			incomeExample.setOffset((pageNum - 1) * pageSize);
			incomeExample.setLimit(pageSize);
		}
		return incomeMapper.selectByExample(incomeExample);
	}

	public List<IncomeType> queryAll(IncomeType income) {
		IncomeTypeExample incomeExample = new IncomeTypeExample();
		return incomeMapper.selectByExample(incomeExample);
	}

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			list.add(i);
		}
		IncomeTypeExample incomeExample = new IncomeTypeExample();
		incomeExample.createCriteria().andIncomeTypeIdIn(list);
		int rs = incomeMapper.deleteByExample(incomeExample);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(IncomeType income) {
		System.out.println(income);
		return incomeMapper.insert(income);
	}

	public int update(IncomeType income) {
		IncomeTypeExample incomeExample = new IncomeTypeExample();
		incomeExample.createCriteria().andIncomeTypeIdEqualTo(
				income.getIncomeTypeId());
		return incomeMapper.updateByExampleSelective(income, incomeExample);
	}

	public long getCount() {
		return incomeMapper.countByExample(null);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月10日 上午2:35:18
	 * @see com.aaa.service.ConsumeItemService#existItemName(String)
	 * @param incomeTypeName
	 * @return
	 */
	public boolean existIncomeTypeName(String incomeTypeName){
	    IncomeTypeExample exp = new IncomeTypeExample();
	    exp.createCriteria().andIncomeTypeNameEqualTo(incomeTypeName);
	    return incomeMapper.selectByExample(exp).size() > 0 ? true : false;
	}
}
