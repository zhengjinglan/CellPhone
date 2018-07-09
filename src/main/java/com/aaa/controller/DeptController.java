package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Dept;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.DeptService;

@Controller
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("queryPage")
    @ResponseBody
    public EasyuiPage queryPage(int page, int rows) {
        List<Dept> list = deptService.queryPage(page, rows);
        long total = deptService.getCount();
        return new EasyuiPage(list, total);
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Dept> queryAll(Dept dept) {
        return deptService.queryAll(dept);
    }

    @RequestMapping("dels")
    @ResponseBody
    public int dels(Integer[] ids) {
        System.out.println(ids);
        return deptService.dels(ids);
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(Dept dept) {
        System.out.println(dept);
        return deptService.add(dept);
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Dept dept) {
        System.out.println(dept);
        return deptService.update(dept);
    }
    /**
     * 
     * @author 小黑
     * @date 2018年7月10日 上午2:31:03
     * @see com.aaa.controller.CompanyController#existCompanyName(String)
     * @param deptName
     * @return
     */
    @RequestMapping("existDeptName")
    @ResponseBody
    public boolean existDeptName(String deptName){
        return deptService.existDeptName(deptName);
    }
}
