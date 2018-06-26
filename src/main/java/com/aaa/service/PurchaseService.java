package com.aaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.PurchaseMapper;
import com.aaa.entity.ConsumeItem;
import com.aaa.entity.Purchase;
import com.aaa.entity.PurchaseExample;

@Service
public class PurchaseService {
    @Autowired
    PurchaseMapper mapper;
    @Autowired
    ConsumeItemService consumeItemService;
    public int add(Purchase purchase){
        purchase.setGmtCreate(new Date());
        return mapper.insertSelective(purchase);
    }
    public int add(Purchase purchase,String newName){
        ConsumeItem item = new ConsumeItem();
        item.setItemName(newName);
        item.setOperator(purchase.getOperator());
        consumeItemService.add(item);
        purchase.setItemId(item.getItemId());
        System.out.println(item.getItemId());
        purchase.setGmtCreate(new Date());
        return mapper.insertSelective(purchase);
    }
    public boolean remove(List<Integer> ids){
        PurchaseExample exp = new PurchaseExample();  
        exp.createCriteria().andPurchaseIdIn(ids);
        return mapper.deleteByExample(exp) > 0?true:false;
    }
    
    public List<Purchase> queryPage(Integer pageNum,Integer pageSize){
        PurchaseExample exp = new PurchaseExample();
        if(pageNum != null){
            exp.setOffset((pageNum - 1) * pageSize);
            exp.setLimit(pageSize);
        }
        return mapper.selectFullByExample(exp, null, null);
    }
    public long getCount(){
        return mapper.countByExample(null);
    }
}
