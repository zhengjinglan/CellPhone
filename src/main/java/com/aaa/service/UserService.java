package com.aaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.UserMapper;
import com.aaa.entity.User;
import com.aaa.entity.UserExample;


@Service
public class UserService {
	
	@Autowired
	UserMapper maper;
	
	public int add(User u){
		return maper.insert(u);
	}
	
	public List<User> queryUser(){
		UserExample user=new UserExample();
		return maper.selectByExample(user);
	}

}
