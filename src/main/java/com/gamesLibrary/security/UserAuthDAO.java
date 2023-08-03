package com.gamesLibrary.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamesLibrary.mapper.GameMapper;

@Repository("userAuthDAO")
public class UserAuthDAO {
	
	@Autowired
	private GameMapper gameMapper;
	
	public CustomUserDetails getUserByUserName(String userName) {
		return gameMapper.getUserByUserName(userName);
	}
}
