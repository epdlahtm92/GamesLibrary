package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Game;

public interface GameMapper {

	//create
		//Game
		@Insert("insert into gamelist (gameid, title, developer, developercountry, publisher, publishercountry, seriesname, seriesnumber, genre, imgpath, price, releasedate, description) values (#{ Game.gameId }, #{ Game.title }, #{ Game.developer }, #{ Game.developerCountry }, #{ Game.publisher }, #{ Game.publisherCountry }, #{ Game.seriesName }, #{ Game.seriesNumber }, #{ Game.genre }, #{ Game.imgPath }, #{ Game.price }, #{ Game.releaseDate }, #{ Game.description })")
		public void insertOneGame(@Param("Game") Game game);
		
		//Board
		@Insert("insert into board (rootid, postid, title, content, username) values (${Board.rootId}, ${Board.postId}, #{Board.title}, #{Board.content}, #{Board.userName})")
		public void insertOneBoard(@Param("Board") Board board);
		
	//read
		//Game
		@Select("select * from gamelist where gameid=1")
		public Game getOneGame();
		
		@Select("select * from gamelist order by gameid")
		public List<Game> getAllGame();
		
		@Select("select * from gamelist where lower(title) like '%${ gameTitle }%'")
		public List<Game> getGameListByTitle(@Param("gameTitle") String gameTitle);
	
		//Board
		@Select("select * from board order by postid")
		public List<Board> getAllPosts();
		
		
	//update
		//game
		
		//board
	
	//delete
		//game
		@Delete("delete from gamelist where gameid = ${ gameid }")
		public void deleteOneGame(@Param("gameid") int gameid);
		
		//board
}
