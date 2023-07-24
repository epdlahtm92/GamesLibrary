package com.gamesLibrary.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Game;

public interface GameService {

	//Create
	
	//Read
		List<Game> getAllGameList();
		
		Game getGameId(String gameId);
	
		List<Game> getGameListByTitle(String title);
		
		List<Game> getGameListByGenre(String genre);
		
		Set<Game> getGameListByFilter(Map<String, List<String>> filter);
		
		void setNewGame(Game game, String imageFileName);
		
	//Update
	
	//Delete
}
