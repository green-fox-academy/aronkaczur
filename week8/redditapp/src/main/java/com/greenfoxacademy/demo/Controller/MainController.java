package com.greenfoxacademy.demo.Controller;


import com.greenfoxacademy.demo.Model.Post;
import com.greenfoxacademy.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class MainController {
    private PostService postService;

    @Autowired
    public MainController(PostService postService){
        this.postService = postService;
    }

    @GetMapping("")
    public String homePage(Model model){
        model.addAttribute("posts",postService.getAllPost());
             return "index";
    }


    @GetMapping("/newpost")
    public String postPage(@ModelAttribute("posts") Post post){
        return "newpost";

    }
    @PostMapping("/newpost")
    public String newPost(@ModelAttribute("posts") Post post){
        postService.addNewPost(post);
        return "redirect:/";
    }

    @GetMapping("/increment")
    public String incraseKarma(@RequestParam Long id){
        postService.incrase(id);
        return "redirect:/";

    }

    @GetMapping("/declare")
    public String declareKarma(@RequestParam Long id){
        postService.declare(id);
        return "redirect:/";

    }

}
