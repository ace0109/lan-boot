package com.marvel.lan.application;

import com.marvel.lan.domain.user.entity.UserDO;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface UserService {

    Result<List<UserDO>> getUserList();

}
