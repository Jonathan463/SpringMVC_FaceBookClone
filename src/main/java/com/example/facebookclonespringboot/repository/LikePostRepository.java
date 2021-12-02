package com.example.facebookclonespringboot.repository;


import com.example.facebookclonespringboot.model.LikePost;
import com.example.facebookclonespringboot.model.Post;
import com.example.facebookclonespringboot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface LikePostRepository extends CrudRepository<LikePost, Long> {
    public boolean existsByUser(User user);
    public LikePost getLikePostByPost(Post post);
    public void deleteByPost(Post post);

}
