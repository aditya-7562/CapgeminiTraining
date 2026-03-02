package com.capgemini.repository;

import com.capgemini.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(Long id);
    void  save(User user);
}
