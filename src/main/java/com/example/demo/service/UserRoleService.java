package com.example.demo.service;

import com.example.demo.model.entity.UserRole;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {
    @Autowired
    private UserRoleRepository employeeRoleRepository;


    public UserRole createNewRole(UserRole employeeRole) {
        return employeeRoleRepository.save(employeeRole);
    }
}
