package com.marvel.lan.application.impl;

import com.marvel.lan.application.PCASService;
import com.marvel.lan.domain.user.entity.ChinaArea;
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
    public Result<List<ChinaArea>> getAllAreas() {
        List<ChinaArea> chinaAreasList = chinaAreaDomainService.getAllAreas();
        return Result.success(chinaAreasList);
    }

    @Override
    public Result<List<ChinaArea>> getProvincesList() {
        List<ChinaArea> chinaAreasList = chinaAreaDomainService.getProvincesList();
        return Result.success(chinaAreasList);
    }

    @Override
    public Result<List<ChinaArea>> getAreasListByCode(String code) {
        List<ChinaArea> chinaAreasList = chinaAreaDomainService.getAreasListByCode(code);
        return Result.success(chinaAreasList);
    }
}
