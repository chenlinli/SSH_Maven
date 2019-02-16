package com.cl.dao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cl.dao.UserDao;
import com.cl.domain.User;

public class UserDaoTest {
	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserDao dao = (UserDao) ac.getBean("userDao");
		User user = new User("aa");
		System.out.println(dao.findUserByName(user));
		//System.out.println(dao.findAll());
		
	}

}
