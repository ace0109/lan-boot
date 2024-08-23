package com.marvel.lan.domain.service;

import com.marvel.lan.domain.entity.ChinaAreaDO;

import java.util.List;

public interface ChinaAreaDomainService {

    /**
     * 获取所有省市区数据
     * @return List<ChinaArea>
     */
    List<ChinaAreaDO> getAllAreas();

    /**
     * 获取所有省份
     * @return List<ChinaArea>
     */
    List<ChinaAreaDO> getProvincesList();

    /**
     * 某个地区下的所有地区
     * @return List<ChinaArea>
     */
    List<ChinaAreaDO> getAreasListByCode(String code);
}
