package com.gamesLibrary.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.domain.Reply;

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
			
			Board getPostById(String postId);
			
		//reply
			List<Reply> getAllReply(String rootId, String category);
	
	//Update
		//game
			void updateOneGame(Game game);
			
		//board
			void updateOnePost(Board board);
			
	//Delete
		//game
			void deleteOneGame(int gameid);
		
		//board
			void deleteOnePost(int postId);
		
}
