package com.ab.models;

public class User {
	
	private int userId;
	private String userName;
	private String emailAddress;
	
	public User(int userId, String userName, String emailAddress){
		
		this.userId = userId;
		this.userName = userName;
		this.emailAddress = emailAddress;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "User ID: " + this.userId + "User Name: " + this.userName + "User Email: " + this.emailAddress;
	}
}
