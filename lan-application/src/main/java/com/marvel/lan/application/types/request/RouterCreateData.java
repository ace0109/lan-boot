package com.marvel.lan.application.types.request;

import lombok.Data;

@Data
public class RouterCreateData {

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

}
