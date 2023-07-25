package com.gamesLibrary.mapper;

import org.apache.ibatis.annotations.Select;

import com.gamesLibrary.domain.Game;

public interface GameMapper {

	@Select("select title from gamelist where gameid=1")
	public String getOneGame();
	
}
