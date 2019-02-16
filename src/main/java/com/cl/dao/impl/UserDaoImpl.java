package com.cl.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.cl.dao.UserDao;
import com.cl.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User findUserByName(User user) {
		System.out.println(user.getName());
		 List<User> list = (List<User>) this.getHibernateTemplate().find("from User where name = ? and password = ?", user.getName(),user.getPassword());
		 if(list.size()>0){
			 return list.get(0);
		 }
		 System.out.println("none ");
		 return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return (List<User>) this.getHibernateTemplate().find("from User");
	}
	
	

}
