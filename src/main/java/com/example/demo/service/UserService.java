package com.example.demo.service;

import com.example.demo.model.entity.User;
import com.example.demo.model.entity.UserRole;
import com.example.demo.model.enums.UserRoleEnum;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    public User registerNewUser(User user){
       return userRepository.save(user);
    }

    public void initUserRolesAndUser(){
        UserRole directorRole = new UserRole();
        directorRole.setUserRole(UserRoleEnum.DIRECTOR);
        userRoleRepository.save(directorRole);

        UserRole userRole = new UserRole();
        userRole.setUserRole(UserRoleEnum.USER);
        userRoleRepository.save(userRole);

        User directorUser = new User();
        directorUser.setUsername("iliyan");
        directorUser.setLastname("ostrovski");
        directorUser.setPassword("1111");
        directorUser.setAge(20);
        Set<UserRole> directorRoles = new HashSet<>();
        directorRoles.add(directorRole);
        directorUser.setUserRoles(directorRoles);
        userRepository.save(directorUser);

        User user = new User();
        user.setUsername("koko");
        user.setLastname("trunski");
        user.setPassword("1111");
        user.setAge(20);
        Set<UserRole> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setUserRoles(userRoles);
        userRepository.save(user);


    }
}
