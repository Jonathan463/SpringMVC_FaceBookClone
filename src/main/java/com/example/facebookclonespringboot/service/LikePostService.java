package com.example.facebookclonespringboot.service;

import com.example.facebookclonespringboot.model.LikePost;
import com.example.facebookclonespringboot.model.Post;

import javax.servlet.http.HttpSession;

public interface LikePostService {
    public void addLike(LikePost likePost);

    public void deleteLike(Post post, HttpSession session);
}
