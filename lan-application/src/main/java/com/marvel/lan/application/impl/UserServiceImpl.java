package com.marvel.lan.application.impl;

import com.marvel.lan.application.UserService;
import com.marvel.lan.domain.user.entity.UserDO;
import com.marvel.lan.domain.user.service.UserDomainService;
import com.marvel.lan.types.common.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDomainService userDomainService;

    public UserServiceImpl(UserDomainService userDomainService) {
        this.userDomainService = userDomainService;
    }

    public Result<List<UserDO>> getUserList() {
        List<UserDO> userDOList = userDomainService.getUserList();
        return Result.success(userDOList);
    }
}
