package com.ejjumo.song.controller;

import com.ejjumo.song.dto.Song;
import com.ejjumo.song.service.SongService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/song")
public class SongController {
    SongService songService;
    public SongController(SongService songService) {
        this.songService = songService;
    }

    /** 플레이리스트 노래 리스트 조회 [/song?playlistId=1] */
    @GetMapping()
    public List<Song> getAllSongsByPlaylist(@RequestParam("playlistId") int playlistId) throws SQLException {
        return songService.findByPlaylist(playlistId);
    }

    @DeleteMapping()
    public int deleteSong(@RequestParam("id") int songId) throws SQLException {
        return songService.remove(songId);
    }
}
