package com.marvel.lan.application.service;

import com.marvel.lan.domain.entity.RouterDO;
import com.marvel.lan.types.common.Result;

import java.util.List;

public interface PermissionService {
    Result<List<RouterDO>, Void> getPermissionList();
}
