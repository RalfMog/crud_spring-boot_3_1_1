package com.kata.academy.spring.boot_3_1_1.service;

import com.kata.academy.spring.boot_3_1_1.model.User;

import java.util.List;

public interface UserService {

    public User findById(Long id);

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(Long id);
}
