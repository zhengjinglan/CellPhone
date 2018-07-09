package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Fault;
import com.aaa.service.FaultService;

@Controller
@RequestMapping("fault")
public class FaultController {
	@Autowired
	private FaultService faultService;

	@RequestMapping("/add")
	@ResponseBody
	public int add(Fault fault) {
		System.out.println(fault);
		return faultService.add(fault);
	}

	@RequestMapping("queryByTypeId")
	@ResponseBody
	public EasyuiPage queryByTypeId(Integer page, Integer rows, Integer typeId) {
		System.out.println(typeId);
		return new EasyuiPage(faultService.queryPage(page, rows, typeId),
				faultService.getCount());
	}

	@RequestMapping("query")
	@ResponseBody
	public EasyuiPage query(Fault fault, int page, int rows) {
		List<Map<String, Object>> list = faultService.query(fault, page, rows);
		System.out.println("query" + list);
		Long total = (long) faultService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Fault> queryAll(Fault fault) {
		System.out.println("faultQueryAll" + faultService.queryAll(fault));
		return faultService.queryAll(fault);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(int[] ids) {
		return faultService.dels(ids);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Fault fault) {
		return faultService.update(fault);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月10日 上午2:47:27
	 * @see com.aaa.controller.CompanyController#existCompanyName(String)
	 * @param faultName
	 * @return
	 */
	@RequestMapping("existFaultName")
    @ResponseBody
	public boolean existFaultName(String faultName){
	    return faultService.existFaultName(faultName);
	}
}
