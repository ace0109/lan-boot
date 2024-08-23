package com.marvel.lan.domain.user.service;

import com.marvel.lan.domain.user.entity.UserDO;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface UserDomainService {
    List<UserDO> getUserList();

    UserDO createUser(UserDO userDO);

    UserDO getUserById(String userId);

    Boolean deleteUserById(String userId);
}
