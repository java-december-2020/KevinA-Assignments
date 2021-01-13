package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodeController {
    @RequestMapping ("/")
    public String indexPage(){
        return "index.jsp";
    }

    @RequestMapping(value = "/code", method = RequestMethod.POST)
    public String getCode(@RequestParam(value = "code") String name, Model model){
        model.addAttribute("name",name);
        return "redirect:/submit";
    }
}
