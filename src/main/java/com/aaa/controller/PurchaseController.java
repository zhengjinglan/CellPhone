package com.aaa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Purchase;
import com.aaa.service.PurchaseService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
    @Autowired
    PurchaseService service;
    
    @RequestMapping("queryPage")
    @ResponseBody
    public EasyuiPage queryPage(Integer page, Integer rows){
        List<Purchase> list = service.queryPage(page, rows);
        for (Purchase purchase : list) {
            System.out.println("==================");
            System.out.println(purchase.getConsumeItem());
            System.out.println(purchase.getCompany());
            System.out.println("==================");
        }
        return new EasyuiPage(list,service.getCount());
    }
    @RequestMapping("add")
    @ResponseBody
    public boolean add(Purchase purchase,HttpServletRequest request){
        String newName = request.getParameter("newName");
        int res;
        if(newName != null && !"".equals(newName)){
            System.out.println("需要创建新耗材");
           res = service.add(purchase, newName);
        }else{
            res = service.add(purchase);
        }
        return res>0?true:false;
    }
}
