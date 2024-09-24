package com.ejjumo.comment.controller;

import com.ejjumo.comment.dto.Comment;
import com.ejjumo.comment.service.CommentService;
import com.ejjumo.playlist.dto.PlaylistWithComment;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/comment")
public class CommentController {
    CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping()
    public PlaylistWithComment getCommentsByPlaylist(@RequestParam("playlistId") int playlistId) throws SQLException {
        return commentService.findByPlaylist(playlistId);
    }
}
