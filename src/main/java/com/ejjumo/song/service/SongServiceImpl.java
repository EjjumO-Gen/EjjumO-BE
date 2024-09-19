package com.ejjumo.song.service;

import com.ejjumo.song.dao.SongDAO;
import com.ejjumo.song.dto.Song;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    private final SongDAO songdao;

    public SongServiceImpl(SongDAO songdao) {
        this.songdao = songdao;
    }

    public int create(Song song) throws SQLException {
        return songdao.insert(song);
    }

    public int remove(int songId) throws SQLException {
        return songdao.delete(songId);
    }

    public List<Song> findByPlaylist(int playlistId) throws SQLException {
        System.out.println("playlistId: " + playlistId);
        System.out.println(songdao.selectByPlaylist(playlistId));
        return songdao.selectByPlaylist(playlistId);
    }
}
