package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.gamesLibrary.domain.Game;

public interface GameMapper {

	@Select("select * from gamelist where gameid=1")
	public Game getOneGame();
	
	@Select("select * from gamelist")
	public List<Game> getAllGame();
	
	@Insert("insert into gamelist (gameid, title, developer, developercountry, publisher, publishercountry, seriesname, seriesnumber, genre, imgpath, price, releasedate, description) values (#{ Game.gameId }, #{ Game.title }, #{ Game.developer }, #{ Game.developerCountry }, #{ Game.publisher }, #{ Game.publisherCountry }, #{ Game.seriesName }, #{ Game.seriesNumber }, #{ Game.genre }, #{ Game.imgPath }, #{ Game.price }, #{ Game.releaseDate }, #{ Game.description })")
	public void insertOneGame(@Param("Game") Game game);
}
