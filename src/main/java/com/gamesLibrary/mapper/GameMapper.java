package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gamesLibrary.domain.Game;

@Mapper
public interface GameMapper {

	//Create
		public void insertOneGame(@Param("Game") Game game);
		
	//Read		
		public List<Game> getAllGame();
		
		public List<Game> getGameListByTitle(@Param("gameTitle") String gameTitle);
			
	//update
		public void updateOneGame(@Param("Game") Game game);	
		
	//delete
		public void deleteOneGame(@Param("gameid") int gameid);
		
		
}
