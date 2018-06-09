package com.aaa.dao;

import java.util.List;

import com.aaa.entity.Users;

public interface UsersDao {

	public List<Users> query(Users u);
	
	int update(Users u);
}
