package com.model;

public class Student {

	private String username;
	private String password;
	private int sid;
	private String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	
	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + ", sid=" + sid + ", name=" + name + "]";
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
