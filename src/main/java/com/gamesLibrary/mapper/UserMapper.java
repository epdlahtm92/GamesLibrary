package com.gamesLibrary.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gamesLibrary.security.CustomUserDetails;

@Mapper
public interface UserMapper {
	
	//Create
		public void insertOneUser(@Param("CustomUserDetails") CustomUserDetails customUserDetails);
		
	//Read
		public CustomUserDetails getUserByUserName(@Param("userName") String userName);
		
	//Update
		
	//Delete
}
