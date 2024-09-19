package com.ejjumo.song.service;

import com.ejjumo.song.dto.Song;

import java.sql.SQLException;
import java.util.List;

public interface SongService {
    public int create(Song song) throws SQLException;
    public int remove(int songId) throws SQLException;

    public List<Song> findByPlaylist(int playlistId) throws SQLException;
}
