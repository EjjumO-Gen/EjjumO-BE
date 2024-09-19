package com.ejjumo.song.dto;

public class Song {
    private int songId;
    private int playlistId;
    private String title;
    private String artist;
    private String thumbnail;
    private String videoId;
    private String duration;

    public Song() {

    }

    public Song(int songId, int playlistId, String title, String artist, String thumbnail, String videoId, String duration) {
        this.songId = songId;
        this.playlistId = playlistId;
        this.title = title;
        this.artist = artist;
        this.thumbnail = thumbnail;
        this.videoId = videoId;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", playlistId=" + playlistId +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", videoId='" + videoId + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
