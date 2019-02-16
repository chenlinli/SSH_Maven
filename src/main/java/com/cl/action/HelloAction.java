package com.cl.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("进入HelloAction 返回默认jsp页面");
		return SUCCESS;
	}

}
