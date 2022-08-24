package com.example.demo.web;

import com.example.demo.model.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers() {
        userService.initUserRolesAndUser();
    }


    @PostMapping("/users/post")
    public void createUser(@RequestBody User user) {
        userService.save(user);
    }

}
