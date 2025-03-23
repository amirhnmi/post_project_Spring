package com.example.postprojectspring.module.posts.controller;

import com.example.postprojectspring.module.posts.entity.Posts;
import com.example.postprojectspring.module.posts.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping(value = "/post/list", method = RequestMethod.GET)
    public List<Posts> getPosts() {
        return postService.findAllPosts();
    }

    @RequestMapping(value = "/post/create", method = RequestMethod.POST)
    public Posts registerPost(@RequestBody Posts posts) {
        return postService.registerPost(posts);
    }


}