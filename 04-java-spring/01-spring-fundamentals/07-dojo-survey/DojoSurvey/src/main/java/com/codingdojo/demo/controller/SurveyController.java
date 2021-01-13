package com.codingdojo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
    @RequestMapping("/")
    public String indexAction() {
        return "index.jsp";
    }

    @RequestMapping(value = "/survey", method = RequestMethod.POST)
    public String getFormAction(@RequestParam(value = "name") String name, @RequestParam(value = "location") String location,
                                @RequestParam(value = "language") String language, @RequestParam(value = "comment") String comment, Model model){
        model.addAttribute("name",name);
        model.addAttribute("location",location);
        model.addAttribute("language",language);
        model.addAttribute("comment",comment);

        return "survey.jsp";
    }
}
