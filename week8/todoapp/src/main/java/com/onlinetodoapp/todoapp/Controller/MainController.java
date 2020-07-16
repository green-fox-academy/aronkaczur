package com.onlinetodoapp.todoapp.Controller;

import com.onlinetodoapp.todoapp.Model.Todo;
import com.onlinetodoapp.todoapp.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    private TodoService todoService;


    @Autowired
    public MainController(TodoService todoService){
        this.todoService = todoService;

    }

    @GetMapping("")
    public String homePage(Model model){
        model.addAttribute("todos",todoService.getAllTodo());
        return "home";
    }


    @GetMapping("/todoPage")
    public String todoPage(@ModelAttribute("todo") Todo todo) {
        return "newTodo";
    }

    @PostMapping("/todoPage")
    public String newTodo(@ModelAttribute("todo") Todo todo) {
        todoService.createNewTodo(todo);
        return "redirect:/";
    }

}
