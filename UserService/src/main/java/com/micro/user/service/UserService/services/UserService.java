package com.micro.user.service.UserService.services;

import com.micro.user.service.UserService.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUser();
    User getUserById(String userId);
}