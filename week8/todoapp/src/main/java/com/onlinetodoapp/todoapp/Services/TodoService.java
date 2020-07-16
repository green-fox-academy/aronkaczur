package com.onlinetodoapp.todoapp.Services;

import com.onlinetodoapp.todoapp.Model.Todo;
import com.onlinetodoapp.todoapp.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService{

    TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }


    public Todo getTodo(int id) {
        return todoRepository.findById((long) id);
    }

    public void createNewTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
