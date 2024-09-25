package com.ejjumo.playlist.service;

import com.ejjumo.playlist.dto.Playlist;
import com.ejjumo.playlist.dto.PlaylistWithSong;
import com.ejjumo.song.dto.Song;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

public interface PlaylistService {
    public int create(Playlist playlist, List<Song> songs) throws SQLException;
    public int modify(Playlist playlist) throws SQLException;

    @Transactional
    public int thumbsUp(int playlistId, int userId) throws SQLException;
    public int remove(int playlistId) throws SQLException;

    public PlaylistWithSong find(int playlistId) throws SQLException;
    public List<Playlist> findAll() throws SQLException;
    public List<Playlist> findUserPlaylists(int userId) throws SQLException;
}
