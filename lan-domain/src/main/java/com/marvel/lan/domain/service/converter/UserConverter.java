package com.marvel.lan.domain.service.converter;

import com.marvel.lan.domain.entity.UserDO;
import com.marvel.lan.infrastructure.persistence.po.UserPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    UserDO toDO(UserPO userPO);

    UserPO toPO(UserDO userDO);

    List<UserDO> toDOList(List<UserPO> userPOList);

    List<UserPO> toPOList(List<UserDO> userDOList);
}
