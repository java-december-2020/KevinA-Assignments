package com.example.demo.controller;

import com.example.demo.models.Lookify;
import com.example.demo.services.LookifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LookifyController {
    @Autowired
    private LookifyService service;

    @RequestMapping("/")
    public String welcomePage() {

        return "/view/index.jsp";
    }

    @RequestMapping("/view/index")
    public String returnPage() {
        return "redirect:/";
    }

    @RequestMapping("/view/dashboard")
    public String getAllSongs(Model model) {
        List<Lookify> lookifyList = service.findAll();
        model.addAttribute("music", lookifyList);
        return "/view/dashboard.jsp";
    }

    @RequestMapping("/view/songs/{id}")
    public String getSongById(@PathVariable(name = "id") long id, Model model) {
        Lookify lookify = service.getSongById(id);
        if (lookify != null) {
            model.addAttribute("lookify", lookify);
            return "/view/songs.jsp";
        } else {
            return "redirect:/views/dashboard";
        }
    }

    @PostMapping("/new")
    public String createNewSong(@Valid @Validated @ModelAttribute("lookify") Lookify lookify, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("number be even");
            return "/view/addNew.jsp";
        } else {
            service.createNewMusic(lookify);
            return "redirect:/view/dashboard";
        }

    }

    @RequestMapping("view/addNew")
    public String returnView(@ModelAttribute("lookify") Lookify lookify) {
        return "/view/addNew.jsp";
    }

    @RequestMapping("view/topTen")
    private String topTen(Model model) {
        List<Lookify> lookifyList = service.getTopSong();
        model.addAttribute("topTen", lookifyList);
        return "/view/topTen.jsp";
    }

    @RequestMapping(value = "/view/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String removeSong(@PathVariable("id") long id) {
        service.remove(id);
        return "redirect:/view/dashboard";
    }

    @RequestMapping(value = "/view/delete/{id}", method = {RequestMethod.POST, RequestMethod.DELETE})
    public String removeSongs(@PathVariable("id") long id) {
        service.remove(id);
        return "redirect:/view/dashboard";
    }

    @RequestMapping("/view/search/")
    public String getArtist(@RequestParam("artist") String artist, Model model, Lookify lookify) {
        List<Lookify> lookifyList = service.findSongByArtist(artist, lookify);
        if (lookifyList.isEmpty()) {
            return "redirect:/view/dashboard";
        } else {
            model.addAttribute("searchMusic", lookifyList);
            model.addAttribute("artist", artist);
            return "/view/search.jsp";
        }
    }
}
