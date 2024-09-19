package com.ejjumo.comment.dto;

import java.util.Date;

public class Comment {
    private int commentId;
    private int userId;
    private String userName;
    private String profilePic;
    private int playlistId;
    private String content;
    private boolean isChecked;
    private Date createdAt;
    private Date updatedAt;

    public Comment() {
    }

    public Comment(int commentId, int userId, String userName, String profilePic, int playlistId, String content, boolean isChecked, Date createdAt, Date updatedAt) {
        this.commentId = commentId;
        this.userId = userId;
        this.userName = userName;
        this.profilePic = profilePic;
        this.playlistId = playlistId;
        this.content = content;
        this.isChecked = isChecked;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", profilePic='" + profilePic + '\'' +
                ", playlistId=" + playlistId +
                ", content='" + content + '\'' +
                ", isChecked=" + isChecked +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
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
