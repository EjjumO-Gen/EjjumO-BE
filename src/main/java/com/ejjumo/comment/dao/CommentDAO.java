package com.ejjumo.comment.dao;

import com.ejjumo.comment.dto.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface CommentDAO {
    public int insert(Comment comment) throws SQLException;
    public int delete(int commentId) throws SQLException;

    public List<Comment> selectByPlaylist(int playlistId) throws SQLException;
}
