package com.marvel.lan.domain.user.service;

import com.marvel.lan.domain.user.entity.ChinaArea;

import java.util.List;

public interface ChinaAreaService {

    /**
     * 获取所有省市区数据
     * @return List<ChinaArea>
     */
    List<ChinaArea> getAllAreas();

    /**
     * 获取所有省份
     * @return List<ChinaArea>
     */
    List<ChinaArea> getProvincesList();

    /**
     * 某个地区下的所有地区
     * @return List<ChinaArea>
     */
    List<ChinaArea> getAreasListByCode(String code);
}
