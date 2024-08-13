package com.marvel.lan.domain.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.marvel.lan.domain.user.entity.ChinaArea;
import com.marvel.lan.domain.user.service.ChinaAreaDomainService;
import com.marvel.lan.domain.user.service.converter.ChinaAreaConverter;
import com.marvel.lan.infrastructure.persistence.DO.ChinaAreaDO;
import com.marvel.lan.infrastructure.persistence.repository.ChinaAreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChinaAreaDomainServiceImpl implements ChinaAreaDomainService {

    private final ChinaAreaRepository chinaAreaRepository;

    public ChinaAreaDomainServiceImpl(ChinaAreaRepository chinaAreaRepository) {
        this.chinaAreaRepository = chinaAreaRepository;
    }

    private List<ChinaArea> getChinaAreas(QueryWrapper<ChinaAreaDO> queryWrapper) {
        List<ChinaAreaDO> chinaAreaDOList = chinaAreaRepository.list(queryWrapper);

        ChinaAreaConverter converter = ChinaAreaConverter.INSTANCE;

        return converter.toEntityList(chinaAreaDOList);
    }


    @Override
    public List<ChinaArea> getAllAreas() {
        QueryWrapper<ChinaAreaDO> queryWrapper = new QueryWrapper<>();
        return getChinaAreas(queryWrapper);
    }

    @Override
    public List<ChinaArea> getProvincesList() {
        QueryWrapper<ChinaAreaDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("parent_code");
        return getChinaAreas(queryWrapper);
    }



    @Override
    public List<ChinaArea> getAreasListByCode(String code) {
        QueryWrapper<ChinaAreaDO> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_code", code);
        return getChinaAreas(queryWrapper);
    }
}
