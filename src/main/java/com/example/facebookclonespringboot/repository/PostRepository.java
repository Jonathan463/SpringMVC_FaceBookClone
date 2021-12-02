package com.example.facebookclonespringboot.repository;

import com.example.facebookclonespringboot.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    Post findPostById(Long id);
}
