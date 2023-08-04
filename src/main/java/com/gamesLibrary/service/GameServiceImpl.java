package com.gamesLibrary.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesLibrary.domain.Game;
import com.gamesLibrary.repository.Repository;
import com.gamesLibrary.service.Service.GameService;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	private Repository.GameRepository gameRepository;
	
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
	public void updateOneGame(Game game) {
		gameRepository.updateOneGame(game);
	}

	

	

	

}
