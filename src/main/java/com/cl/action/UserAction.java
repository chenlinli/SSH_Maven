package com.cl.action;

import com.cl.domain.User;
import com.cl.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	@Override
	public User getModel() {
		
		return user;
	}
	
	private UserService userService;
	
	public String login(){
		User user2 = userService.login(user);
		if(user2==null){
			return "fail";
		}
		return "login";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
