package com.cl.dao;

import java.util.List;

import com.cl.domain.User;

public interface UserDao {

	User findUserByName(User user);
	List<User> findAll();

}
