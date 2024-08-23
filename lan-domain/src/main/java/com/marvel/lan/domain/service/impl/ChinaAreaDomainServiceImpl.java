package com.marvel.lan.domain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.marvel.lan.domain.entity.ChinaAreaDO;
import com.marvel.lan.domain.service.ChinaAreaDomainService;
import com.marvel.lan.domain.service.converter.ChinaAreaConverter;
import com.marvel.lan.infrastructure.persistence.po.ChinaAreaPO;
import com.marvel.lan.infrastructure.persistence.repository.ChinaAreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChinaAreaDomainServiceImpl implements ChinaAreaDomainService {

    private final ChinaAreaRepository chinaAreaRepository;

    public ChinaAreaDomainServiceImpl(ChinaAreaRepository chinaAreaRepository) {
        this.chinaAreaRepository = chinaAreaRepository;
    }

    private List<ChinaAreaDO> getChinaAreas(QueryWrapper<ChinaAreaPO> queryWrapper) {
        List<ChinaAreaPO> chinaAreaPOList = chinaAreaRepository.list(queryWrapper);

        ChinaAreaConverter converter = ChinaAreaConverter.INSTANCE;

        return converter.toDOList(chinaAreaPOList);
    }


    @Override
    public List<ChinaAreaDO> getAllAreas() {
        QueryWrapper<ChinaAreaPO> queryWrapper = new QueryWrapper<>();
        return getChinaAreas(queryWrapper);
    }

    @Override
    public List<ChinaAreaDO> getProvincesList() {
        QueryWrapper<ChinaAreaPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("parent_code");
        return getChinaAreas(queryWrapper);
    }



    @Override
    public List<ChinaAreaDO> getAreasListByCode(String code) {
        QueryWrapper<ChinaAreaPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_code", code);
        return getChinaAreas(queryWrapper);
    }
}
