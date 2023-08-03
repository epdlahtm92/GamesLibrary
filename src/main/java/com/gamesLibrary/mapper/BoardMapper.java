package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.gamesLibrary.domain.Board;

public interface BoardMapper {
	
	//Create
		@Insert("insert into board (rootid, postid, title, content, username, postdate) values (${Board.rootId}, board_seq.nextval, #{Board.title}, #{Board.content}, #{Board.userName}, sysdate)")
		public void insertOneBoard(@Param("Board") Board board);
		
	//Read
		@Select("select * from board order by postid")
		public List<Board> getAllPosts();
	
	//Update
		@Update("update board set title= #{ Board.title }, content = #{ Board.content }, postdate = sysdate where postid = ${ Board.postId }")
		public void updateOnePost(@Param("Board") Board board);

	//Delete
		@Delete("delete from board where postid = ${ postId }")
		public void deleteOnePost(@Param("postId") int postId);
}
