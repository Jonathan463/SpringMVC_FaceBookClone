package com.example.facebookclonespringboot.service.serviceImpl;

import com.example.facebookclonespringboot.model.LikePost;
import com.example.facebookclonespringboot.model.Post;
import com.example.facebookclonespringboot.model.User;
import com.example.facebookclonespringboot.repository.LikePostRepository;
import com.example.facebookclonespringboot.service.LikePostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LikePostServiceImpl implements LikePostService {

    @Autowired
    LikePostRepository likePostRepository;

    @Override
    public void addLike(LikePost likePost) {
        likePostRepository.save(likePost);
    }

    public void deleteLike(Post post, HttpSession session){
        User user = (User)session.getAttribute("user");
        if(likePostRepository.existsByUser(user)){
            likePostRepository.deleteByPost(post);
        }
    }
}