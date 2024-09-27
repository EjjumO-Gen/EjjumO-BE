package com.ejjumo.playlist.dao;

import com.ejjumo.playlist.dto.Playlist;
import com.ejjumo.playlist.dto.PlaylistDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface PlaylistDAO {
    @Options(useGeneratedKeys = true, keyProperty = "playlistId", keyColumn = "playlist_id")
    public int insert(Playlist playlist) throws SQLException;

    public int update(Playlist playlist) throws SQLException;
    public int insertThumbsUp(int playlistId, int userId) throws SQLException;
    public int updateThumbsUp(int playlistId) throws SQLException;
    public int checkThumbsUp(int playlistId, int userId) throws SQLException;
    public int delete(int playlistId) throws SQLException;

    public PlaylistDetail select(int playlistId) throws SQLException;
    public List<Playlist> selectAll() throws SQLException;
    public List<Playlist> selectByUserId(int userId) throws SQLException;
}
