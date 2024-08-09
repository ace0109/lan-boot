package com.marvel.lan.infrastructure.persistence.DO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("china_areas")
public class ChinaAreaDO {

    @TableId
    private Long id;
    private String name;
    private String code;
    private String parentCode;
    private String pinyin;

}
