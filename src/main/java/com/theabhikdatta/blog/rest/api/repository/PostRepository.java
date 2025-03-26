package com.theabhikdatta.blog.rest.api.repository;

import com.theabhikdatta.blog.rest.api.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

