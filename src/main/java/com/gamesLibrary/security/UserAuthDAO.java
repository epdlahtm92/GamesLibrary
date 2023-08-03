package com.gamesLibrary.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamesLibrary.mapper.UserMapper;

@Repository("userAuthDAO")
public class UserAuthDAO {
	
	@Autowired
	private UserMapper userMapper;
	
	//login
	public CustomUserDetails getUserByUserName(String userName) {
		return userMapper.getUserByUserName(userName);
	}
	
	//Create User
	public void createUser(CustomUserDetails customUserDetails) {
		userMapper.insertUser(customUserDetails);
	}
}
