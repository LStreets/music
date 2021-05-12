package com.music.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author laojie
 * 管理员实体类
 */
@Data
public class Admin implements Serializable {
    //主键
    private Integer id;
    //账号
    private String name;
    //密码
    private String password;
}
