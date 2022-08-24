package com.example.demo.config;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.TaskUserDetailsService;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new Pbkdf2PasswordEncoder();
    }


    @Bean
    public TaskUserDetailsService userDetailsService(UserRepository userRepository) {
        return new TaskUserDetailsService(userRepository){};
    }
}
