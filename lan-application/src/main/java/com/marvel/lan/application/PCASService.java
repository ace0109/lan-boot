package com.marvel.lan.application;

import com.marvel.lan.domain.user.entity.ChinaAreaDO;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface PCASService {

    Result<List<ChinaAreaDO>> getAllAreas();

    Result<List<ChinaAreaDO>> getProvincesList();

    Result<List<ChinaAreaDO>> getAreasListByCode(String code);
}
