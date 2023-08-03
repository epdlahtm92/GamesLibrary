package com.gamesLibrary.gamesLibraryController;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gamesLibrary.security.CustomUserDetailService;
import com.gamesLibrary.security.CustomUserDetails;

@Controller
public class SecurityController {

	@Autowired
	private CustomUserDetailService customUserDetailService;
	
	@GetMapping("/login")
	public String loginSuccess(HttpServletRequest request) {
		String backURL = "";
		if (!request.getHeader("referer").contains("admin")) {
			backURL = request.getHeader("referer");
		};
		return "redirect:/all";
	}
	
	@GetMapping("/logoutSuccess")
	public String logoutSuccess(HttpServletRequest request) {
		String backURL = request.getHeader("referer");
		return "redirect:" + backURL;
	}
	
	@GetMapping("/addUser")
	public String requestAddUser(@ModelAttribute("newUser") CustomUserDetails customUserDetails) {
		return "addUser";
	}
	
	@PostMapping("/addUser")
	public String submitAddUser(@ModelAttribute("newUser") CustomUserDetails customUserDetails) {
		customUserDetailService.createUser(customUserDetails);
		return "redirect:/all";
	}
	
	
	
}
