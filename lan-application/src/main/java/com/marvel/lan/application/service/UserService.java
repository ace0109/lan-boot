package com.marvel.lan.application.service;

import com.marvel.lan.application.types.request.UserCreateData;
import com.marvel.lan.application.types.response.UserInfo;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface UserService {
    Result<List<UserInfo>, Void> getUserList();

    Result<UserInfo, Void> createUser(UserCreateData userCreateData);

    Result<UserInfo, Void> getUserById(String userId);

    Result<Boolean, Void> deleteUserById(String userId);
}
