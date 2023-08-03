package com.gamesLibrary.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.domain.Reply;
import com.gamesLibrary.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Override
	public List<Game> getAllGameList() {
		return gameRepository.getAllGameList();
	}

	@Override
	public Game getGameId(String gameId) {
		return gameRepository.getGameId(gameId);
	}
	
	@Override
	public List<Game> getGameListByTitle(String title) {
		List<Game> gamesByTitle = gameRepository.getGameListByTitle(title);
		return gamesByTitle;
	}

	@Override
	public List<Game> getGameListByGenre(String genre) {
		List<Game> gamesByGenre = gameRepository.getGameListByGenre(genre);
		return gamesByGenre;
	}

	@Override
	public Set<Game> getGameListByFilter(Map<String, List<String>> filter) {
		Set<Game> gamesByFilter = gameRepository.getGameListByFilter(filter);
		return gamesByFilter;
	}

	@Override
	public void setNewGame(Game game) {
		gameRepository.setNewGame(game);
	}

	@Override
	public void deleteOneGame(int gameid) {
		gameRepository.deleteOneGame(gameid);
		
	}

	@Override
	public List<Board> getAllBoardList() {
		return gameRepository.getAllBoardList();
	}

	@Override
	public void setNewPost(Board board) {
		gameRepository.setNewPost(board);
		
	}

	@Override
	public void updateOneGame(Game game) {
		gameRepository.updateOneGame(game);
	}

	@Override
	public Board getPostById(String postId) {
		return gameRepository.getPostById(postId);
	}

	@Override
	public void deleteOnePost(int postId) {
		gameRepository.deleteOnePost(postId);
		
	}

	@Override
	public void updateOnePost(Board board) {
		gameRepository.updateOnePost(board);
		
	}

	@Override
	public List<Reply> getAllReply(String rootId, String category) {
		return gameRepository.getAllReply(rootId, category);
	}

	@Override
	public void setNewReply(Reply reply) {
		gameRepository.setNewReply(reply);
	}

}
