package com.gamesLibrary.gamesLibraryController;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gamesLibrary.domain.Game;
import com.gamesLibrary.service.GameService;

@Controller
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping("/home")
	public String requestGameHome(Model model) {
		return "home";
	}
	
	@GetMapping("/all")
	public String requestGameList(Model model) {
		List<Game> gameList = gameService.getAllGameList();
		model.addAttribute("gameList", gameList);
		
		return "games";
	}
	
	@GetMapping("/game")
	public String requestByGameId(@RequestParam("id") String gameId, Model model) {
		Game game = gameService.getGameId(gameId);
		model.addAttribute("game", game);
		
		return "game";
	}
	
	@GetMapping("/title/{title}")
	public String requestGamesByTitle(@PathVariable("title") String gameTitle, Model model) {
		List<Game> gamesByTitle = gameService.getGameListByGenre(gameTitle);
		model.addAttribute("gameList", gamesByTitle);
		
		return "games";
	}
	
	@GetMapping("/genre/{genre}")
	public String requestGamesByGenre(@PathVariable("genre") String gameGenre, Model model) {
		List<Game> gamesByGenre = gameService.getGameListByGenre(gameGenre);
		model.addAttribute("gameList", gamesByGenre);
		
		return "games";
	}
	
	@GetMapping("/filter/{gameFilter}")
	public String requestGameByFilter(@MatrixVariable(pathVar="gameFilter") Map<String, List<String>> filter, Model model) {
		Set<Game> gamesByFilter = gameService.getGameListByFilter(filter);
		model.addAttribute("gameList", gamesByFilter);
		
		return "games";
	}
	
	@GetMapping("/admin/add")
	public String requestAddGameForm(@ModelAttribute("newGame") Game game) {
		return "addGame";
	}
	
	@PostMapping("/admin/add")
	public String submitAddNewGame(@ModelAttribute("newGame") Game game, HttpServletRequest requset, HttpSession session) {
		String imageFileName = game.getGameId() + "_" + game.getTitle() + "_" + game.getImageFile().getOriginalFilename();
		
		try {
			game.getImageFile().transferTo(new File("C:\\03StringWorkspace\\GamesLibrary\\src\\main\\webapp\\resources\\imageFiles\\" + imageFileName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		gameService.setNewGame(game , imageFileName);
		return "redirect:/all";
	}
	
	@ModelAttribute
	public void addAttribute(Model model) {
		model.addAttribute("addTitle", "신규 게임 등록");
	}
	
//	@InitBinder
//	public void initBinder(WebDataBinder webDataBinder) {
//		webDataBinder.setAllowedFields();
//		webDataBinder.setDisallowedFields();
//	}
	
}
