package com.example.firstdemo.firstdemo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="song")
public class song {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="song_id")
    private int song_id;
    @Column(name="song_title")
    private String song_title;
    @Column(name="song_duration")
    private int song_duration;
    @Column(name="artist_name")
    private String artist_name;
    @Column(name="album")
    private String album;

@ManyToMany(mappedBy = "songs")
private List<firstdemoEntity> users;



    
}
