package com.example.demo.model.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deparment_id")
    private long id;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Directorate> directorates;


}

