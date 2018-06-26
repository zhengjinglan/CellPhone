package com.aaa.dao;

import com.aaa.entity.Series;
import com.aaa.entity.SeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeriesMapper {
    long countByExample(SeriesExample example);

    int deleteByExample(SeriesExample example);

    int deleteByPrimaryKey(Integer seriesId);

    int insert(Series record);

    int insertSelective(Series record);

    List<Series> selectByExample(SeriesExample example);

    Series selectByPrimaryKey(Integer seriesId);

    int updateByExampleSelective(@Param("record") Series record, @Param("example") SeriesExample example);

    int updateByExample(@Param("record") Series record, @Param("example") SeriesExample example);

    int updateByPrimaryKeySelective(Series record);

    int updateByPrimaryKey(Series record);
    List<Series> querySeries(Series s);
}