package com.example.firstdemo.firstdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "playlist")
@Data
public class playlist {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="playlist_id")
    private int playlist_id;
    @Column(name="playlist_name")
    private String playlist_name;
    @Column(name="listed_songs")
    private String listed_songs;

    @ManyToOne
    @JoinColumn(name="user_id")
    private firstdemoEntity user;    
}
