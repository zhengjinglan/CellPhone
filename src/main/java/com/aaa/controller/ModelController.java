package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Model;
import com.aaa.service.ModelService;
import com.aaa.util.FileUpload;

@Controller
@RequestMapping("model")
public class ModelController {
	@Autowired
	private ModelService modelService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Model> list = modelService.queryPage(page, rows);
		long total = modelService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("query")
	@ResponseBody
	public EasyuiPage query(Model model, int page, int rows) {
		List<Map<String, Object>> list = modelService.query(model, page, rows);
		long total = modelService.getCount();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Model> queryAll(Model model) {
		return modelService.queryAll(model);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(int[] ids) {
		return modelService.dels(ids);
	}

	@RequestMapping(value = "add")
	@ResponseBody
	public int add(
			@RequestParam(value = "file", required = false) MultipartFile[] file,
			Model model, HttpServletRequest request) throws Exception {

		List<String> rs = FileUpload.uplaods(file, request);
		model.setModelPhoto(rs.get(0));

		return modelService.add(model);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(
			@RequestParam(value = "file", required = false) MultipartFile[] file,
			Model model, HttpServletRequest request) {
		List<String> rs = FileUpload.uplaods(file, request);
		model.setModelPhoto(rs.get(0));
		return modelService.update(model);
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月10日 上午3:04:13
	 * @see com.aaa.controller.CompanyController#existCompanyName(String)
	 * @param modelName
	 * @return
	 */
	@RequestMapping("existModelName")
    @ResponseBody
	public boolean existModelName(String modelName){
	    return modelService.existModelName(modelName);
	}
}
