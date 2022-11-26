package com.example.StudentCrud.entities;

import javax.persistence.*;

@Entity
@Table(name = "student_info")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name")
    private String name;

    public StudentInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
