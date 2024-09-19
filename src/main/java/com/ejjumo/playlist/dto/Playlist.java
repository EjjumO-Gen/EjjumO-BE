package com.ejjumo.playlist.dto;

import java.util.Date;

public class Playlist {
    private int playlistId;
    private int userId;
    private String playlistName;
    private String description;
    private int thumbs;
    private Date createdAt;
    private Date updatedAt;

    public Playlist() {
    }

    public Playlist(int playlistId, int userId, String playlistName, String description, int thumbs, Date createdAt, Date updatedAt) {
        this.playlistId = playlistId;
        this.userId = userId;
        this.playlistName = playlistName;
        this.description = description;
        this.thumbs = thumbs;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", userId=" + userId +
                ", playlistName='" + playlistName + '\'' +
                ", description='" + description + '\'' +
                ", thumbs=" + thumbs +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThumbs() {
        return thumbs;
    }

    public void setThumbs(int thumbs) {
        this.thumbs = thumbs;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
