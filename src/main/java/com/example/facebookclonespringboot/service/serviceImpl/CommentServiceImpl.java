package com.example.facebookclonespringboot.service.serviceImpl;

import com.example.facebookclonespringboot.model.Comment;
import com.example.facebookclonespringboot.repository.CommentRepository;
import com.example.facebookclonespringboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }
}
