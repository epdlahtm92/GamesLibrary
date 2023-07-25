package com.gamesLibrary.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamesLibrary.domain.Game;
import com.gamesLibrary.mapper.GameMapper;

@Repository
public class GameRepositoryImpl implements GameRepository {
	
	@Autowired
	private GameMapper gameMapper;
	
	private List<Game> listOfGames = new ArrayList<Game>();
	
//	public GameRepositoryImpl() {
//		//Game(String title, String developer, String publisher, String seriesName)
//		Game game1 = new Game("Monster Hunter World", "CAPCOM", "CAPCOM", "Monster Hunter", 63000);
//		game1.setGameId(1);
//		game1.setDeveloperCountry("Japan");
//		game1.setPublisherCountry("Japan");
//		game1.setSeriesNumber(5);
//		game1.setGenre("Action");
//		game1.setReleaseDate("2018-01-26");
//		game1.setDescription("Hunting Dragons and Huge Monsters");
//		game1.setImgPath("MonsterHunterWorld.jpg");
//	
//		Game game2 = new Game("EA Sports FC 24", "EA", "EA", "FIFA", 73000);
//		game2.setGameId(2);
//		game2.setDeveloperCountry("USA");
//		game2.setPublisherCountry("USA");
//		game2.setSeriesNumber(24);
//		game2.setGenre("Sports");
//		game2.setReleaseDate("2023-09-29");
//		game2.setDescription("Football simulation");
//		game2.setImgPath("EASportsFC24.jpg");
//		
//		Game game3 = new Game("The Legend of Zelda Tears of the Kingdom", "Nintendo", "Nintendo", "The Legend of Zelda", 74800);
//		game3.setGameId(3);
//		game3.setDeveloperCountry("Japan");
//		game3.setPublisherCountry("Japan");
//		game3.setSeriesNumber(7);
//		game3.setGenre("Action");
//		game3.setReleaseDate("2023-05-12");
//		game3.setDescription("Open world action role playing game");
//		game3.setImgPath("TheLegendOfZeldaTearsOfTheKingdom.jpg");
//		
//		Game game4 = new Game("F1 23", "EA", "EA", "F1", 99000);
//		game4.setGameId(4);
//		game4.setDeveloperCountry("USA");
//		game4.setPublisherCountry("USA");
//		game4.setSeriesNumber(23);
//		game4.setGenre("Sports");
//		game4.setReleaseDate("2023-05-12");
//		game4.setDescription("Open wheel racing simulation");
//		game4.setImgPath("F123.jpg");
//		
//		Game game5 = new Game("Call Of Duty Modern Warfare 2", "Infinitiy Ward", "Activision", "Call Of Duty", 84500);
//		game5.setGameId(5);
//		game5.setDeveloperCountry("USA");
//		game5.setPublisherCountry("USA");
//		game5.setSeriesNumber(8);
//		game5.setGenre("First Person Shooter");
//		game5.setReleaseDate("2022-10-28");
//		game5.setDescription("Global NO.1 FPS game with free Battle Royal mode");
//		game5.setImgPath("CallOfDutyModernWarfare2.jpg");
//		
//		Game game6 = new Game("Diablo 4", "Blizzard", "Blizzard", "Diablo", 84500);
//		game6.setGameId(6);
//		game6.setDeveloperCountry("USA");
//		game6.setPublisherCountry("USA");
//		game6.setSeriesNumber(4);
//		game6.setGenre("Hack and Slash");
//		game6.setReleaseDate("2023-06-05");
//		game6.setDescription("4th adventure to hunt devils");
//		game6.setImgPath("Diablo4.jpg");
//		
//		Game game7 = new Game("Heroes Of The Storm", "Blizzard", "Blizzard", "Heroes Of The Storm", 0);
//		game7.setGameId(7);
//		game7.setDeveloperCountry("USA");
//		game7.setPublisherCountry("USA");
//		game7.setSeriesNumber(1);
//		game7.setGenre("Multiplayer Online Battle Arena / AOS");
//		game7.setReleaseDate("2023-06-05");
//		game7.setDescription("Battle of Heroes from Blizzard game universe");
//		game7.setImgPath("HeroesOfTheStorm.jpg");
//		
//		Game game8 = new Game("League Of Legends", "Riot Games", "Riot Games", "League Of Legends", 0);
//		game8.setGameId(8);
//		game8.setDeveloperCountry("USA");
//		game8.setPublisherCountry("USA");
//		game8.setSeriesNumber(1);
//		game8.setGenre("Multiplayer Online Battle Arena / AOS");
//		game8.setReleaseDate("2009-10-27");
//		game8.setDescription("Global No.1 e-sports");
//		game8.setImgPath("LeagueOfLegends.jpg");
//		
//		Game game9 = new Game("The Witcher 3 Wild Hunt", "CD Projekt Red", "CD Projekt Red", "The Witcher", 55000);
//		game9.setGameId(9);
//		game9.setDeveloperCountry("Poland");
//		game9.setPublisherCountry("Poland");
//		game9.setSeriesNumber(3);
//		game9.setGenre("Open world action role playing game");
//		game9.setReleaseDate("2015-05-18");
//		game9.setDescription("Fantasy Action RPG from polish novel");
//		game9.setImgPath("TheWitcher3WildHunt.jpg");
//		
//		Game game10 = new Game("Yakuza Like A Dragon", "Ryu Ga Gotoku Studio", "SEGA", "Yakuza", 55000);
//		game10.setGameId(10);
//		game10.setDeveloperCountry("Japan");
//		game10.setPublisherCountry("Japan");
//		game10.setSeriesNumber(8);
//		game10.setGenre("Role Playing");
//		game10.setReleaseDate("2020-01-16");
//		game10.setDescription("like a drogon!!!");
//		game10.setImgPath("YakuzaLikeADragon.jpg");
//		
//		listOfGames.add(game1);
//		listOfGames.add(game2);
//		listOfGames.add(game3);
//		listOfGames.add(game4);
//		listOfGames.add(game5);
//		listOfGames.add(game6);
//		listOfGames.add(game7);
//		listOfGames.add(game8);
//		listOfGames.add(game9);
//		listOfGames.add(game10);
//	}

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
		List<Game> gamesByTitle = new ArrayList<Game>();
		for (Game game : listOfGames) {
			if (game.getTitle().contains(title)) {
				gamesByTitle.add(game);
			}
		}
		return gamesByTitle;
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
	public void setNewGame(Game game, String imageFileName) {
		// TODO Auto-generated method stub
		game.setImgPath(imageFileName);
		listOfGames.add(game);
	}

}
