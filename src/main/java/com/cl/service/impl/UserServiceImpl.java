package com.cl.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.cl.dao.UserDao;
import com.cl.domain.User;
import com.cl.service.UserService;

@Transactional
public class UserServiceImpl implements UserService{

	public void setUserDao(UserDao userdao) {
		this.userDao = userdao;
	}


	private UserDao userDao;
	
	
	@Override
	public User login(User user) {
		
		return userDao.findUserByName(user);
	}

}
