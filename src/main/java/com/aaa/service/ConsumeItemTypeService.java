package com.aaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ConsumeItemTypeMapper;
import com.aaa.entity.CompanyExample;
import com.aaa.entity.ConsumeItemType;
import com.aaa.entity.ConsumeItemTypeExample;

@Service
public class ConsumeItemTypeService {
    @Autowired
    ConsumeItemTypeMapper mapper;
    
    public int add(ConsumeItemType consumeItemType){
        consumeItemType.setGmtCreate(new Date());
        return mapper.insertSelective(consumeItemType);
    }
    public boolean remove(int typeId){
        int res = mapper.deleteByPrimaryKey(typeId);
        if(res > 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean remove(List<Integer> ids){
        ConsumeItemTypeExample exp = new ConsumeItemTypeExample();
        exp.createCriteria().andTypeIdIn(ids);
        int res = mapper.deleteByExample(exp);
        return res>0?true:false;
    }
    public int update(ConsumeItemType consumeItemType){
        consumeItemType.setGmtModified(new Date());
        return mapper.updateByPrimaryKeySelective(consumeItemType);
    }
    public List<ConsumeItemType> queryPage(Integer pageNum,Integer pageSize){
        ConsumeItemTypeExample exp = new ConsumeItemTypeExample();
        if(pageNum != null){
            exp.setOffset((pageNum - 1) * pageSize);
            exp.setLimit(pageSize);
        }
        return mapper.selectByExample(exp);
    }
    public long getCount(){
        return mapper.countByExample(null);
    }
    public List<ConsumeItemType> list(){
        return mapper.selectByExample(null);
    }
    /**
     * 
     * @author 小黑
     * @date 2018年7月10日 上午2:24:14
     * @see com.aaa.service.ConsumeItemService#existItemName(String)
     * @param typeName
     * @return 
     */
    public boolean existTypeName(String typeName){
        ConsumeItemTypeExample exp = new ConsumeItemTypeExample();
        exp.createCriteria().andTypeNameEqualTo(typeName);
        return mapper.selectByExample(exp).size() > 0 ? true : false;
    }
}