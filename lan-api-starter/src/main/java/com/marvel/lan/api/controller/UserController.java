package com.marvel.lan.api.controller;

import com.marvel.lan.application.impl.UserServiceImpl;
import com.marvel.lan.domain.user.entity.UserDO;
import com.marvel.lan.types.common.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @folder 用户管理
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    /**
     * @api.name 查询用户列表
     * @developing
     */
    @GetMapping("/list")
    public Result<List<UserDO>> getUserList()
    {
        return userServiceImpl.getUserList();
    }

    /**
     * @api.name 创建用户
     * @developing
     */
    @PostMapping
    public Result<UserDO> createUser(@RequestBody UserDO userDO)
    {
        return null;
    }

    /**
     * @api.name 根据ID获取用户信息
     * @developing
     */
    @GetMapping("/{userId}")
    public Result<UserDO> createUser(@PathVariable String userId)
    {
        return null;
    }
}
