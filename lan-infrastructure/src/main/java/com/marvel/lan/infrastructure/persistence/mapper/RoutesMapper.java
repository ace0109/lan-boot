package com.marvel.lan.infrastructure.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.marvel.lan.infrastructure.persistence.po.RoutesPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoutesMapper extends BaseMapper<RoutesPO> {
}
