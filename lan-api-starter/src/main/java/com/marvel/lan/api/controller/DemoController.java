package com.marvel.lan.api.controller;

import com.marvel.lan.domain.user.service.impl.UserServiceImpl;
import com.marvel.lan.infrastructure.persistence.DO.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private final UserServiceImpl userServiceImpl;

    @Autowired
    public DemoController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/test")
    public List<UserDO> test()
    {
        return userServiceImpl.getAllUsers();
    }
}
