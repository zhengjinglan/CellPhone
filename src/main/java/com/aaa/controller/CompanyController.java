package com.aaa.controller;

import java.util.List;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Company;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.CompanyService;
import com.aaa.util.StrUtil;

@Controller
@RequestMapping("company")
public class CompanyController {
    @Autowired
    CompanyService service;

    @RequestMapping("queryPage")
    @ResponseBody
    public EasyuiPage queryPage(Integer page, Integer rows){
        return new EasyuiPage(service.queryPage(page, rows),service.getCount());
    }
    @RequestMapping("add")
    @ResponseBody
    public boolean add(Company company){
        return service.add(company)>0?true:false;
    }
    @RequestMapping("update")
    @ResponseBody
    public int update(Company company){
        return service.update(company);
    }
    @RequestMapping("dels")
    @ResponseBody
    public boolean dels(String ids){
        String[] strs = ids.split(",");
        return service.remove(StrUtil.parseToInteger(strs));
    }
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Company> queryAll(){
        return service.list();
    }
}