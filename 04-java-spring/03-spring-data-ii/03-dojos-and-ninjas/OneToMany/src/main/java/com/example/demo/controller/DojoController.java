package com.example.demo.controller;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.service.DojoService;
import com.example.demo.service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DojoController {
    @Autowired
    private DojoService dojoService;
    @Autowired
    NinjaService ninjaService;

    @RequestMapping("/")
    public String getDojoList(Model viewModel) {
        List<Dojo> dojoList = dojoService.findAllDojos();
        viewModel.addAttribute("dojoList", dojoList);
        return "/view/index.jsp";

    }

    @RequestMapping("/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "/view/newDojo.jsp";
    }

    @PostMapping("/newDojo")
    public String newDojos(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/view/newDojo.jsp";
        } else {
            dojoService.createDojo(dojo);
            return "redirect:/";
        }
    }

    @RequestMapping("/view/dojo/{id}")
    public String showView(@PathVariable("id") long id,  Model model) {

        Dojo dojoServiceDojo = dojoService.getDojo(id);
        if(dojoServiceDojo!=null){
            model.addAttribute("dojo", dojoServiceDojo);
            return "/view/show.jsp";
        } else {
            return "redirect:/";
        }
    }
}
