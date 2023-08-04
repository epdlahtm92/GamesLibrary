package com.gamesLibrary.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.mapper.BoardMapper;
import com.gamesLibrary.repository.Repository.BoardRepository;

@Repository
public class BoardRepositoryImpl implements BoardRepository {

	@Autowired
	private BoardMapper boardMapper;
	
	private List<Board> listOfBoards = new ArrayList<Board>();
	
	// Create
		@Override
		public void setNewPost(Board board) {
			boardMapper.insertOneBoard(board);
		}
		
	//Read
		@Override
		public List<Board> getAllBoardList() {
			listOfBoards = boardMapper.getAllPosts();
			return listOfBoards;
		}
	
		@Override
		public Board getPostById(String postId) {
			Board boardInfo = null;
			for (Board board : listOfBoards) {
				if (board != null && board.getPostId() != 0 && board.getPostId() == Integer.parseInt(postId)) {
					boardInfo = board;
					break;
				}
			}
			if (boardInfo == null) {
				throw new IllegalArgumentException("해당 글 찾을 수 없음" + postId);
			}
			return boardInfo;
		}
	
	//Update
		@Override
		public void updateOnePost(Board board) {
			boardMapper.updateOnePost(board);
		}
		
	//Delete
		@Override
		public void deleteOnePost(int postId) {
			boardMapper.deleteOnePost(postId);
		}
	
}
