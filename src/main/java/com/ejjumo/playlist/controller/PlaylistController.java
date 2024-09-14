package com.ejjumo.playlist.controller;

import com.ejjumo.playlist.dto.Playlist;
import com.ejjumo.playlist.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/playlist")
public class PlaylistController {

    PlaylistService playlistService;
    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping()
    public List<Playlist> getAllPlaylists() throws SQLException {
        return playlistService.findAll();
    }

    @GetMapping(params = "id")
    public Playlist getPlaylistById(@RequestParam("id") int playlistId) throws SQLException {
        return playlistService.find(playlistId);
    }

    @GetMapping("user")
    public List<Playlist> getUserPlaylists(@RequestParam("id") int userId) throws SQLException {
        return playlistService.findUserPlaylists(userId);
    }

}
