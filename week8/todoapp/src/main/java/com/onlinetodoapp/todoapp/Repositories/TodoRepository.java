package com.onlinetodoapp.todoapp.Repositories;


import com.onlinetodoapp.todoapp.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAll();
    Todo findById(long id);
}
