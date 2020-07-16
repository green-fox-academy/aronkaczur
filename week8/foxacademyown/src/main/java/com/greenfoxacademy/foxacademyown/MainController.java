package com.greenfoxacademy.foxacademyown;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {
    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService){
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("fox", foxService.getFox());
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam(value = "name", defaultValue = "") String name){
        if (foxService.checkItExist(name))
            return "redirect:/?name="+name;
        else {foxService.newFox(name);}
        return "redirect:/?name="+name;
    }

    @GetMapping("/listoffoxes")
    @ResponseBody
    public List<Fox> checkList(){
        return foxService.getListofFoxes();
    }

}
