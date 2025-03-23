package com.example.postprojectspring.module.posts.repository;

import com.example.postprojectspring.module.posts.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Posts, Long> {

}