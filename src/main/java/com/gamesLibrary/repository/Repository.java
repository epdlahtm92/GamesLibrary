package com.gamesLibrary.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.domain.Reply;

public interface Repository {


	interface GameRepository {
		//Create
		void setNewGame(Game game);

		//Read
		List<Game> getAllGameList();

		Game getGameId(String gameId);

		List<Game> getGameListByGenre(String genre);

		List<Game> getGameListByTitle(String title);

		Set<Game> getGameListByFilter(Map<String, List<String>> filter);

		//Update
		void updateOneGame(Game game);

		//Delete
		void deleteOneGame(int gameid);


	}

	interface BoardRepository {
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
	
	interface ReplyRepository {
		//Create
		void setNewReply(Reply reply);

		//Read
		List<Reply> getAllReply(String rootId, String category);

		//Update

		//Delete

	
	}
}
