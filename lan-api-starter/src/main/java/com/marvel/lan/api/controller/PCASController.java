package com.marvel.lan.api.controller;

import com.marvel.lan.application.PCASService;
import com.marvel.lan.domain.user.entity.ChinaArea;
import com.marvel.lan.types.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pcas")
public class PCASController {

    private final PCASService pcasService;

    public PCASController(PCASService pcasService) {
        this.pcasService = pcasService;
    }

    @GetMapping("/all")
    public Result<List<ChinaArea>> getAllChinaAreas()
    {
        return pcasService.getAllAreas();
    }

    @GetMapping("/areas")
    public Result<List<ChinaArea>> getProvincesList()
    {
        return pcasService.getProvincesList();
    }

    @GetMapping("/areas/{code}")
    public Result<List<ChinaArea>> getAreasByCode(@PathVariable String code)
    {
        return pcasService.getAreasListByCode(code);
    }
}
