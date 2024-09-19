package com.ejjumo.playlist.dto;

public class PlaylistDetail {
    private int playlistId;
    private int userId;
    private String userName;
    private String playlistName;
    private String description;
    private String thumbnail;
    private int thumbs;
    private int comments;
    private boolean isThumbsup;

    public PlaylistDetail() {
    }

    public PlaylistDetail(int playlistId, int userId, String userName, String playlistName, String description, String thumbnail, int thumbs, int comments, boolean isThumbsup) {
        this.playlistId = playlistId;
        this.userId = userId;
        this.userName = userName;
        this.playlistName = playlistName;
        this.description = description;
        this.thumbnail = thumbnail;
        this.thumbs = thumbs;
        this.comments = comments;
        this.isThumbsup = isThumbsup;
    }

    @Override
    public String toString() {
        return "PlaylistDetail{" +
                "playlistId=" + playlistId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", playlistName='" + playlistName + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", thumbs=" + thumbs +
                ", comments=" + comments +
                ", isThumbsup=" + isThumbsup +
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getThumbs() {
        return thumbs;
    }

    public void setThumbs(int thumbs) {
        this.thumbs = thumbs;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public boolean isThumbsup() {
        return isThumbsup;
    }

    public void setThumbsup(boolean thumbsup) {
        isThumbsup = thumbsup;
    }
}
