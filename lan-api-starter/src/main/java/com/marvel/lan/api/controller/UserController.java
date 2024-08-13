package com.marvel.lan.api.controller;

import com.marvel.lan.application.impl.UserServiceImpl;
import com.marvel.lan.domain.user.entity.User;
import com.marvel.lan.types.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/list")
    public Result<List<User>> getUserList()
    {
        return userServiceImpl.getUserList();
    }
}
