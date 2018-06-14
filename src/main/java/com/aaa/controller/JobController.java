package com.aaa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Job;
import com.aaa.service.JobService;

@Controller
@RequestMapping("job")
public class JobController {

	@Autowired
	private JobService jobService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Job> list = jobService.queryPage(page, rows);
		long total = jobService.getCount();
		return new EasyuiPage(list, total);
	}


	@RequestMapping("queryAll")
	@ResponseBody
	public List<Job> queryAll(Job job) {
		return jobService.queryAll(job);
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(Integer[] ids) {
		System.out.println(ids);
		return jobService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Job job) {
		System.out.println(job);
		return jobService.add(job);
	}

	@RequestMapping("update")
	@ResponseBody
	public int update(Job job) {
		System.out.println(job);
		return jobService.update(job);
	}
}
