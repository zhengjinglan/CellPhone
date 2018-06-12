package com.aaa.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.ManagerMapper;
import com.aaa.entity.Manager;
import com.aaa.entity.ManagerExample;

@Service
public class ManagerService {

	@Autowired
	private ManagerMapper managerMapper;

	public int checkUsers(Manager m, HttpSession session) {
		ManagerExample manager = new ManagerExample();
		manager.createCriteria().andUnameEqualTo(m.getUname());
		manager.createCriteria().andPwdEqualTo(m.getPwd());
		List<Manager> list = managerMapper.selectByExample(manager);
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

	/*
	 * public List<Users> queryUsers(Users u) { return userdao.query(u); }
	 * 
	 * public int update(Users u) {
	 * 
	 * return userdao.update(u); }
	 */
}
