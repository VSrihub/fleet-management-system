package com.fmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@ControllerAdvice
public class HomeController {
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome To Fleet Management Platform");
		model.addAttribute("tagline", "one solution for all fleet management services");
		
		return "home";
	}
}