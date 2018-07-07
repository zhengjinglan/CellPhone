package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.SeriesMapper;
import com.aaa.entity.Series;
import com.aaa.entity.SeriesExample;

@Service
public class SeriesService {

	@Autowired
	SeriesMapper maper;

	public List<Series> querySeries(Series s) {
		// SeriesExample series=new SeriesExample();
		return maper.querySeries(s);
	}

	public List<Map<String, Object>> query(Series series, int page, int rows) {
		Integer offer = null;
		if (page != 0) {
			offer = (page - 1) * rows;
		}
		return maper.query(series, offer, rows);
	}

	public int add(Series s) {
		return maper.insert(s);

	}

	public int del(int[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		SeriesExample series = new SeriesExample();
		series.createCriteria().andSeriesIdIn(list);
		int rs = maper.deleteByExample(series);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int update(Series s) {
		SeriesExample series = new SeriesExample();
		series.createCriteria().andSeriesIdEqualTo(s.getSeriesId());
		return maper.updateByExampleSelective(s, series);

	}

	public long getCount() {
		return maper.countByExample(null);
	}

}
