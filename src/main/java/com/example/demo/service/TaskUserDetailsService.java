package com.example.demo.service;

import com.example.demo.model.entity.UserRole;
import com.example.demo.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TaskUserDetailsService {

    private final UserRepository userRepository;

    public TaskUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userRepository.
                findByUsername(username).
                map(this::map).
                orElseThrow(() -> new UsernameNotFoundException("User with name " + username + " not found."));
    }

    private UserDetails map(com.example.demo.model.entity.User user){
        return User
                .builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .authorities((user.getUserRoles().stream().map(this::authorityMap).toList())).build();
    }

    private GrantedAuthority authorityMap(UserRole role){
        return new SimpleGrantedAuthority("ROLE_" + role.getEmployeeRole().name());
    }
}
