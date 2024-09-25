package com.ejjumo.user.service;

import com.ejjumo.playlist.dao.PlaylistDAO;
import com.ejjumo.playlist.dto.Playlist;
import com.ejjumo.song.dao.SongDAO;
import com.ejjumo.user.dao.UserDAO;
import com.ejjumo.user.dto.User;
import com.ejjumo.user.dto.UserPlaylist;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;
    private final PlaylistDAO playlistDAO;
    private final SongDAO songDAO;

    public UserServiceImpl(UserDAO userDAO, PlaylistDAO playlistDAO, SongDAO songDAO) {
        this.userDAO = userDAO;
        this.playlistDAO = playlistDAO;
        this.songDAO = songDAO;
    }

    public int register(User user) throws SQLException {
        return userDAO.insert(user);
    }

    public UserPlaylist findUser(int userId) throws SQLException {
        User user = userDAO.select(userId);
        List<Playlist> playlists = playlistDAO.selectByUserId(userId);
        for (Playlist playlist: playlists) {
            String thumbnail = songDAO.selectThumbnailByPlaylist(playlist.getPlaylistId());
            playlist.setThumbnail(thumbnail);
        }
        return new UserPlaylist(user, playlists);
    }

    public User findUserByKakaoId(String kakaoId) throws SQLException {
        return userDAO.selectByKakaoId(kakaoId);
    }

    public List<User> findAllUsers() throws SQLException {
        return userDAO.selectAll();
    }
}
