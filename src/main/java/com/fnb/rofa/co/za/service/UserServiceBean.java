package com.fnb.rofa.co.za.service;

import com.fnb.rofa.co.za.model.User;
import com.fnb.rofa.co.za.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceBean implements UserService {

    private final UserRepository userRepository;

    public UserServiceBean(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
