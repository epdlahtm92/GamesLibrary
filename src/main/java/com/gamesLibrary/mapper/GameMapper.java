package com.gamesLibrary.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.gamesLibrary.domain.Game;

public interface GameMapper {

	@Select("select * from gamelist where gameid=1")
	public Game getOneGame();
	
	@Select("select * from gamelist")
	public List<Game> getAllGame();
	
}
