package com.springboot.blog2.repository;

import com.springboot.blog2.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
