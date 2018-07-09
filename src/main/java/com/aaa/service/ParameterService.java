package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ParameterMapper;
import com.aaa.entity.Brand;
import com.aaa.entity.BrandExample;
import com.aaa.entity.Parameter;
import com.aaa.entity.ParameterExample;
import com.aaa.entity.Parameter;
import com.aaa.entity.ParameterExample;


@Service
public class ParameterService {
	
	@Autowired
	ParameterMapper maper;
	
	public List<Parameter> queryParameter(Parameter s){
		ParameterExample parameter=new ParameterExample();
		return maper.selectByExample(parameter);
		
	}
	
	public int add(Parameter p){
		return maper.insert(p);
		
	}
	public int del(int[] ids){
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		ParameterExample parameter=new ParameterExample();
		parameter.createCriteria().andParameterIdIn(list);
		int rs = maper.deleteByExample(parameter);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}
	public int update(Parameter p){
		ParameterExample parameter=new ParameterExample();
		parameter.createCriteria().andParameterIdEqualTo(p.getParameterId());
		return maper.updateByExample(p, parameter);
		
	}

}
