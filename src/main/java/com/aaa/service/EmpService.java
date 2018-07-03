package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.EmpMapper;
import com.aaa.entity.Emp;
import com.aaa.entity.EmpExample;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;

	public List<Emp> queryPage(Integer pageNum, Integer pageSize) {
		EmpExample emp = new EmpExample();

		if (pageNum != null) {
			emp.setOffset((pageNum - 1) * pageSize);
			emp.setLimit(pageSize);
		}
		return empMapper.selectByExample(emp);
	}

	public List<Emp> queryAll(Emp emp) {
		EmpExample empExample = new EmpExample();
		return empMapper.selectByExample(empExample);
	}

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			list.add(i);
		}
		EmpExample emp = new EmpExample();
		emp.createCriteria().andEmpIdIn(list);
		int rs = empMapper.deleteByExample(emp);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(Emp emp) {
		System.out.println(emp);
		return empMapper.insert(emp);
	}

	public int update(Emp emp) {
		EmpExample empExample = new EmpExample();
		empExample.createCriteria().andEmpIdEqualTo(emp.getDeptId());
		return empMapper.updateByExampleSelective(emp, empExample);
	}

	public long getCount() {
		return empMapper.countByExample(null);
	}
}
