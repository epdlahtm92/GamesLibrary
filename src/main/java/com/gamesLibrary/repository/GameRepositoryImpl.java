package com.gamesLibrary.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;
import com.gamesLibrary.domain.Reply;
import com.gamesLibrary.mapper.GameMapper;

@Repository
public class GameRepositoryImpl implements GameRepository {
	
	@Autowired
	private GameMapper gameMapper;
	
	private List<Game> listOfGames = new ArrayList<Game>();
	private List<Board> listOfBoards = new ArrayList<Board>();
	private List<Reply> listOfReply = new ArrayList<Reply>();
	
	public GameRepositoryImpl() {
		super();
	}

	public GameRepositoryImpl(GameMapper gameMapper, List<Game> listOfGames, List<Board> listOfBoards) {
		super();
		this.gameMapper = gameMapper;
		this.listOfGames = listOfGames;
		this.listOfBoards = listOfBoards;
	}

	@Override
	public List<Game> getAllGameList() {
		listOfGames = gameMapper.getAllGame();
		return listOfGames;
	}

	@Override
	public Game getGameId(String gameId) {
		listOfGames = gameMapper.getAllGame();
		listOfReply = gameMapper.getAllReply(gameId, "game");
		Game gameInfo = null;
		for (Game game : listOfGames) {
			if (game != null && game.getGameId() != 0 && game.getGameId() == Integer.parseInt(gameId)) {
				gameInfo = game;
				break;
			}
		}
		if (gameInfo == null) {
			throw new IllegalArgumentException("해당 아이디의 게임 정보를 찾을 수 없습니다. : " + gameId);
		}
		return gameInfo;
	}
	
	@Override
	public Board getPostById(String postId) {
		Board boardInfo = null;
		for (Board board : listOfBoards) {
			if (board != null && board.getPostId() != 0 && board.getPostId() == Integer.parseInt(postId)) {
				boardInfo = board;
				break;
			}
		}
		if (boardInfo == null) {
			throw new IllegalArgumentException("해당 글 찾을 수 없음" + postId);
		}
		return boardInfo;
	}
	@Override
	public List<Board> getAllBoardList() {
		listOfBoards = gameMapper.getAllPosts();
		return listOfBoards;
	}
	
	@Override
	public List<Game> getGameListByTitle(String title) {
		listOfGames = gameMapper.getGameListByTitle(title.toLowerCase());
		return listOfGames;
	}
	
	@Override
	public List<Game> getGameListByGenre(String genre) {
		List<Game> gamesByGenre = new ArrayList<Game>();
		for (Game game : listOfGames) {
			if (genre.equalsIgnoreCase(game.getGenre())) {
				gamesByGenre.add(game);
			}
		}
		return gamesByGenre;
	}

	@Override
	public Set<Game> getGameListByFilter(Map<String, List<String>> filter) {
		Set<Game> gamesByPublisher = new HashSet<Game>();
		Set<Game> gamesByGenre = new HashSet<Game>();
		
		Set<String> filterKeys = filter.keySet();
		if(filterKeys.contains("publisher")) {
			for (int i = 0; i < filter.get("publisher").size(); i++) {
				String publisherName = filter.get("publisher").get(i);
				for (Game game : listOfGames) {
					if (publisherName.equalsIgnoreCase(game.getPublisher())) {
						gamesByPublisher.add(game);
					}
				}
			}
			if (filterKeys.contains("genre")) {
				for (int i = 0; i < filter.get("genre").size(); i++) {
					String genre = filter.get("genre").get(i);
					List<Game> gameList = getGameListByGenre(genre);
					gamesByGenre.addAll(gameList);
				}
			}
		}
		gamesByGenre.retainAll(gamesByPublisher);
		
		return gamesByGenre;
	}

	@Override
	public void setNewGame(Game game) {
		gameMapper.insertOneGame(game);
	}

	@Override
	public void deleteOneGame(int gameid) {
		gameMapper.deleteOneGame(gameid);
	}

	@Override
	public void setNewPost(Board board) {
		gameMapper.insertOneBoard(board);
	}

	@Override
	public void updateOneGame(Game game) {
		gameMapper.updateOneGame(game);
	}

	@Override
	public void deleteOnePost(int postId) {
		gameMapper.deleteOnePost(postId);
	}

	@Override
	public void updateOnePost(Board board) {
		gameMapper.updateOnePost(board);
		
	}

	@Override
	public List<Reply> getAllReply(String rootId, String category) {
		listOfReply = gameMapper.getAllReply(rootId, category);
		return listOfReply;
	}

	@Override
	public void setNewReply(Reply reply) {
		gameMapper.insertReply(reply);
	}

	

}
