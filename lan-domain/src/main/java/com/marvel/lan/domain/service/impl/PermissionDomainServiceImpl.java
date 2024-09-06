package com.marvel.lan.domain.service.impl;

import com.marvel.lan.domain.entity.RouterDO;
import com.marvel.lan.domain.service.PermissionDomainService;
import com.marvel.lan.domain.service.converter.PermissionConverter;
import com.marvel.lan.infrastructure.persistence.po.RouterPO;
import com.marvel.lan.infrastructure.persistence.repository.RoutesRepository;
import org.springframework.stereotype.Service;

@Service
public class PermissionDomainServiceImpl implements PermissionDomainService {

    private final RoutesRepository routesRepository;

    public PermissionDomainServiceImpl(RoutesRepository routesRepository) {
        this.routesRepository = routesRepository;
    }

    @Override
    public RouterDO createRoute(RouterDO routerDO) {
        RouterPO routerPO = PermissionConverter.INSTANCE.RouterDOtoPO(routerDO);

        RouterPO saveResult = routesRepository.saveAndReturn(routerPO);
        return PermissionConverter.INSTANCE.RouterPOtoDO(saveResult);
    }
}
