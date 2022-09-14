package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;
import com.spring.service.UserService;

@SuppressWarnings("unused")
@Controller
public class RegisterController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("Header", "This Header content");
		model.addAttribute("Footer", "This Footer content");
	}

	@RequestMapping("/register")
	public String registration() {
		return "register";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	/*
	 * public String process(
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("username") String username,
	 * 
	 * @RequestParam("password") String password, Model model) {
	 * System.out.println(email); System.out.println(username);
	 * System.out.println(password);
	 * 
	 * model.addAttribute("email", email); model.addAttribute("username",username);
	 * model.addAttribute("password",password);
	 * 
	 * return "success"; }
	 */
	public String process(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		int id = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id : " + id);

		return "success";
	}
}
