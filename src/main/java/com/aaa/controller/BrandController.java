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

import com.aaa.entity.Brand;
import com.aaa.service.BrandService;
import com.aaa.util.FileUpload;

@Controller
@RequestMapping("brand")
public class BrandController {
	
	@Autowired
	BrandService service;
	
	@RequestMapping("/queryBrand")
	@ResponseBody
	public List<Brand> queryBrand(Brand b){
		return service.queryBrand(b);
		
	}
	@RequestMapping("/add")
	@ResponseBody
	public int add(Brand b){
		System.out.println(b);
		return service.add(b);
	}
	@RequestMapping("/del")
	@ResponseBody
	public int del(int[] ids){
		return service.del(ids);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public int update(Brand b){
		return service.update(b);
	}
/*	@RequestMapping("/addBrand")
	@ResponseBody
	public int addBrand(@RequestParam("upfile")
	MultipartFile[] upfile,Brand b,HttpServletRequest request){
		System.out.println("****************************");
		//String rs="true";
		String path=request.getServletContext().getRealPath("upload");
		String savePath="";
		for (MultipartFile m : upfile) {

			savePath = FileUpload.uploadFile(upfile, path);
		}
		System.out.println(savePath);
		b.setBrand_icon(savePath);
		int rss=service.add(b);
		System.out.println(rss);
		return service.add(b);
	}*/


}
