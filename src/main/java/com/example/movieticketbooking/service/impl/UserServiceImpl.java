package com.example.movieticketbooking.service.impl;


import com.example.movieticketbooking.model.User;
import com.example.movieticketbooking.repository.UserRepository;
import com.example.movieticketbooking.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long user_id) {
        return null;
    }

    @Override
    public User pushUser(User newUser) {
        return null;
    }

    @Override
    public User updateUser(User updatedUser, Long user_id) {
        return null;
    }

    @Override
    public void deleteUserById(Long user_id) {

    }
}
