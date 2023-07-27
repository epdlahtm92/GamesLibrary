package com.gamesLibrary.gamesLibraryController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.service.GameService;

@Controller
public class BoardController {
	@Autowired
	private GameService gameService;
	
	@GetMapping("/boardList")
	public String requestBoardList(Model model) {
		List<Board>boardList = gameService.getAllBoardList();
		model.addAttribute("boardList", boardList);
		return "boardList";
	}
	
	@GetMapping("/member/addPost")
	public String requestAddPostForm(@ModelAttribute("newPost") Board board) {
		return "addPost";
	}
	
	@PostMapping("/member/addPost")
	public String submitAddNewPost(@ModelAttribute("newPost") Board board, HttpServletRequest request, HttpSession session) {
		gameService.setNewPost(board);
		return "redirect:/boardList";
	}
}
