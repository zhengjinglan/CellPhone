package com.aaa.dao;

import com.aaa.entity.PayItem;
import com.aaa.entity.PayItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayItemMapper {
    long countByExample(PayItemExample example);

    int deleteByExample(PayItemExample example);

    int deleteByPrimaryKey(Integer payItemId);

    int insert(PayItem record);

    int insertSelective(PayItem record);

    List<PayItem> selectByExample(PayItemExample example);

    PayItem selectByPrimaryKey(Integer payItemId);

    int updateByExampleSelective(@Param("record") PayItem record, @Param("example") PayItemExample example);

    int updateByExample(@Param("record") PayItem record, @Param("example") PayItemExample example);

    int updateByPrimaryKeySelective(PayItem record);

    int updateByPrimaryKey(PayItem record);
}