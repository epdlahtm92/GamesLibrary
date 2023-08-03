package com.gamesLibrary.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.domain.Reply;

public interface GameService {

	//Create
		//game
			void setNewGame(Game game);
			
		//board
			void setNewPost(Board board);
			
		//reply
			void setNewReply(Reply reply);
	
	//Read
		//game
			List<Game> getAllGameList();
			
			Game getGameId(String gameId);
		
			List<Game> getGameListByTitle(String title);
			
			List<Game> getGameListByGenre(String genre);
			
			Set<Game> getGameListByFilter(Map<String, List<String>> filter);
			
		//board
			List<Board> getAllBoardList();
			
			Board getPostById(String postId);
		
		//reply
			List<Reply>getAllReply(String rootId, String category);
		
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
