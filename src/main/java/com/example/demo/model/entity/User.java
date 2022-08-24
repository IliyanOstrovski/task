package com.example.demo.model.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long userId;

    @Column(name = "name", nullable = false, unique = true)
    private String username;

    @Column(name = "lastname", nullable = false, unique = true)
    private String lastname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "age", nullable = false)
    private int age;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<UserRole> employeeRoles;
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = { @JoinColumn(name = "role_id")})


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Set<UserRole> getEmployeeRoles() {
        return employeeRoles;
    }

    public void setEmployeeRoles(Set<UserRole> employeeRoles) {
        this.employeeRoles = employeeRoles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<UserRole> getUserRoles() {
        return employeeRoles;
    }

    public void setUserRoles(Set<UserRole> employeeRoles) {
        this.employeeRoles = employeeRoles;
    }
}
