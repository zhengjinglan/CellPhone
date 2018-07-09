package com.aaa.controller;


import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.ConsumeItem;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.ConsumeItemService;
import com.aaa.util.StrUtil;

@Controller
@RequestMapping("consumeItem")
public class ConsumeItemController {
    @Autowired
    ConsumeItemService service;

    @RequestMapping("queryPage")
    @ResponseBody
    public EasyuiPage queryPage(Integer page, Integer rows){
        return new EasyuiPage(service.queryPage(page, rows),service.getCount());
    }
    @RequestMapping("queryByTypeId")
    @ResponseBody
    public EasyuiPage queryByTypeId(Integer page,Integer rows,Integer typeId){
        System.out.println(typeId);
        return new EasyuiPage(service.queryPage(page, rows,typeId),service.getCount());
    }
    @RequestMapping("add")
    @ResponseBody
    public boolean add(ConsumeItem item){
        return service.add(item)>0?true:false;
    }
    @RequestMapping("update")
    @ResponseBody
    public int update(ConsumeItem item){
        return service.update(item);
    }
    @RequestMapping("dels")
    @ResponseBody
    public boolean dels(String ids){
        String[] strs = ids.split(",");
        return service.remove(StrUtil.parseToInteger(strs));
    }
    @RequestMapping("queryAll")
    @ResponseBody
    public List<ConsumeItem> queryAll(){
        return service.list();
    }
    /**
     * 
     * @author 小黑
     * @date 2018年7月10日 上午2:19:42
     * @see com.aaa.controller.CompanyController#existCompanyName(String)
     */
    public boolean existItemName(String itemName){
        return service.existItemName(itemName);
    }
}
