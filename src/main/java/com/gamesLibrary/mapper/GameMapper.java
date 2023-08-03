package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.gamesLibrary.domain.Game;

public interface GameMapper {

	//Create
		@Insert("insert into gamelist (gameid, title, developer, developercountry, publisher, publishercountry, seriesname, seriesnumber, genre, imgpath, price, releasedate, description) values (gamelist_seq.NEXTVAL, #{ Game.title }, #{ Game.developer }, #{ Game.developerCountry }, #{ Game.publisher }, #{ Game.publisherCountry }, #{ Game.seriesName }, #{ Game.seriesNumber }, #{ Game.genre }, #{ Game.imgPath }, #{ Game.price }, #{ Game.releaseDate }, #{ Game.description })")
		public void insertOneGame(@Param("Game") Game game);
		
	//Read
		@Select("select * from gamelist where gameid=1")
		public Game getOneGame();
		
		@Select("select * from gamelist order by gameid")
		public List<Game> getAllGame();
		
		@Select("select * from gamelist where lower(title) like '%${ gameTitle }%'")
		public List<Game> getGameListByTitle(@Param("gameTitle") String gameTitle);
			
	//update
		@Update("update gamelist set title= #{ Game.title }, developer = #{ Game.developer }, developercountry = #{ Game.developerCountry }, publisher = #{ Game.publisher }, publishercountry= #{ Game.publisherCountry }, seriesname = #{ Game.seriesName }, seriesnumber = #{ Game.seriesNumber }, genre = #{ Game.genre }, imgpath = #{ Game.imgPath }, price = #{ Game.price }, releasedate = #{ Game.releaseDate }, description = #{ Game.description } where gameid= ${ Game.gameId }")
		public void updateOneGame(@Param("Game") Game game);	
		
	//delete
		@Delete("delete from gamelist where gameid = ${ gameid }")
		public void deleteOneGame(@Param("gameid") int gameid);
		
		
}
