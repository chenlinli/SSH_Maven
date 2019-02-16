package com.cl.service.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cl.domain.User;
import com.cl.service.UserService;

public class UserServiceTest {

	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		UserService ser = (UserService) ac.getBean("userService");
		System.out.println(ser.login(new User("aa")));
	}
}
