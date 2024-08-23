package com.marvel.lan.application.service.impl;

import com.marvel.lan.application.service.PCASService;
import com.marvel.lan.domain.user.entity.ChinaAreaDO;
import com.marvel.lan.domain.user.service.ChinaAreaDomainService;
import com.marvel.lan.types.common.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCASServiceImpl implements PCASService {

    private final ChinaAreaDomainService chinaAreaDomainService;

    public PCASServiceImpl(ChinaAreaDomainService chinaAreaDomainService) {
        this.chinaAreaDomainService = chinaAreaDomainService;
    }


    @Override
    public Result<List<ChinaAreaDO>, Void> getAllAreas() {
        List<ChinaAreaDO> chinaAreasListDO = chinaAreaDomainService.getAllAreas();
        return Result.success(chinaAreasListDO);
    }

    @Override
    public Result<List<ChinaAreaDO>, Void> getProvincesList() {
        List<ChinaAreaDO> chinaAreasListDO = chinaAreaDomainService.getProvincesList();
        return Result.success(chinaAreasListDO);
    }

    @Override
    public Result<List<ChinaAreaDO>, Void> getAreasListByCode(String code) {
        List<ChinaAreaDO> chinaAreasListDO = chinaAreaDomainService.getAreasListByCode(code);
        return Result.success(chinaAreasListDO);
    }
}
