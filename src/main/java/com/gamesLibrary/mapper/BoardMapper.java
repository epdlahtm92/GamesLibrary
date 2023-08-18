package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gamesLibrary.domain.Board;

@Mapper
public interface BoardMapper {
	
	//Create
		public void insertOneBoard(@Param("Board") Board board);
		
	//Read
		public List<Board> getAllBoard();
	
	//Update
		public void updateOneBoard(@Param("Board") Board board);

	//Delete
		public void deleteOneBoard(@Param("boardId") int boardId);
}
