package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Series;
import com.aaa.service.SeriesService;

@Controller
@RequestMapping("series")
public class SeriesController {

    @Autowired
    SeriesService service;

    @RequestMapping("/querySeries")
    @ResponseBody
    public List<Series> querySeries(Series s) {
        return service.querySeries(s);

    }

    @RequestMapping("/query")
    @ResponseBody
    public EasyuiPage query(Series series, int page, int rows) {
        List<Map<String, Object>> list = service.query(series, page, rows);
        System.out.println(list);
        Long total = (long) service.getCount();
        return new EasyuiPage(list, total);
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(Series s) {
        return service.add(s);
    }

    @RequestMapping("/del")
    @ResponseBody
    public int del(int[] ids) {
        return service.del(ids);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(Series s) {
        return service.update(s);

    }
}
