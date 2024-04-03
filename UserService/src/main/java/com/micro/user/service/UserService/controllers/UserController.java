package com.micro.user.service.UserService.controllers;

import com.micro.user.service.UserService.models.User;
import com.micro.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        return new ResponseEntity<>(userService.getUserById(userId),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
    }
}
