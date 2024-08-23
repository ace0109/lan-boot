package com.marvel.lan.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("routes")
public class RoutesPO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String path;
    private String name;
    private String component;
    private String redirect;
    private String metaTitle;
    private String metaIcon;
    private Integer metaExpanded;
    private Integer metaOrderNo;
    private Integer metaHidden;
    private Integer metaHiddenBreadcrumb;
    private Integer metaSingle;
    private String metaFrameSrc;
    private Integer metaFrameBlank;
    private Integer metaKeepAlive;

}
