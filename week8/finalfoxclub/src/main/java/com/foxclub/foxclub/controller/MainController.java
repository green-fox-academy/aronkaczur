package com.foxclub.foxclub.controller;

import com.foxclub.foxclub.service.FoxClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController { 
    private FoxClubService foxClubService;

    @Autowired
    public MainController(FoxClubService foxClubService) {
        this.foxClubService = foxClubService;
    }

    @GetMapping("/")
    public String showMain(Model model){
    model.addAttribute("fox", foxClubService.getFox());
    return "information";
    }

    @GetMapping("/login")
    public String loginGet(){
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam(value = "name", defaultValue ="") String name) {
        if (foxClubService.hasFoxName(name))
            return "redirect:/?name="+ name;
        else { foxClubService.newFox(name);}
        return "redirect:/?name="+ name;
    }

}


