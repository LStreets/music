package com.music.dao;

import com.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 歌曲dao
 * @author laojie
 */
@Repository
public interface SongMapper {
    //增加
    public int insert(Song song);

    //修改
    public int update(Song song);

    //删除
    public  int delete(Integer id);

    //查询（根据主键查询整个对象）
    public Song selectByPrimaryKey(Integer id);

    //查询所有歌曲
    public List<Song> allSong();

    //根据歌名精确查询歌曲列表
    public List<Song> songOfName(String name);

    //根据歌名模糊查询歌曲列表
    public List<Song> likeSongOfName(String name);

    //根据歌手id查询
    public List<Song> songOfSingerId(Integer id);

}
