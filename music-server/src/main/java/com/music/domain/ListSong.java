package com.music.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 歌曲歌单实体类
 * @author laojie
 */
@Data
public class ListSong implements Serializable {

    private Integer id;     //主键

    private Integer songId; //歌曲id

    private Integer songListId; //歌单id
}
