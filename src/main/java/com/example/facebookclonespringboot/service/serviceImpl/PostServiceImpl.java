package com.example.facebookclonespringboot.service.serviceImpl;

import com.example.facebookclonespringboot.model.Post;
import com.example.facebookclonespringboot.repository.PostRepository;
import com.example.facebookclonespringboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public void addPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void deletePost(Post post) {
        postRepository.delete(post);
    }

    @Override
    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id){
        return postRepository.findPostById(id);
    }

}
