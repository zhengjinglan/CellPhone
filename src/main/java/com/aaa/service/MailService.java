package com.aaa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.MailInfoMapper;
import com.aaa.entity.MailInfo;

@Service
public class MailService {
	
	@Autowired
	MailInfoMapper mapper;
	
	public int add(MailInfo m){
		return mapper.insert(m);
		
	}
	
	public int update(MailInfo m){
		return mapper.updateMail(m);
	}

}
