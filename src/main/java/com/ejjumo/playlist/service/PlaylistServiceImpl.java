package com.ejjumo.playlist.service;

import com.ejjumo.playlist.dao.PlaylistDAO;
import com.ejjumo.playlist.dto.Playlist;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    private final PlaylistDAO playlistdao;

    public PlaylistServiceImpl(PlaylistDAO playlistdao) {
        this.playlistdao = playlistdao;
    }

    public int create(Playlist playlist) throws SQLException {
        return playlistdao.insert(playlist);
    }

    public int modify(Playlist playlist) throws SQLException {
        return playlistdao.update(playlist);
    }

    public int remove(int playlistId) throws SQLException {
        return playlistdao.delete(playlistId);
    }

    public Playlist find(int playlistId) throws SQLException {
        return playlistdao.select(playlistId);
    }

    public List<Playlist> findAll() throws SQLException {
        return playlistdao.selectAll();
    }

    public List<Playlist> findUserPlaylists(int userId) throws SQLException {
        return playlistdao.selectByUserId(userId);
    }
}
