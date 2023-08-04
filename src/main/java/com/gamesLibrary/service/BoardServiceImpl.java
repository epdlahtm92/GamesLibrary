package com.gamesLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.repository.Repository;
import com.gamesLibrary.service.Service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private Repository.BoardRepository boardRepository;
	
	@Override
	public List<Board> getAllBoardList() {
		return boardRepository.getAllBoardList();
	}
	@Override
	public Board getPostById(String postId) {
		return boardRepository.getPostById(postId);
	}
	@Override
	public void setNewPost(Board board) {
		boardRepository.setNewPost(board);
		
	}
	
	@Override
	public void deleteOnePost(int postId) {
		boardRepository.deleteOnePost(postId);
		
	}

	@Override
	public void updateOnePost(Board board) {
		boardRepository.updateOnePost(board);
		
	}
}
