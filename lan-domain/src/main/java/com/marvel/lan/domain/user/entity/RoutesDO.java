package com.marvel.lan.domain.user.entity;

import lombok.Data;

@Data
public class RoutesDO {

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
