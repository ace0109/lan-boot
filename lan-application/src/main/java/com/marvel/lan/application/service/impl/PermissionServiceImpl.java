package com.marvel.lan.application.service.impl;

import com.marvel.lan.application.service.PermissionService;
import com.marvel.lan.domain.entity.RouterDO;
import com.marvel.lan.types.common.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Override
    public Result<List<RouterDO>, Void> getPermissionList() {
        return Result.success(null);
    }
}
