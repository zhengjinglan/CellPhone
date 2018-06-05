package com.aaa.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.UsersDao;
import com.aaa.entity.Users;

@Service
public class UsersService {

	@Autowired
	private UsersDao userdao;


	public int checkUsers(Users u, HttpSession session) {
		List<Users> list = userdao.query(u);
		if (list.size() == 1) {
			session.setAttribute("logUser", list.get(0));
			System.out.println(list.get(0));
			return 0;
		} else if (list.size() > 1) {
			return 1;
		} else {
			return 2;
		}
	}

	public List<Users> queryUsers(Users u) {
		return userdao.query(u);
	}
	
	public int update(Users u) {
		
		return userdao.update(u);
	}
}
