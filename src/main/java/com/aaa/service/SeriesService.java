package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.SeriesMapper;
import com.aaa.entity.Series;
import com.aaa.entity.SeriesExample;

@Service
public class SeriesService {
	
	@Autowired
	SeriesMapper maper;
	
	public List<Series> querySeries(Series s){
		SeriesExample series=new SeriesExample();
		return maper.selectByExample(series);
		
	}
	
	public int add(Series s){
		return maper.insert(s);
		
	}
	public int del(int[] ids){
		List<Integer> list = new ArrayList<Integer>();
		for (int i : ids) {
			list.add(i);
		}
		SeriesExample series=new SeriesExample();
		series.createCriteria().andSeriesIdIn(list);
		int rs = maper.deleteByExample(series);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}
	public int update(Series s){
		SeriesExample series=new SeriesExample();
		series.createCriteria().andSeriesIdEqualTo(s.getSeriesId());
		return maper.updateByExample(s, series);
		
	}

}
