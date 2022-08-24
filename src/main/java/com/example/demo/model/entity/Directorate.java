package com.example.demo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "directors")
public class Directorate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "directorate_id")
    private Long id;


    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Department> departments;
    @JoinTable(name = "departments",
            joinColumns = {@JoinColumn(name = "directorate_id")},
            inverseJoinColumns = {@JoinColumn(name = "departments_id")})


    @OneToOne
    private User users;

    @JoinTable(name = "users",
            joinColumns = {@JoinColumn(name = "directorate_id")},
            inverseJoinColumns = {@JoinColumn(name = "id")})


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
