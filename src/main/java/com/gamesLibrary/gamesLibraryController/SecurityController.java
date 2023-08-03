package com.gamesLibrary.gamesLibraryController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping("/login")
	public String loginSuccess(HttpServletRequest request) {
		String backURL = request.getHeader("referer");
		return "redirect:" + backURL;
	}
	
	@GetMapping("/logoutSuccess")
	public String logoutSuccess(HttpServletRequest request) {
		String backURL = request.getHeader("referer");
		return "redirect:" + backURL;
	}
	
}
