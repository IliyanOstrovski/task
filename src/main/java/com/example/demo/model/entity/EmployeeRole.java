package com.example.demo.model.entity;

import com.example.demo.model.enums.EmployeeRoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "employee_role")
public class EmployeeRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_role_id")
    private Long employeeId;

    @Column(nullable = false)
    private String employee_role_name;

    @Enumerated(EnumType.STRING)
    private EmployeeRoleEnum employeeRole;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeRoleEnum getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(EmployeeRoleEnum employeeRole) {
        this.employeeRole = employeeRole;
    }
}
