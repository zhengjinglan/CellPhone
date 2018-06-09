package com.aaa.dao;

import com.aaa.entity.Fettler;
import com.aaa.entity.FettlerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FettlerMapper {
    long countByExample(FettlerExample example);

    int deleteByExample(FettlerExample example);

    int deleteByPrimaryKey(Integer fettlerId);

    int insert(Fettler record);

    int insertSelective(Fettler record);

    List<Fettler> selectByExample(FettlerExample example);

    Fettler selectByPrimaryKey(Integer fettlerId);

    int updateByExampleSelective(@Param("record") Fettler record, @Param("example") FettlerExample example);

    int updateByExample(@Param("record") Fettler record, @Param("example") FettlerExample example);

    int updateByPrimaryKeySelective(Fettler record);

    int updateByPrimaryKey(Fettler record);
}