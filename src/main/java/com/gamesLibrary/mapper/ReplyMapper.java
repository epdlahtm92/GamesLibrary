package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.gamesLibrary.domain.Reply;

public interface ReplyMapper {

	//Create
		@Insert("insert into reply (rootid, postid, username, content, postdate, category) values (${ Reply.rootId }, reply_seq.nextval, #{ Reply.userName }, #{ Reply.content }, sysdate, #{ Reply.category })")
		public void insertReply(@Param("Reply") Reply reply);
	
	//Read
		@Select("select * from reply where rootid = #{ rootId } and category = #{ category } order by postid")
		public List<Reply> getAllReply(@Param("rootId") String rootId, @Param("category") String category);

	//Update
	
	//Delete
		@Delete("delete from reply where rootid = ${ rootId } and category = #{ category }")
		public void deleteAllReply(@Param("Root") HashMap root)
	
}
