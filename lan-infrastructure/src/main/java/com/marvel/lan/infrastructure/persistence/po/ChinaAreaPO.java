package com.marvel.lan.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("china_areas")
public class ChinaAreaPO {

    @TableId
    private Long id;
    private String name;
    private String code;
    private String parentCode;
    private String pinyin;

}
