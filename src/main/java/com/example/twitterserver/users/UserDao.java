package com.example.twitterserver.users;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDao {
    @Autowired
    UserRepository userRepository;
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    public User findUserById(Integer userId) {
        return userRepository.findById(userId).get();
    }
}
