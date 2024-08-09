package com.marvel.lan.domain.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.marvel.lan.domain.user.entity.ChinaArea;
import com.marvel.lan.domain.user.service.ChinaAreaService;
import com.marvel.lan.infrastructure.persistence.DO.ChinaAreaDO;
import com.marvel.lan.infrastructure.persistence.repository.ChinaAreaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChinaAreaServiceImpl implements ChinaAreaService {

    private final ChinaAreaRepository chinaAreaRepository;

    public ChinaAreaServiceImpl(ChinaAreaRepository chinaAreaRepository) {
        this.chinaAreaRepository = chinaAreaRepository;
    }

    private List<ChinaArea> getChinaAreas(List<ChinaArea> areasList, QueryWrapper<ChinaAreaDO> queryWrapper) {
        List<ChinaAreaDO> chinaAreaDOList = chinaAreaRepository.list(queryWrapper);
        chinaAreaDOList.forEach(chinaAreaDO -> {
            ChinaArea chinaArea = new ChinaArea();
            chinaArea.setCode(chinaAreaDO.getCode());
            chinaArea.setId(chinaAreaDO.getId());
            chinaArea.setName(chinaAreaDO.getName());
            chinaArea.setParentCode(chinaAreaDO.getParentCode());
            chinaArea.setPinyin(chinaAreaDO.getPinyin());

            areasList.add(chinaArea);
        });
        return areasList;
    }


    @Override
    public List<ChinaArea> getAllAreas() {
        List<ChinaArea> areasList = new ArrayList<>();
        QueryWrapper<ChinaAreaDO> queryWrapper = new QueryWrapper<>();
        return getChinaAreas(areasList, queryWrapper);
    }

    @Override
    public List<ChinaArea> getProvincesList() {
        List<ChinaArea> areasList = new ArrayList<>();
        QueryWrapper<ChinaAreaDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("parent_code");
        return getChinaAreas(areasList, queryWrapper);
    }



    @Override
    public List<ChinaArea> getAreasListByCode(String code) {
        List<ChinaArea> areasList = new ArrayList<>();
        QueryWrapper<ChinaAreaDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_code", code);
        return getChinaAreas(areasList, queryWrapper);
    }
}
