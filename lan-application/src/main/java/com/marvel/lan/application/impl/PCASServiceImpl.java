package com.marvel.lan.application.impl;

import com.marvel.lan.application.PCASService;
import com.marvel.lan.domain.user.entity.ChinaArea;
import com.marvel.lan.domain.user.service.ChinaAreaService;
import com.marvel.lan.types.common.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCASServiceImpl implements PCASService {

    private final ChinaAreaService chinaAreaService;

    public PCASServiceImpl(ChinaAreaService chinaAreaService) {
        this.chinaAreaService = chinaAreaService;
    }


    @Override
    public Result<List<ChinaArea>> getAllAreas() {
        List<ChinaArea> chinaAreasList = chinaAreaService.getAllAreas();
        return Result.success(chinaAreasList);
    }

    @Override
    public Result<List<ChinaArea>> getProvincesList() {
        List<ChinaArea> chinaAreasList = chinaAreaService.getProvincesList();
        return Result.success(chinaAreasList);
    }

    @Override
    public Result<List<ChinaArea>> getAreasListByCode(String code) {
        List<ChinaArea> chinaAreasList = chinaAreaService.getAreasListByCode(code);
        return Result.success(chinaAreasList);
    }
}
