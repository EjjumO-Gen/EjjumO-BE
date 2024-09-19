package com.ejjumo.playlist.service;

import com.ejjumo.playlist.dao.PlaylistDAO;
import com.ejjumo.playlist.dto.Playlist;
import com.ejjumo.playlist.dto.PlaylistDetail;
import com.ejjumo.playlist.dto.PlaylistWithSong;
import com.ejjumo.song.dao.SongDAO;
import com.ejjumo.song.dto.Song;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    private final PlaylistDAO playlistDAO;
    private final SongDAO songDAO;

    public PlaylistServiceImpl(PlaylistDAO playlistDAO, SongDAO songDAO) {
        this.playlistDAO = playlistDAO;
        this.songDAO = songDAO;
    }

    public int create(Playlist playlist) throws SQLException {
        return playlistDAO.insert(playlist);
    }

    public int modify(Playlist playlist) throws SQLException {
        return playlistDAO.update(playlist);
    }

    public int remove(int playlistId) throws SQLException {
        return playlistDAO.delete(playlistId);
    }

    public PlaylistWithSong find(int playlistId) throws SQLException {
        PlaylistDetail playlist = playlistDAO.select(playlistId);
        List<Song> songs = songDAO.selectByPlaylist(playlistId);
        return new PlaylistWithSong(playlist, songs);
    }

    public List<Playlist> findAll() throws SQLException {
        return playlistDAO.selectAll();
    }

    public List<Playlist> findUserPlaylists(int userId) throws SQLException {
        return playlistDAO.selectByUserId(userId);
    }
}
