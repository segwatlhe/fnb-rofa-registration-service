package com.fnb.rofa.co.za.service;

import com.fnb.rofa.co.za.model.User;

import java.util.List;

public interface UserService {


    User registerUser(User user);
    List<User> findAll();

}
