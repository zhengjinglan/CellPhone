package com.aaa.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
	
	public List<Map<String,Object>> queryOfa(User u){
		return maper.queryOfa(u);
	}
	public int queryuser(User u){
		List<User>list=maper.queryUser(u);
		if (list.size() >= 1) {
			return 0;
		}  else {
			return 2;
		}
	}
	
}
