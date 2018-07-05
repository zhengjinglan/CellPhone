package com.aaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ConsumeItemTypeMapper;
import com.aaa.dao.PurchaseMapper;
import com.aaa.entity.ConsumeItem;
import com.aaa.entity.ConsumeItemType;
import com.aaa.entity.ConsumeItemTypeExample;
import com.aaa.entity.Purchase;
import com.aaa.entity.PurchaseExample;

@Service
public class PurchaseService {
    @Autowired
    PurchaseMapper mapper;
    @Autowired
    ConsumeItemService consumeItemService;
    @Autowired
    ConsumeItemTypeMapper consumeItemTypeMapper;
    public int add(Purchase purchase){
        purchase.setGmtCreate(new Date());
        return mapper.insertSelective(purchase);
    }
    public int add(Purchase purchase,String newName){
        ConsumeItemTypeExample cte = new ConsumeItemTypeExample();
        cte.createCriteria().andTypeNameEqualTo("其他");
        ConsumeItemType type = consumeItemTypeMapper.selectByExample(cte).get(0);
        if(type == null){
            type = new ConsumeItemType();
            type.setGmtCreate(new Date());
            type.setTypeName("其他");
            type.setOperator(purchase.getOperator());
            consumeItemTypeMapper.insertSelective(type);
        }
        ConsumeItem item = new ConsumeItem();
        item.setItemName(newName);
        item.setOperator(purchase.getOperator());
        item.setTypeId(type.getTypeId());
        consumeItemService.add(item);
        purchase.setItemId(item.getItemId());
        System.out.println(item.getItemId());
        purchase.setGmtCreate(new Date());
        int res = mapper.insertSelective(purchase);
        if(res > 0){
            int oldNum = item.getItemNum();
            int addNum = purchase.getPurchaseNum();
            item.setItemNum(oldNum+addNum);
            res = consumeItemService.update(item);
        }
        return res;
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
