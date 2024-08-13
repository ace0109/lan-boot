package com.marvel.lan.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("users")
public class UserPO {

    @TableId
    private Long id;
    private String username;
    private String password;
    private String email;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
