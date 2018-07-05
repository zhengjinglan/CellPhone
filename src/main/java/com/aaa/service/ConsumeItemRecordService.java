package com.aaa.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ConsumeItemRecordMapper;
import com.aaa.entity.ConsumeItemRecord;
import com.aaa.entity.ConsumeItemRecordExample;

@Service
public class ConsumeItemRecordService {
    @Autowired
    ConsumeItemRecordMapper mapper;
    public List<ConsumeItemRecord> list(){
        return mapper.selectByExample(null);
    }
    public List<ConsumeItemRecord> queryPage(Integer pageNum,Integer pageSize){
        ConsumeItemRecordExample exp = new ConsumeItemRecordExample();
        if(pageNum != null){
            exp.setOffset((pageNum - 1) * pageSize);
            exp.setLimit(pageSize);
        }
        return mapper.selectFullByExample(exp, null, null);
    }
    public int add(ConsumeItemRecord record){
        record.setGmtCreate(new Date());
        return mapper.insertSelective(record);
    }
    /**更新所有列（除主键外）
     * 必须含有主键信息
     * @param record
     * @return
     */
    public int update(ConsumeItemRecord record){
        record.setGmtModified(new Date());
        return mapper.updateByPrimaryKey(record);
    }
    /**
     * 可选更新，属性为null的列将不会更新
     * 必须含有主键信息
     * @param record
     * @return
     */
    public int updateSelective(ConsumeItemRecord record){
        record.setGmtModified(new Date());
        return mapper.updateByPrimaryKeySelective(record);
    }
    /**
     * 批量删除
     * @param ids 使用StrUtil.parseToInteger(String)方法得来
     * @return
     */
    public boolean remove(List<Integer> ids){
        ConsumeItemRecordExample exp = new ConsumeItemRecordExample();
        exp.createCriteria().andRecordIdIn(ids);
        return mapper.deleteByExample(exp) > 0 ? true : false;
    }
}
