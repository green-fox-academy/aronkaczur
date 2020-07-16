package com.foxclub.foxclub.controller;

import com.foxclub.foxclub.service.FoxClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FoxController {
    private FoxClubService foxClubService;

    @Autowired
    public FoxController(FoxClubService foxClubService) {
        this.foxClubService = foxClubService;
    }
    @GetMapping("/nutrition&name=*")
    public String getNutritionStore(@RequestParam(value = "name", defaultValue ="") String name,
                                    Model model) {
        foxClubService.loadActualFox(name);
        model.addAttribute("fox", foxClubService.getFox());
        return "nutrition";
    }

    @PostMapping("/nutrition&name=*")
    public String postNutritionStore(@RequestParam(value = "name", defaultValue ="") String name,
                                     @RequestParam("food") String food,
                                     @RequestParam("drink") String drink,
                                     Model model) {
        foxClubService.loadActualFox(name);
        foxClubService.setFoodAndDrink(food, drink);
        model.addAttribute("fox", foxClubService.getFox());
        return "redirect:/?name="+ name;
    }

    @GetMapping("/trickcenter&name=*")
    public String getTrickCenter(@RequestParam(value = "name", defaultValue ="") String name,
                                 Model model) {
        foxClubService.loadActualFox(name);
        model.addAttribute("fox", foxClubService.getFox());
        model.addAttribute("tricks", foxClubService.getListOfTricks());
        return "trickcenter";
    }

    @PostMapping("/trickcenter&name=*")
    public String postTrickCenter(@RequestParam(value = "name", defaultValue ="") String name,
                                  @RequestParam("trick") String trick) {
        foxClubService.loadActualFox(name);
        if (foxClubService.getFox().getListOfTricks().stream().noneMatch(t -> t.getName().equals(trick)))
            foxClubService.addTrick(trick);
        return "redirect:/?name="+ name;
    }
}
