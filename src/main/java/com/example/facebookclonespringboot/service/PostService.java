package com.example.facebookclonespringboot.service;

import com.example.facebookclonespringboot.model.Post;

public interface PostService {
    public void addPost(Post post);

    public void deletePost(Post post);

    public Post getPostById(Long id);

    public Iterable<Post> getPosts();
}