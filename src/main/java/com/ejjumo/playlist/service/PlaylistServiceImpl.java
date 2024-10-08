package com.ejjumo.playlist.service;

import com.ejjumo.playlist.dao.PlaylistDAO;
import com.ejjumo.playlist.dto.Playlist;
import com.ejjumo.playlist.dto.PlaylistDetail;
import com.ejjumo.playlist.dto.PlaylistWithSong;
import com.ejjumo.playlist.dto.ThumbsUp;
import com.ejjumo.song.dao.SongDAO;
import com.ejjumo.song.dto.Song;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    public int create(Playlist playlist, List<Song> songs) throws SQLException {
        playlistDAO.insert(playlist);
        int playlistId = playlist.getPlaylistId();
        System.out.println("playlistId = " + playlistId);
        for (Song song: songs) {
            System.out.println("song = " + song);
            song.setPlaylistId(playlistId);
            songDAO.insert(song);
        }
        return playlistId;
    }

    public int modify(Playlist playlist) throws SQLException {
        return playlistDAO.update(playlist);
    }

    public ThumbsUp thumbsUp(int playlistId, int userId) throws SQLException {
        playlistDAO.insertThumbsUp(playlistId, userId);
        playlistDAO.updateThumbsUp(playlistId);
        int isThumbsUp = playlistDAO.checkThumbsUp(playlistId, userId);
        int thumbs = playlistDAO.select(playlistId).getThumbs();
        return new ThumbsUp(isThumbsUp == 1, thumbs);
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
        List<Playlist> playlists = playlistDAO.selectAll();
        for (Playlist playlist: playlists) {
            String thumbnail = songDAO.selectThumbnailByPlaylist(playlist.getPlaylistId());
            playlist.setThumbnail(thumbnail);
        }
        return playlists;
    }

    public List<Playlist> findUserPlaylists(int userId) throws SQLException {
        List<Playlist> playlists = playlistDAO.selectByUserId(userId);
        for (Playlist playlist: playlists) {
            String thumbnail = songDAO.selectThumbnailByPlaylist(playlist.getPlaylistId());
            playlist.setThumbnail(thumbnail);
        }
        return playlists;
    }
}
