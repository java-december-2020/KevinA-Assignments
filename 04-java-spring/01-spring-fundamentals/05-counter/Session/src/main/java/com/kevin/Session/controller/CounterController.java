package com.kevin.Session.controller;

import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CounterController {
    @RequestMapping("/")
    public String welComeUser(HttpSession httpSession) {
        if (httpSession.getAttribute("counter") == null) {
            httpSession.setAttribute("counter", 0);
        }
        return "server.jsp";
    }

    @RequestMapping("/counter")
    public String countSession(HttpSession httpSession, Model model) {
        Integer sessionInteger = (Integer) httpSession.getAttribute("counter");
        sessionInteger++;
        httpSession.setAttribute("counter", sessionInteger);
        model.addAttribute("counter", sessionInteger);
        return "counter.jsp";
    }

    @RequestMapping("/reset")
    public String resetSession(HttpSession httpSession) {

        httpSession.invalidate();


        return "redirect:/counter";
    }
}
