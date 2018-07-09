package com.aaa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aaa.entity.Purchase;
import com.aaa.entity.PurchaseExample;

public interface PurchaseMapper {
    long countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer purchaseId);

    int insert(Purchase record);

    int insertSelective(Purchase record);
    List<Purchase> selectFullByExample(@Param("example")PurchaseExample example,@Param("itemId")Integer itemId,@Param("companyId")Integer companyId);
    
    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer purchaseId);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);
}