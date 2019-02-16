package com.cl.domain;


public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	private Integer id;
	private String name;
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
