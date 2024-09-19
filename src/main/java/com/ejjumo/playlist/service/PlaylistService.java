package com.ejjumo.playlist.service;

import com.ejjumo.playlist.dto.Playlist;

import java.sql.SQLException;
import java.util.List;

public interface PlaylistService {
    public int create(Playlist playlist) throws SQLException;
    public int modify(Playlist playlist) throws SQLException;
    public int remove(int playlistId) throws SQLException;

    public Playlist find(int playlistId) throws SQLException;
    public List<Playlist> findAll() throws SQLException;
    public List<Playlist> findUserPlaylists(int userId) throws SQLException;
}
