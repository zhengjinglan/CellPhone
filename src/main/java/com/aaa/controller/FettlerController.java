package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Fettler;
import com.aaa.service.FettlerService;

@Controller
@RequestMapping("fettler")
public class FettlerController {

	@Autowired
	private FettlerService fettlerService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(String empName, int page, int rows) {
		List<Map<String, Object>> list = fettlerService.query(empName, page,
				rows);
		long total = fettlerService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Map<String, Object>> queryAll() {
		System.out.println("queryAll" + fettlerService.queryAll());
		return fettlerService.queryAll();
	}

	@RequestMapping("queryByState")
	@ResponseBody
	public List<Map<String, Object>> queryByState() {
		System.out.println("queryByState" + fettlerService.queryByState());
		return fettlerService.queryByState();
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {
		System.out.println(ids);
		return fettlerService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Fettler fettler) {
		System.out.println(fettler);
		return fettlerService.add(fettler);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Fettler fettler) {
		System.out.println(fettler);
		return fettlerService.update(fettler);
	}
	@RequestMapping("queryWithOrder")
    @ResponseBody
	public List<Fettler> queryWithOrder(Integer orderId){
	    List<Fettler> list = fettlerService.listWithOrder(orderId);
	    System.out.println("================");
	    System.out.println(list);
	    System.out.println("================");
	    return list;
	}
}
