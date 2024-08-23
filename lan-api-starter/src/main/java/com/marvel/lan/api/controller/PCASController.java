package com.marvel.lan.api.controller;

import com.marvel.lan.application.service.PCASService;
import com.marvel.lan.domain.entity.ChinaAreaDO;
import com.marvel.lan.types.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @folder 省市区管理
 */
@RestController
@RequestMapping("/pcas")
public class PCASController {

    private final PCASService pcasService;

    public PCASController(PCASService pcasService) {
        this.pcasService = pcasService;
    }

    /**
     * @api.name 查询所有省市区数据
     * @developing
     */
    @GetMapping("/all")
    public Result<List<ChinaAreaDO>, Void> getAllChinaAreas()
    {
        return pcasService.getAllAreas();
    }

    /**
     * @api.name 查询所有省份
     * @developing
     */
    @GetMapping("/areas")
    public Result<List<ChinaAreaDO>, Void> getProvincesList()
    {
        return pcasService.getProvincesList();
    }

    /**
     * @api.name 根据code查询省市区
     * @developing
     */
    @GetMapping("/areas/{code}")
    public Result<List<ChinaAreaDO>, Void> getAreasByCode(@PathVariable String code)
    {
        return pcasService.getAreasListByCode(code);
    }
}
