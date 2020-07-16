package com.greenfox.todoslist.controller;


import com.greenfox.todoslist.model.Todo;
import com.greenfox.todoslist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("todo")
public class TodoController {

    protected TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/","/list"})
    public String list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }
}
