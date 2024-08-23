package com.marvel.lan.application.service.converter;

import com.marvel.lan.application.types.request.UserCreateData;
import com.marvel.lan.application.types.response.UserInfo;
import com.marvel.lan.domain.user.entity.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    UserDO userCreateDataToUserDO(UserCreateData userCreateData);

    UserInfo userDOToUserInfo(UserDO userDO);

    List<UserInfo> userDOListToUserInfoList(List<UserDO> userDOList);
}
