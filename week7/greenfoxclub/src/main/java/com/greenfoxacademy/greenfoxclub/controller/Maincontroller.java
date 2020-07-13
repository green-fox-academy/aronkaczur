package com.greenfoxacademy.greenfoxclub.controller;

import com.greenfoxacademy.greenfoxclub.model.Fox;
import com.greenfoxacademy.greenfoxclub.service.FoxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Maincontroller {
    FoxService foxService;

    public void MainController() {
        foxService = new FoxService();
    }


    @GetMapping("/")
    public String showFox(@RequestParam(required = false) String name, Model model) {
        if (foxService.getUser() == null) {
            return "redirect:/login";
        }

        Fox fox = foxService.findFox(foxService.getUser());
        model.addAttribute("fox", fox);
        return "index";
    }

    @GetMapping("/login")
    public String loginForm()  {
        return "login";
    }

    @PostMapping("/addnew")
    public String addNewFox(@RequestParam String name) {
        foxService.addNewFox(name);
        foxService.setUser(name);
        return "redirect:/?name=" + name;
    }


}
