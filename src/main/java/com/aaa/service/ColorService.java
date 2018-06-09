package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ColorDao;
import com.aaa.entity.Color;

@Service
public class ColorService {

	@Autowired
	ColorDao colorDao;

	public List<Map<String, Object>> queryPage(Integer pageNum, Integer pageSize) {
		Integer offset = null;
		if (pageNum != null) {
			offset = (pageNum - 1) * pageSize;
		}
		return colorDao.queryPage(offset, pageSize);
	}

	public int dels(int[] ids) {
		int rs = colorDao.dels(ids);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(Color e) {
		return colorDao.add(e);
	}

	public int update(Color e) {

		return colorDao.update(e);
	}
}
