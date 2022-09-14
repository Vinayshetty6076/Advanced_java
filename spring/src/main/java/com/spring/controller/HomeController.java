package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name", "Nithin");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Darshan");
		friends.add("Komal");
		friends.add("Sasi");
		
		model.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Nithin");
		modelAndView.addObject("mobile", 6383312184l);
		modelAndView.addObject("email", "nithinsaji1999@gmail.com");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Darshan");
		friends.add("Komal");
		friends.add("Sasi");
		
		modelAndView.addObject("f", friends);
		
		modelAndView.setViewName("about");
		
		return modelAndView;
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Nithin");
		modelAndView.addObject("mobile", 6383312184l);
		modelAndView.addObject("email", "nithinsaji1999@gmail.com");
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}