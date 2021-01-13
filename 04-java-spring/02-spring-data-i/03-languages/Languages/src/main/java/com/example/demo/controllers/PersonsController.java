package com.example.demo.controllers;

import com.example.demo.model.License;
import com.example.demo.model.Person;
import com.example.demo.services.LicenseService;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonsController {
    @Autowired
    PersonService personService;
    @Autowired
    LicenseService licenseService;

    @RequestMapping("/")
    public String getIndex(Model model) {
        List<Person> personList = personService.getPersons();
        model.addAttribute("person", personList);
        return "/persons/index.jsp";
    }

    @PostMapping("/new")
    public String createNewPerson(@Validated @ModelAttribute("person") Person person, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("person", personService.createNewPerson(person));
            return "/persons/new.jsp";

        } else {
            personService.createNewPerson(person);
            return "redirect:/";
        }
    }

    @RequestMapping("/persons/new")
    public String newCreatePerson(@ModelAttribute("person") Person person) {
        return "/persons/new.jsp";
    }

    @RequestMapping(value = "/licenses", method = RequestMethod.POST)
    public String CreateLicense(@Validated @ModelAttribute("license") License lic, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("person", personService.getPersons());
            return "/licenses/new.jsp";
        } else {
            licenseService.createLicense(lic);
            return "redirect:/";
        }


    }

    @RequestMapping("/licenses/new")
    public String NewLicense(@ModelAttribute("license") License lic, Model model) {
        List<Person> unlicensed = personService.getUnlicensedPeople();
        model.addAttribute("person", unlicensed);
        return "/licenses/new.jsp";
    }

    @RequestMapping("/{id}")
    public String ShowPerson(@PathVariable("id") Long id, Model model) {
        if(personService.getPerson(id)==null){
            return "redirect:/licenses/new";
        }
        model.addAttribute("person", personService.getPerson(id));
        return "/persons/show.jsp";
    }

}
