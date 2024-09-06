package com.marvel.lan.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("routes")
public class RouterPO {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String parentId;
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

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;

    @TableLogic(value = "null", delval = "now()")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime deletedAt;

}
