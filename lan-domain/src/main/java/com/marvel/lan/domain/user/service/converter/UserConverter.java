package com.marvel.lan.domain.user.service.converter;

import com.marvel.lan.domain.user.entity.User;
import com.marvel.lan.infrastructure.persistence.DO.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    User toEntity(UserDO dto);

    UserDO toDO(User entity);

    List<User> toEntityList(List<UserDO> dtoList);

    List<UserDO> toDOList(List<User> entityList);
}
