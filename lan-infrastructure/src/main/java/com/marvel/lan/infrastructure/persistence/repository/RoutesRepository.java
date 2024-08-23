package com.marvel.lan.infrastructure.persistence.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.marvel.lan.infrastructure.persistence.mapper.RoutesMapper;
import com.marvel.lan.infrastructure.persistence.po.RoutesPO;
import org.springframework.stereotype.Repository;

@Repository
public class RoutesRepository extends ServiceImpl<RoutesMapper, RoutesPO> {

}
