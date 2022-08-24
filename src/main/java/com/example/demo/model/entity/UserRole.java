package com.example.demo.model.entity;

import com.example.demo.model.enums.UserRoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long employeeId;

    @Column(name = "user_role_name", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRoleEnum employeeRole;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public UserRoleEnum getEmployeeRole() {
        return employeeRole;
    }

    public void setUserRole(UserRoleEnum employeeRole) {
        this.employeeRole = employeeRole;
    }
}
