package com.gamesLibrary.gamesLibraryController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gamesLibrary.mapper.GameMapper;

import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class MapperTest {

	@Setter(onMethod_ = @Autowired)
	private GameMapper gameMapper;
	
	@Test
	public void testGetGame() {
//		System.out.println(gameMapper.getOneGame().getGameId());
//		System.out.println(gameMapper.getOneGame().getTitle());
//		System.out.println(gameMapper.getOneGame().getDeveloper());
//		System.out.println(gameMapper.getOneGame().getDeveloperCountry());
//		System.out.println(gameMapper.getOneGame().getPublisher());
//		System.out.println(gameMapper.getOneGame().getPublisherCountry());
//		System.out.println(gameMapper.getOneGame().getSeriesName());
//		System.out.println(gameMapper.getOneGame().getSeriesNumber());
//		System.out.println(gameMapper.getOneGame().getGenre());
//		System.out.println(gameMapper.getOneGame().getPriceToString());
//		System.out.println(gameMapper.getOneGame().getReleaseDate());
//		System.out.println(gameMapper.getOneGame().getDescription());
		System.out.println(gameMapper.getOneGame());
	}
}