package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ColorMapper;
import com.aaa.entity.Color;
import com.aaa.entity.ColorExample;

@Service
public class ColorService {

	@Autowired
	ColorMapper colorMapper;

	public List<Color> queryPage(Integer pageNum, Integer pageSize) {
		ColorExample color = new ColorExample();

		if (pageNum != null) {
			color.setOffset((pageNum - 1) * pageSize);
			color.setLimit(pageSize);
		}
		return colorMapper.selectByExample(color);
	}

	public int dels(int[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		ColorExample color = new ColorExample();
		color.createCriteria().andColorIdIn(list);
		int rs = colorMapper.deleteByExample(color);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(Color e) {
		return colorMapper.insert(e);
	}

	public int update(Color col) {
		ColorExample color = new ColorExample();
		color.createCriteria().andColorIdEqualTo(col.getColorId());

		return colorMapper.updateByExampleSelective(col, color);
	}
}
