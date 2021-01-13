package com.kevin.DisplayDate.controller;



import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {

	@RequestMapping("/")
	public String getDate() {
	
		return "index.jsp";
		
	}
	
	@RequestMapping("/date")
	public String getDate(Model model) {
		Date datesDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String strDateString = format.format(datesDate);
		model.addAttribute("date",strDateString);
		return "Date.jsp";
		
	}
}
