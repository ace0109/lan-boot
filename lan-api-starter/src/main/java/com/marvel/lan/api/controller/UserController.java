package com.marvel.lan.api.controller;

import com.marvel.lan.application.service.impl.UserServiceImpl;
import com.marvel.lan.application.types.request.UserCreateData;
import com.marvel.lan.application.types.response.UserInfo;
import com.marvel.lan.types.common.ErrorCode;
import com.marvel.lan.types.common.Result;
import com.marvel.lan.types.exception.BusinessException;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @folder 用户管理
 */
@Slf4j
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
    public Result<List<UserInfo>, Void> getUserList()
    {
        return userServiceImpl.getUserList();
    }

    /**
     * @api.name 创建用户
     * @developing
     */
    @PostMapping
    public Result<UserInfo, Void> createUser(@RequestBody @Valid UserCreateData userCreateData, BindingResult validateResult)
    {
        if (validateResult.hasErrors()) {
            log.error("create user error: {}", validateResult.getAllErrors().get(0).getDefaultMessage());
            throw new BusinessException(ErrorCode.INVALID_USER_INPUT);
        }
        return userServiceImpl.createUser(userCreateData);
    }

    /**
     * @api.name 根据ID获取用户信息
     * @developing
     */
    @GetMapping("/{userId}")
    public Result<UserInfo, Void> getUserById(@PathVariable String userId)
    {

        return userServiceImpl.getUserById(userId);

    }

    /**
     * @api.name 删除某个用户
     * @developing
     */
    @DeleteMapping("/{userId}")
    public Result<Boolean, Void> deleteUserById(@PathVariable String userId)
    {

        return userServiceImpl.deleteUserById(userId);

    }
}
