package com.marvel.lan.domain.user.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long id;
    private String username;
    private String password;
    private String email;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
