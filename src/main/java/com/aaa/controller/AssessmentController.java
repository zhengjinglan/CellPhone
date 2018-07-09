package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.entity.Assessment;
import com.aaa.entity.AssessmentExample;
import com.aaa.entity.Color;
import com.aaa.entity.EasyuiPage;
import com.aaa.service.AssessmentService;

@Controller
@RequestMapping("assessment")
public class AssessmentController {
@Autowired
private AssessmentService as;
/*
 * 分页查询
 */
@RequestMapping("queryPage")
@ResponseBody
public EasyuiPage queryPage(int page, int rows) {
	List<Assessment> list = as.queryPage(page, rows);
	long total = as.getCount();
	return new EasyuiPage(list, total);
}
/*
 * 前台查询
 */
@RequestMapping("/querys")
public String getAllUser(HttpServletRequest request,Model model){  
    List<Assessment> user = as.selectByExample(null);
    model.addAttribute("userList", user);  
    request.setAttribute("userList", user);  
    System.out.println(user);
    return "/before/mac";  
} 
/*
 * 前台添加
 */
@RequestMapping("/inserts")//为方法设置访问路径  
public String insert(HttpServletRequest request, Assessment po){  
    String inserUser = as.insert(po);
    request.setAttribute("inserUser", inserUser);  
    return "forward:/assessment/querys"; 
}  

}
