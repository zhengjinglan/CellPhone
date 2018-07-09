package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.ConsumeItemRecordService;

/**
 * 
 * @author 小黑
 * @version 1.0 2018年7月5日 下午6:04:53
 * 
 */
@Controller
@RequestMapping("record")
public class ConsumeItemRecordController {
    
    @Autowired
    ConsumeItemRecordService service;
    
    /**
     * 
     * @author 小黑
     * @date 2018年7月5日 下午5:51:28
     * 
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("queryPage")
    @ResponseBody
    public EasyuiPage queryPage(Integer page, Integer rows) {
        return new EasyuiPage(service.queryPage(page, rows), service.getCount());
    }
}
