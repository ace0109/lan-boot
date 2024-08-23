package com.marvel.lan.domain.service;

import com.marvel.lan.domain.entity.UserDO;

import java.util.List;

public interface UserDomainService {
    List<UserDO> getUserList();

    UserDO createUser(UserDO userDO);

    UserDO getUserById(String userId);

    Boolean deleteUserById(String userId);
}
