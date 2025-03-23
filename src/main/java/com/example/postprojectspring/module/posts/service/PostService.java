package com.example.postprojectspring.module.posts.service;

import com.example.postprojectspring.module.posts.entity.Posts;
import com.example.postprojectspring.module.posts.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Posts registerPost(Posts posts) {
        return this.postRepository.save(posts);
    }

    public List<Posts> findAllPosts() {
        return this.postRepository.findAll();
    }


}