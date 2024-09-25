package com.ejjumo.song.dao;

import com.ejjumo.song.dto.Song;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface SongDAO {
    public int insert(Song song) throws SQLException;
    public int delete(int songId) throws SQLException;

    public List<Song> selectByPlaylist(int playlistId) throws SQLException;
    public String selectThumbnailByPlaylist(int playlistId) throws SQLException;
}
