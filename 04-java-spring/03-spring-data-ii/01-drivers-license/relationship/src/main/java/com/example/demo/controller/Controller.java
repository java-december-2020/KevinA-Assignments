package com.example.demo.controller;

import com.example.demo.model.License;
import com.example.demo.model.Person;
import com.example.demo.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    PersonsService personsService;
    @RequestMapping("/")
    public String home(Model model){
        List<Person> personList=personsService.allPeople();
        model.addAttribute("person",personList);
        return "/view/index.jsp";
    }

    @RequestMapping("/persons/new")
    public String createNew(@ModelAttribute("person") Person person){
        return "/view/newPerson.jsp";
    }
    @RequestMapping(value = "/newPerson", method = RequestMethod.POST)
    public String newPerson(@Valid @ModelAttribute("person") Person person, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/view/newPerson.jsp";
        }else {
            this.personsService.createPerson(person);
            return "redirect:/";
        }
    }


    @RequestMapping("/licenses/new")
    public String createNew(@ModelAttribute("license") License license, Model model){
        List<Person> unlicensed = personsService.getUnlicensedPeople();
        model.addAttribute("person", unlicensed);
        return "/view/newLicense.jsp";
    }
    @RequestMapping(value = "/newLicense", method = RequestMethod.POST)
    public String newPerson(@Valid @ModelAttribute("license") License license, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/view/newLicense.jsp";
        }else {
            this.personsService.createLicense(license);
            return "redirect:/";
        }
    }

    @RequestMapping("/view/person/{id}")
    public String getPerson(@PathVariable("id") long id, Model model){
        Person person = personsService.findPerson(id);
        if(person!=null){
            model.addAttribute("person",person);
            return "/view/show.jsp";
        }else {
            return "redirect:/";
        }
    }
}
