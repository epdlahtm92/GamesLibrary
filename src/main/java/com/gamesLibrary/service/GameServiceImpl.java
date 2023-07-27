package com.gamesLibrary.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Override
	public List<Game> getAllGameList() {
		// TODO Auto-generated method stub
		return gameRepository.getAllGameList();
	}

	@Override
	public Game getGameId(String gameId) {
		// TODO Auto-generated method stub
		return gameRepository.getGameId(gameId);
	}
	
	@Override
	public List<Game> getGameListByTitle(String title) {
		// TODO Auto-generated method stub
		List<Game> gamesByTitle = gameRepository.getGameListByTitle(title);
		return gamesByTitle;
	}

	@Override
	public List<Game> getGameListByGenre(String genre) {
		// TODO Auto-generated method stub
		List<Game> gamesByGenre = gameRepository.getGameListByGenre(genre);
		return gamesByGenre;
	}

	@Override
	public Set<Game> getGameListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		Set<Game> gamesByFilter = gameRepository.getGameListByFilter(filter);
		return gamesByFilter;
	}

	@Override
	public void setNewGame(Game game) {
		// TODO Auto-generated method stub
		gameRepository.setNewGame(game);
	}

	@Override
	public void deleteOneGame(int gameid) {
		// TODO Auto-generated method stub
		gameRepository.deleteOneGame(gameid);
		
	}

	@Override
	public List<Board> getAllBoardList() {
		// TODO Auto-generated method stub
		return gameRepository.getAllBoardList();
	}

	@Override
	public void setNewPost(Board board) {
		// TODO Auto-generated method stub
		gameRepository.setNewPost(board);
		
	}

}
