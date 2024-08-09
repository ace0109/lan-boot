package com.marvel.lan.infrastructure.persistence.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.marvel.lan.infrastructure.persistence.DO.ChinaAreaDO;
import com.marvel.lan.infrastructure.persistence.mapper.ChinaAreaMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ChinaAreaRepository extends ServiceImpl<ChinaAreaMapper, ChinaAreaDO> {
}
