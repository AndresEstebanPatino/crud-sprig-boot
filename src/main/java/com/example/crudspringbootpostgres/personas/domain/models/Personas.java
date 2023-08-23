package com.example.crudspringbootpostgres.personas.domain.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table

public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastName;
    private Integer age;
    private LocalDate date;

    public Personas() {
    }

    public Personas(Integer id, String name, String lastName, Integer age, LocalDate date) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
    }

    public Personas(String name, String lastName, Integer age, LocalDate date) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
