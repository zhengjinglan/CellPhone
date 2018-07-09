package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	public int add(Manager manager) {
		return managerMapper.insert(manager);
	}

	// 查询用户信息
	public List<Manager> queryUsers(Manager manager, Integer page, Integer rows) {
		ManagerExample manageExample = new ManagerExample();

		if (page != null) {
			manageExample.setOffset((page - 1) * rows);
			manageExample.setLimit(rows);
		}
		return managerMapper.selectByExample(manageExample);
	}

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			list.add(i);
		}
		ManagerExample manageExample = new ManagerExample();
		manageExample.createCriteria().andUidIn(list);
		int rs = managerMapper.deleteByExample(manageExample);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

	public int update(Manager manager) {
		ManagerExample managerExmple = new ManagerExample();
		managerExmple.createCriteria().andUidEqualTo(manager.getUid());

		return managerMapper.updateByExampleSelective(manager, managerExmple);
	}

	public long getCount() {
		return managerMapper.countByExample(null);
	}

	public List<Map<String, Object>> query() {
		return managerMapper.query();
	}
	/**
	 * 
	 * @author 小黑
	 * @date 2018年7月10日 上午2:58:22
	 * @see com.aaa.service.ConsumeItemService#existItemName(String)
	 * @param uname
	 * @return
	 */
	public boolean existUname(String uname){
	    ManagerExample exp = new ManagerExample();
	    exp.createCriteria().andUnameEqualTo(uname);
	    return managerMapper.selectByExample(exp).size() > 0 ? true : false;
	}
}
