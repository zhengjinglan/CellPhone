package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ModelMapper;
import com.aaa.entity.Model;
import com.aaa.entity.ModelExample;

@Service
public class ModelService {
	@Autowired
	ModelMapper modelMapper;

	public List<Model> queryPage(Integer pageNum, Integer pageSize) {
		ModelExample model = new ModelExample();

		if (pageNum != null) {
			model.setOffset((pageNum - 1) * pageSize);
			model.setLimit(pageSize);
		}
		return modelMapper.selectByExample(model);
	}

	public int dels(int[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		ModelExample model = new ModelExample();
		model.createCriteria().andModelIdIn(list);
		int rs = modelMapper.deleteByExample(model);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(Model model) {
		System.out.println(model);
		return modelMapper.insert(model);
	}

	public int update(Model model) {
		ModelExample modelExample = new ModelExample();
		modelExample.createCriteria().andModelIdEqualTo(model.getModelId());

		return modelMapper.updateByExampleSelective(model, modelExample);
	}

	public long getCount() {
		return modelMapper.countByExample(null);
	}
}
