package com.example.facebookclonespringboot.service;

import com.example.facebookclonespringboot.model.User;

public interface UserService {
    public void register(User user);
    public User findByEmail(String email);
    public boolean existsByEmail(String email);

}
