package com.greenfoxacademy.demo.Service;

import com.greenfoxacademy.demo.Model.Post;
import com.greenfoxacademy.demo.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public List<Post> getAllPost() {
        List<Post> allPosts = (List<Post>) postRepository.findAll();
        allPosts = allPosts.stream().sorted(Comparator.comparingInt(Post::getKarma).reversed())
                .collect(Collectors.toList());
        return allPosts;

    }

    public void addNewPost(Post post) {
        post.setTimestamp(LocalDateTime.now());
        postRepository.save(post);
    }

    public void saveKarma(Post post) {
        postRepository.save(post);
    }

    public void incrase(Long id) {
        Post post = postRepository.findById(id).get();
        post.incraseKarma();
        postRepository.save(post);

    }


    public void declare(Long id) {
        Post post = postRepository.findById(id).get();
        post.declareKarma();
        postRepository.save(post);

    }
}






