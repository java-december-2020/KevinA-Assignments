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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NinjaController {
    @Autowired
    NinjaService ninjaService;
    @Autowired
    DojoService dojoService;

    @RequestMapping("/ninjas/new")
    public String ninjaNew(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
        List<Dojo> dojoList = dojoService.findAllDojos();
        viewModel.addAttribute("dojo", dojoList);
        return "/view/ninja.jsp";
    }

    @PostMapping("/newNinja")
    public String newNinja(@Valid @ModelAttribute("ninja") Ninja ninja, Model viewModel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<Dojo> dojoList = dojoService.findAllDojos();
            viewModel.addAttribute("dojo", dojoList);
            return "/view/ninja.jsp";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/";
        }
    }

    @RequestMapping("/ninjas")
    public String allNinjas(Model model){
        model.addAttribute("ninja",this.ninjaService.findAll());
        return "/view/ninjas.jsp";
    }
}
