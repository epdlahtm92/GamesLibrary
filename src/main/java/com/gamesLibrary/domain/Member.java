package com.gamesLibrary.domain;

import java.sql.Date;

public class Member {
	private int userId;
	private String userName;
	private String password;
	private String eMail;
	private String role;
	private Date registerDate;
	
	public Member() {
		super();
	}

	public Member(int userId, String userName, String password, String eMail, String role, Date registerDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.role = role;
		this.registerDate = registerDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	
}
