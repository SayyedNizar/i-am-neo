package com.example.firstdemo.firstdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="musicplayer")
public class musicplayer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="player_id")
    private int player_id;
    @Column(name="current_song")
    private String current_song;
    @Column(name="is_playing")
    private boolean is_playing;
    
    @OneToOne(mappedBy="player")
    private firstdemoEntity user;
}
