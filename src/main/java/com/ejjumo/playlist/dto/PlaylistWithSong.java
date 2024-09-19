package com.ejjumo.playlist.dto;

import com.ejjumo.song.dto.Song;

import java.util.List;

public class PlaylistWithSong {
    private PlaylistDetail playlist;
    private List<Song> songs;

    public PlaylistWithSong() {
    }

    public PlaylistWithSong(PlaylistDetail playlist, List<Song> songs) {
        this.playlist = playlist;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "PlaylistWithSong{" +
                "playlist=" + playlist +
                ", songs=" + songs +
                '}';
    }

    public PlaylistDetail getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlaylistDetail playlist) {
        this.playlist = playlist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
