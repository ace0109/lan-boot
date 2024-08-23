package com.marvel.lan.domain.entity;

import lombok.Data;

@Data
public class ChinaAreaDO {

    private Long id;
    private String name;
    private String code;
    private String parentCode;
    private String pinyin;

}
