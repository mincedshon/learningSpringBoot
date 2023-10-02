package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Music {
    @Id
    @SequenceGenerator(
            name = "music_sequence",
            sequenceName = "music_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "music_sequence"
    )
    private Integer id;
    private String title;
    private String artist;
    public Music() {
    }
    public Music(Integer id,
                 String title,
                 String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public Music(String title,
                 String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Music{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
