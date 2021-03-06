package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	public List<Model> queryAll(Model model) {
		//ModelExample modelExample = new ModelExample();

		return modelMapper.queryModel(model);
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

	public List<Map<String, Object>> query(Model model, int page, int rows) {
		Integer offer = null;
		if (page != 0) {
			offer = (page - 1) * rows;
		}
		return modelMapper.query(model, offer, rows);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月10日 上午3:03:12
	 * @see com.aaa.service.ConsumeItemService#existItemName(String)
	 * @param modelName
	 * @return
	 */
	public boolean existModelName(String modelName){
	    ModelExample exp = new ModelExample();
	    exp.createCriteria().andModelNameEqualTo(modelName);
	    return modelMapper.selectByExample(exp).size() > 0 ? true : false;
	}
}
