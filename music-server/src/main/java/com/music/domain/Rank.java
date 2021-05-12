package com.music.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 评价实体类
 * @author laojie
 */
@Data
public class Rank implements Serializable {
    /*主键*/
    private Integer id;
    /*歌单id*/
    private Integer songListId;
    /*用户id*/
    private Integer consumerId;
    /*评分*/
    private Integer score;
}
