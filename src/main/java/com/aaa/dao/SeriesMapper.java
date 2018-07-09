package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Series;
import com.aaa.entity.SeriesExample;

public interface SeriesMapper {
	List<Map<String, Object>> query(Series series, int page, int rows);

	long countByExample(SeriesExample example);

	int deleteByExample(SeriesExample example);

	int deleteByPrimaryKey(Integer seriesId);

	int insert(Series record);

	int insertSelective(Series record);

	List<Series> selectByExample(SeriesExample example);

	Series selectByPrimaryKey(Integer seriesId);

	int updateByExampleSelective(@Param("record") Series record,
			@Param("example") SeriesExample example);

	int updateByExample(@Param("record") Series record,
			@Param("example") SeriesExample example);

	int updateByPrimaryKeySelective(Series record);

	int updateByPrimaryKey(Series record);
    List<Series> querySeries(Series s);
}
