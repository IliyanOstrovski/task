package com.example.demo.web;

import com.example.demo.model.entity.UserRole;
import com.example.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @PostMapping({"createNewRole"})
    public UserRole createNewRole(@RequestBody UserRole userRole) {
        return userRoleService.createNewRole(userRole);
    }
}
