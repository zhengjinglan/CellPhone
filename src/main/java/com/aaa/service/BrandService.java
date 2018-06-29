package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.BrandMapper;
import com.aaa.entity.Brand;
import com.aaa.entity.BrandExample;

@Service
public class BrandService {

	@Autowired
	BrandMapper dao;

	public List<Brand> queryBrand(Brand b) {
		BrandExample brand = new BrandExample();
		return dao.selectByExample(brand);
	}

	public int add(Brand b) {
		return dao.insert(b);
	}

	public int del(int[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		BrandExample brand = new BrandExample();
		brand.createCriteria().andBrandIdIn(list);
		int rs = dao.deleteByExample(brand);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int update(Brand b) {
		BrandExample brand = new BrandExample();
		brand.createCriteria().andBrandIdEqualTo(b.getBrandId());
		return dao.updateByExample(b, brand);
	}

}
