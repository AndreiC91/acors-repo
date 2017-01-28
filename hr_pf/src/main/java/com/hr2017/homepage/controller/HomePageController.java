package com.hr2017.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	 
	@RequestMapping("/homepage")
	public ModelAndView homepageDefault(@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
	{
		System.out.println("in controller"+name);
		String message = "";
		if (name.equalsIgnoreCase("raluca")) message = "Buna, "+name+"! >:D< :*";
		else message = "Buna, "+name+". Nu esti Raluca! :(";
		ModelAndView mv = new ModelAndView("homepage");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
}
