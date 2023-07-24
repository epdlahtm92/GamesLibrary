package com.gamesLibrary.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Game;

public interface GameRepository {

	//Create
	
	//Read
		List<Game> getAllGameList();
		
		Game getGameId(String gameId);
		
		List<Game> getGameListByGenre(String genre);
		
		List<Game> getGameListByTitle(String title);
		
		Set<Game> getGameListByFilter(Map<String, List<String>> filter);
		
		void setNewGame(Game game, String imageFileName);
	
	//Update
	
	//Delete
}
