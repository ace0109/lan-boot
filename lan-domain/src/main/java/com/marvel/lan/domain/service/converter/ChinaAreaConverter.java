package com.marvel.lan.domain.service.converter;

import com.marvel.lan.domain.entity.ChinaAreaDO;
import com.marvel.lan.infrastructure.persistence.po.ChinaAreaPO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChinaAreaConverter {
    ChinaAreaConverter INSTANCE = Mappers.getMapper(ChinaAreaConverter.class);

    // @Mapping(source = "name1", target = "name2") 若转换的实体之间存在字段不一致，可以添加@Mapping
    ChinaAreaPO toPO(ChinaAreaDO entity);
    // @Mapping(source = "name2", target = "name1") 若转换的实体之间存在字段不一致，可以添加@Mapping
    ChinaAreaDO toDO(ChinaAreaPO dto);

    List<ChinaAreaPO> toPOList(List<ChinaAreaDO> entityList);

    List<ChinaAreaDO> toDOList(List<ChinaAreaPO> dtoList);
}
