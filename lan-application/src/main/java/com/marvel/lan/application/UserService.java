package com.marvel.lan.application;

import com.marvel.lan.application.types.response.UserInfo;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface UserService {

    Result<List<UserInfo>, Void> getUserList();

}
