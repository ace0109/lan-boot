package com.marvel.lan.infrastructure.persistence.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("user")
public class UserPO {

    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    private String username;
    private String password;
    private String email;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedAt;

    @TableLogic(value = "null", delval = "now()")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime deletedAt;

}
