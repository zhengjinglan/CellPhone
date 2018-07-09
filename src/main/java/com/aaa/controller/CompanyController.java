package com.aaa.controller;

import java.util.List;

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
    public int add(Company company){
        return service.add(company);
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
    /**
     * 返回布尔值，但会被转为字符串。
     * 在js中要使用 response=="true"这样的判断
     * 
     * @author 小黑
     * @date 2018年7月10日 上午1:46:20
     * 
     * @param companyName
     * @return true表示存在,false表示不存在
     */
    @RequestMapping("existCompanyName")
    @ResponseBody
    public boolean existCompanyName(String companyName){
        return service.existCompanyName(companyName);
    }
}
