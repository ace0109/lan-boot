package com.marvel.lan.application.service;

import com.marvel.lan.domain.entity.ChinaAreaDO;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface PCASService {

    Result<List<ChinaAreaDO>, Void> getAllAreas();

    Result<List<ChinaAreaDO>, Void> getProvincesList();

    Result<List<ChinaAreaDO>, Void> getAreasListByCode(String code);
}
