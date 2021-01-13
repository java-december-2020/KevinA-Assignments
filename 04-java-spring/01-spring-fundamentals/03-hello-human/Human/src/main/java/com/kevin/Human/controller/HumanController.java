package com.kevin.Human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HumanController {

	@RequestMapping("/")
	public String greetHuman(@RequestParam(value = "q", required = false, defaultValue="Human") String entry, Model model) {
		
			model.addAttribute("welcome", "Hello " + entry);
		
		return "index.jsp";
	}

}
