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
		if (list.size() == 1) {
			System.out.println(list);
			return 0;
		} else if (list.size() > 1) {
			return 1;
		} else {
			return 2;
		}
	}
	
/*	public int checkUser(User u, HttpSession session) {
		UserExample user = new UserExample();
		user.createCriteria().andUserPhoneEqualTo(u.getUserPhone());
		List<User> list = maper.selectByExample(user);
		if (list.size() == 1) {
			session.setAttribute("logBeforeUser", list.get(0));
			System.out.println(list);
			return 0;
		} else if (list.size() > 1) {
			return 1;
		} else {
			return 2;
		}
	}*/

}
