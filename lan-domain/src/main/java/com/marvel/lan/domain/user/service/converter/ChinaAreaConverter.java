package com.marvel.lan.domain.user.service.converter;

import com.marvel.lan.domain.user.entity.ChinaArea;
import com.marvel.lan.infrastructure.persistence.DO.ChinaAreaDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChinaAreaConverter {
    ChinaAreaConverter INSTANCE = Mappers.getMapper(ChinaAreaConverter.class);

    // @Mapping(source = "name1", target = "name2") 若转换的实体之间存在字段不一致，可以添加@Mapping
    ChinaAreaDO toDO(ChinaArea entity);
    // @Mapping(source = "name2", target = "name1") 若转换的实体之间存在字段不一致，可以添加@Mapping
    ChinaArea toEntity(ChinaAreaDO dto);

    List<ChinaAreaDO> toDOList(List<ChinaArea> entityList);

    List<ChinaArea> toEntityList(List<ChinaAreaDO> dtoList);
}
