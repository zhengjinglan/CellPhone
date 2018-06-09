package com.aaa.dao;

import com.aaa.entity.ServiceItem;
import com.aaa.entity.ServiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceItemMapper {
    long countByExample(ServiceItemExample example);

    int deleteByExample(ServiceItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ServiceItem record);

    int insertSelective(ServiceItem record);

    List<ServiceItem> selectByExample(ServiceItemExample example);

    ServiceItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    int updateByExample(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    int updateByPrimaryKeySelective(ServiceItem record);

    int updateByPrimaryKey(ServiceItem record);
}