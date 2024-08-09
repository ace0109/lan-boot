package com.marvel.lan.application;

import com.marvel.lan.domain.user.entity.ChinaArea;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface PCASService {

    Result<List<ChinaArea>> getAllAreas();

    Result<List<ChinaArea>> getProvincesList();

    Result<List<ChinaArea>> getAreasListByCode(String code);
}
