package com.gamesLibrary.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;

public interface GameRepository {

	//Create
		//game
			void setNewGame(Game game);
		
		//board
			void setNewPost(Board board);
	
	//Read
		//game
		List<Game> getAllGameList();
		
		Game getGameId(String gameId);
		
		List<Game> getGameListByGenre(String genre);
		
		List<Game> getGameListByTitle(String title);
		
		Set<Game> getGameListByFilter(Map<String, List<String>> filter);
		
		//board
		List<Board> getAllBoardList();
	
	//Update
	
	//Delete
		
		void deleteOneGame(int gameid);
}
