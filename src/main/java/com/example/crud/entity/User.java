package com.example.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "main_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @NotBlank(message = "Enter your name")
    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+\\s[a-zA-Z]+$", message = "Name should only contain alphabet, your firstname and lastname")
//    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Name should only contain alphabet")
    @Size(min = 3, message = "Name should have at least three characters")
    @Column
    private String name;


    public User() {
    }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
