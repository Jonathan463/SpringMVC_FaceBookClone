package com.example.facebookclonespringboot.repository;

import com.example.facebookclonespringboot.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
