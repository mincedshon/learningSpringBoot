package com.example.demo.Service;

import com.example.demo.Model.Music;
import com.example.demo.Repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;;
import java.util.List;

@Service
public class MusicService {

    private final MusicRepository musicRepository;

    @Autowired
    public MusicService(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public List<Music> getAllMusic() {
        return musicRepository.findAll();
    }

    public Music getMusicById(Integer id) {
        if (musicRepository.existsById(id))
            return musicRepository.getById(id);
    }
}
