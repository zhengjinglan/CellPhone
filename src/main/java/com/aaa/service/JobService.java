package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.JobMapper;
import com.aaa.entity.Job;
import com.aaa.entity.JobExample;

@Service
public class JobService {

	@Autowired
	JobMapper jobMapper;

	public List<Job> queryPage(Integer pageNum, Integer pageSize) {
		JobExample job = new JobExample();

		if (pageNum != null) {
			job.setOffset((pageNum - 1) * pageSize);
			job.setLimit(pageSize);
		}
		return jobMapper.selectByExample(job);
	}


	public List<Job> queryAll(Job job) {
		JobExample jobExample = new JobExample();
		return jobMapper.selectByExample(jobExample);
	}

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			list.add(i);
		}
		JobExample job = new JobExample();
		job.createCriteria().andJobIdIn(list);
		int rs = jobMapper.deleteByExample(job);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int add(Job job) {
		System.out.println(job);
		return jobMapper.insert(job);
	}

	public int update(Job job) {
		JobExample jobExample = new JobExample();
		jobExample.createCriteria().andJobIdEqualTo(job.getJobId());

		return jobMapper.updateByExampleSelective(job, jobExample);
	}

	public long getCount() {
		return jobMapper.countByExample(null);
	}
}
