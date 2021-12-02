package com.example.facebookclonespringboot.repository;

import com.example.facebookclonespringboot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByEmail(String email);
    public boolean existsByEmail(String email);
}
