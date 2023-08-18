package com.gamesLibrary.gamesLibraryController;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
	
	@GetMapping("/error404")
	public String Error404(HttpServletResponse response, Model model) {
		return "error404";
	}
}
