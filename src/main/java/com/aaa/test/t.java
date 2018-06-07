package com.aaa.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aaa.dao.LibararyDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml",
		"classpath:spring-mvc.xml" })
public class t {
	@Autowired
	LibararyDao dao;

	@Test
	public void m1() {
		Map<String, Object> node = new HashMap<String, Object>();
		node.put("libid", 995522);
		node.put("lname", "axx");
		node.put("url", "l.jsp");
		node.put("icon", "icon");
		node.put("parentlibid", 1);
		node.put("uid", 2080001);
		int rs = dao.addNode(node);
		System.out.println(rs);

	}

}
