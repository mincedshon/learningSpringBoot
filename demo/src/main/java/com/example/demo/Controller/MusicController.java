package com.example.demo.Controller;

import com.example.demo.Model.Music;
import com.example.demo.Service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class MusicController {

    private final MusicService musicService;

    @Autowired
    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/music")
    public Collection<Music> getAllMusic() {
        return musicService.getAllMusic();
    };

    @GetMapping("/music/{id}")
    public Music getMusicById(@PathVariable Integer id) {
        return musicService.getMusicById(id);
    };


}
