package com.gamesLibrary.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.domain.Reply;

public interface Service {

	interface GameService {
		//Create
			void setNewGame(Game game);

		//Read
			List<Game> getAllGameList();
	
			Game getGameId(String gameId);
	
			List<Game> getGameListByTitle(String title);
	
			List<Game> getGameListByGenre(String genre);
	
			Set<Game> getGameListByFilter(Map<String, List<String>> filter);

		//Update
			void updateOneGame(Game game);
		
		//Delete
			void deleteOneGame(int gameid);
	}

	interface BoardService {
		//Create
			void setNewPost(Board board);
		
		//Read
			List<Board> getAllBoardList();

			Board getPostById(String postId);
		
		//Update
			void updateOnePost(Board board);
		
		//Delete
			void deleteOnePost(int postId);
	}

	interface ReplyService {
		//Create
			void setNewReply(Reply reply);
		
		//Read
			List<Reply>getAllReply(String rootId, String category);
		
		//Update

		//Delete
	}

}
