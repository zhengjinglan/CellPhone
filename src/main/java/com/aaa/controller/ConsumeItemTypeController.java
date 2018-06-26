package com.aaa.controller;

import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.ConsumeItemType;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.ConsumeItemTypeService;
import com.aaa.util.StrUtil;

@Controller
@RequestMapping("consumeItemType")
public class ConsumeItemTypeController {
    @Autowired
    ConsumeItemTypeService service;
    
    @RequestMapping("queryPage")
    @ResponseBody
    public EasyuiPage queryPage(Integer page, Integer rows){
        return new EasyuiPage(service.queryPage(page, rows),service.getCount());
    }
    @RequestMapping("add")
    @ResponseBody
    public boolean add(ConsumeItemType type){
        return service.add(type)>0?true:false;
    }   
    @RequestMapping("update")
    @ResponseBody
    public int update(ConsumeItemType type){
        return service.update(type);
    }
    @RequestMapping("dels")
    @ResponseBody
    public boolean dels(String ids){
        String[] strs = ids.split(",");
        return service.remove(StrUtil.parseToInteger(strs));
    }
    @RequestMapping("queryAll")
    @ResponseBody
    public List<ConsumeItemType> queryAll(){
        return service.list();
    }
}  
