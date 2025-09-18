package com.example.firstdemo.firstdemo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class firstdemoEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private int user_id;
    @Column(name="user_name")
    private String user_name;
    @Column(name="user_email")
    private String user_email;
    @Column(name="playlist")
    private String playlist;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<playlist> playlists;

    @ManyToMany(cascade = CascadeType.ALL)
@JoinTable(
    name = "user_song",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "song_id")
)
private List<song> songs;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="player_id")
private musicplayer player;
}
