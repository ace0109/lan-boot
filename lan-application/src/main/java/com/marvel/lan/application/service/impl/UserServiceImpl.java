package com.marvel.lan.application.service.impl;

import com.marvel.lan.application.service.UserService;
import com.marvel.lan.application.service.converter.UserConverter;
import com.marvel.lan.application.types.request.UserCreateData;
import com.marvel.lan.application.types.response.UserInfo;
import com.marvel.lan.domain.user.entity.UserDO;
import com.marvel.lan.domain.user.service.UserDomainService;
import com.marvel.lan.types.common.ErrorCode;
import com.marvel.lan.types.common.Result;
import com.marvel.lan.types.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDomainService userDomainService;

    public UserServiceImpl(UserDomainService userDomainService) {
        this.userDomainService = userDomainService;
    }

    @Override
    public Result<List<UserInfo>, Void> getUserList() {
        List<UserDO> userDOList = userDomainService.getUserList();

        List<UserInfo> userInfoList = UserConverter.INSTANCE.userDOListToUserInfoList(userDOList);

        return Result.success(userInfoList);
    }

    @Override
    public Result<UserInfo, Void> createUser(UserCreateData userCreateData) {
        UserDO userDO = UserConverter.INSTANCE.userCreateDataToUserDO(userCreateData);

        UserDO createdUserDO = userDomainService.createUser(userDO);

        return Result.success(UserConverter.INSTANCE.userDOToUserInfo(createdUserDO));
    }

    @Override
    public Result<UserInfo, Void> getUserById(String userId) {
        UserDO userDO = userDomainService.getUserById(userId);
        if (userDO == null) {
            throw new BusinessException(ErrorCode.USER_NOT_FOUND);
        }
        return Result.success(UserConverter.INSTANCE.userDOToUserInfo(userDO));
    }

    @Override
    public Result<Boolean, Void> deleteUserById(String userId) {
        return Result.success(userDomainService.deleteUserById(userId));
    }
}
