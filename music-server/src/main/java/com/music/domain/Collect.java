package com.music.domain;

import lombok.Data;

import java.util.Date;

/**
 * 收藏 实体类
 * @author laojie
 */
@Data
public class Collect {
    private Integer id;     //主键
    private Integer userId; //用户id
    private Byte type;      //收藏类型（0歌曲1歌单）
    private Integer songId; //歌曲id
    private Integer songListId; //歌单id
    private Date createTime;    //收藏时间
}
