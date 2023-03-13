package com.javaMadeEasy.sammie.Updates.controller;

import com.javaMadeEasy.sammie.Updates.post.Post;
import com.javaMadeEasy.sammie.Updates.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {
    @Autowired
    private  PostService service;




    @GetMapping("/create")
    public String CreatePost(Model model){
        model.addAttribute("post",new Post());

        return "createPost";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePost(@ModelAttribute("post") Post post) {
        service.save(post);
        return "redirect:/";
    }

        @RequestMapping("/")
    public String ViewPost(Model model){
            List<Post> posts = service.SeeAllPost();
            model.addAttribute("posts",posts);
        return "viewpost";
    }
    @GetMapping("/postcomment")
    public String addComment(@RequestParam("id") Long id){
        return "fullPost";
    }



}
