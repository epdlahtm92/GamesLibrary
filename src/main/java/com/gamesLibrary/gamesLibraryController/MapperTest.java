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
		System.out.println("타이틀 : " + gameMapper.getOneGame().getTitle());
		System.out.println("개발사 : " + gameMapper.getOneGame().getDeveloper());
		System.out.println("배급사 : " + gameMapper.getOneGame().getPublisher());
		System.out.println("가격 : " + gameMapper.getOneGame().getPrice());
		System.out.println("가격 : " + gameMapper.getOneGame().getPriceToString());
		System.out.println("설명 : " + gameMapper.getOneGame().getDescription());
		
	}
}