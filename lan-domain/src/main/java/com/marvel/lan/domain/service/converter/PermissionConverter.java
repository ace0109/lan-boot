package com.marvel.lan.domain.service.converter;

import com.marvel.lan.domain.entity.RouterDO;
import com.marvel.lan.infrastructure.persistence.po.RouterPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PermissionConverter {
    PermissionConverter INSTANCE = Mappers.getMapper(PermissionConverter.class);

    RouterPO RouterDOtoPO(RouterDO routerDO);
    RouterDO RouterPOtoDO(RouterPO routerPO);
}
