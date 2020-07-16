package com.greenfoxacademy.demo.Repository;

import com.greenfoxacademy.demo.Model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository  extends CrudRepository<Post, Long> {


}
