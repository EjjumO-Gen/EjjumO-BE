package com.ejjumo.user.dto;

import com.ejjumo.playlist.dto.Playlist;

import java.util.List;

public class UserPlaylist {
    private User user;
    private List<Playlist> playlist;

    public UserPlaylist() {
    }

    public UserPlaylist(User user, List<Playlist> playlist) {
        this.user = user;
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return "UserPlaylist{" +
                "user=" + user +
                ", playlist=" + playlist +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Playlist> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<Playlist> playlist) {
        this.playlist = playlist;
    }
}
