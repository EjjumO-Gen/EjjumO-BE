package com.ejjumo.playlist.dao;

import com.ejjumo.playlist.dto.Playlist;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface PlaylistDAO {
    public int insert(Playlist playlist) throws SQLException;
    public int update(Playlist playlist) throws SQLException;
    public int delete(int playlistId) throws SQLException;

    public Playlist select(int playlistId) throws SQLException;
    public List<Playlist> selectAll() throws SQLException;
    public List<Playlist> selectByUserId(int userId) throws SQLException;
}
