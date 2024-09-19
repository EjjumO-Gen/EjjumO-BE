package com.ejjumo.playlist.dto;

import com.ejjumo.comment.dto.Comment;

import java.util.List;

public class PlaylistWithComment {
    private PlaylistDetail playlist;
    private List<Comment> comments;

    public PlaylistWithComment() {
    }

    public PlaylistWithComment(PlaylistDetail playlist, List<Comment> comments) {
        this.playlist = playlist;
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PlaylistWithComment{" +
                "playlist=" + playlist +
                ", comments=" + comments +
                '}';
    }

    public PlaylistDetail getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlaylistDetail playlist) {
        this.playlist = playlist;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
