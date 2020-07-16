package com.greenfox.todoslist;

import com.greenfox.todoslist.model.Todo;
import com.greenfox.todoslist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TodoslistApplication implements CommandLineRunner{

    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoslistApplication.class, args);
    }

    @Autowired
    public TodoslistApplication(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Practice it more"));
        todoRepository.save(new Todo("Relax"));
    }
}
