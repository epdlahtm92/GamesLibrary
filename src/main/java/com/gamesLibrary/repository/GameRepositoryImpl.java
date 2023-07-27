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
import com.gamesLibrary.mapper.GameMapper;

@Repository
public class GameRepositoryImpl implements GameRepository {
	
	@Autowired
	private GameMapper gameMapper;
	
	private List<Game> listOfGames = new ArrayList<Game>();
	private List<Board> listOfBoards = new ArrayList<Board>();
	
	public GameRepositoryImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GameRepositoryImpl(GameMapper gameMapper, List<Game> listOfGames, List<Board> listOfBoards) {
		super();
		this.gameMapper = gameMapper;
		this.listOfGames = listOfGames;
		this.listOfBoards = listOfBoards;
	}

	@Override
	public List<Game> getAllGameList() {
		// TODO Auto-generated method stub
		listOfGames= gameMapper.getAllGame();
		return listOfGames;
	}

	@Override
	public Game getGameId(String gameId) {
		// TODO Auto-generated method stub
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
	public List<Game> getGameListByTitle(String title) {
		// TODO Auto-generated method stub
		listOfGames = gameMapper.getGameListByTitle(title.toLowerCase());
		return listOfGames;
	}
	
	@Override
	public List<Game> getGameListByGenre(String genre) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub 
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
		// TODO Auto-generated method stub
		gameMapper.insertOneGame(game);
	}

	@Override
	public void deleteOneGame(int gameid) {
		// TODO Auto-generated method stub
		gameMapper.deleteOneGame(gameid);
	}

	@Override
	public List<Board> getAllBoardList() {
		// TODO Auto-generated method stub
		listOfBoards = gameMapper.getAllPosts();
		return listOfBoards;
	}

	@Override
	public void setNewPost(Board board) {
		// TODO Auto-generated method stub
		gameMapper.insertOneBoard(board);
	}

}
