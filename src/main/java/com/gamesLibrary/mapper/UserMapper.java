package com.gamesLibrary.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.gamesLibrary.security.CustomUserDetails;

public interface UserMapper {
	
	//Create
		@Insert("insert into users (userid, username, password, email, authority, registerdate) values (user_seq.nextval, #{ CustomUserDetails.userName }, #{ CustomUserDetails.password }, #{ CustomUserDetails.eMail }, 'ROLE_USER', sysdate)")
		public void insertUser(@Param("CustomUserDetails") CustomUserDetails customUserDetails);
		
	//Read
		@Select("select * from users where username = #{ userName }")
		public CustomUserDetails getUserByUserName(@Param("userName") String userName);
		
	//Update
		
	//Delete
}
