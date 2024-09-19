package com.ejjumo.comment.service;

import com.ejjumo.comment.dao.CommentDAO;
import com.ejjumo.comment.dto.Comment;
import com.ejjumo.playlist.dao.PlaylistDAO;
import com.ejjumo.playlist.dto.PlaylistDetail;
import com.ejjumo.playlist.dto.PlaylistWithComment;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    private final CommentDAO commentDAO;
    private final PlaylistDAO playlistDAO;

    public CommentServiceImpl(CommentDAO commentDAO, PlaylistDAO playlistDAO) {
        this.commentDAO = commentDAO;
        this.playlistDAO = playlistDAO;
    }

    public int create(Comment comment) throws SQLException {
        return commentDAO.insert(comment);
    }

    public int remove(int commentId) throws SQLException {
        return commentDAO.delete(commentId);
    }

    public PlaylistWithComment findByPlaylist(int playlistId) throws SQLException {
        PlaylistDetail playlist = playlistDAO.select(playlistId);
        List<Comment> comment = commentDAO.selectByPlaylist(playlistId);
        return new PlaylistWithComment(playlist, comment);

    }


}
