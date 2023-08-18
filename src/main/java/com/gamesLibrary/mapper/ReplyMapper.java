package com.gamesLibrary.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gamesLibrary.domain.Reply;

@Mapper
public interface ReplyMapper {

	//Create
		public void insertOneReply(@Param("Reply") Reply reply);
	
	//Read
		public List<Reply> getAllReply(@Param("rootId") String rootId, @Param("category") String category);

	//Update
	
	//Delete
		public void deleteAllReply(@Param("Root") HashMap root);
	
}
