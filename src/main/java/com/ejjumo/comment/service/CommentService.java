package com.ejjumo.comment.service;

import com.ejjumo.comment.dto.Comment;
import com.ejjumo.playlist.dto.PlaylistWithComment;

import java.sql.SQLException;
import java.util.List;

public interface CommentService {
    public int create(Comment comment) throws SQLException;
    public int remove(int commentId) throws SQLException;

    public PlaylistWithComment findByPlaylist(int playlistId) throws SQLException;
}
