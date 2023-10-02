package com.example.demo.Repository;

import com.example.demo.Model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

    @Query("SELECT a FROM Music a WHERE a.id = ?1")
    Optional<Music> findMusicById(Integer id);

    @Query("SELECT a FROM Music a WHERE a.artist = ?1")
    Optional<Music> findMusicByArtist(String artist);
}
