package com.aaa.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ManagerMapper;
import com.aaa.dao.UsersDao;
import com.aaa.entity.Manager;
import com.aaa.entity.ManagerExample;
import com.aaa.entity.Users;

@Service
public class ManagerService {

	@Autowired
	private ManagerMapper managerMapper;

	public int checkUsers(Manager u, HttpSession session) {
		ManagerExample managerExample=new ManagerExample();
		managerExample.createCriteria().andUnameEqualTo(u.getUname());
		managerExample.createCriteria().andPwdEqualTo(u.getPwd());
		List<Manager> list = managerMapper.selectByExample(managerExample);
	
		if (list.size() == 1) {
			session.setAttribute("logUser", list.get(0));
			// System.out.println(list.get(0));
			return 0;
		} else if (list.size() > 1) {
			return 1;
		} else {
			return 2;
		}
	}

	
}
