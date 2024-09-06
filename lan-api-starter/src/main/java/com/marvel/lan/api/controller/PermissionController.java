package com.marvel.lan.api.controller;

import com.marvel.lan.application.service.PermissionService;
import com.marvel.lan.domain.entity.RouterDO;
import com.marvel.lan.types.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @folder 权限管理
 */
@Slf4j
@RestController
@RequestMapping("/permission")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    /**
     * @api.name 查询路由列表
     * @developing
     */
    @GetMapping("/list")
    public Result<List<RouterDO>, Void> getPermissionList()
    {
        return permissionService.getPermissionList();
    }

    /**
     *
     * @api.name 创建路由
     * @developing
     */
    @PostMapping("/create")
    public Result<RouterDO, Void> createPermission(RouterDO routerDO)
    {
        return null;
    }

}
