package com.marvel.lan.domain.user.service;

import com.marvel.lan.infrastructure.persistence.DO.UserDO;

import java.util.List;

public interface UserService {
    List<UserDO> getAllUsers();
}
