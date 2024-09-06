package com.marvel.lan.infrastructure.persistence.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.marvel.lan.infrastructure.persistence.mapper.RouterMapper;
import com.marvel.lan.infrastructure.persistence.po.RouterPO;
import org.springframework.stereotype.Repository;

@Repository
public class RoutesRepository extends ServiceImpl<RouterMapper, RouterPO> {

    public RouterPO saveAndReturn(RouterPO routerPO) {
        save(routerPO);
        return getById(routerPO.getId());
    }
}
