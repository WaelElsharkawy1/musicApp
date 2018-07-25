package com.example.waelelsharkawy.musicapp;

import java.util.Date;

public class Song {
    String SongName;
    String artistName;

    public Song(String songName, String artistName) {
        SongName = songName;
        this.artistName = artistName;
    }

    public String getSongName() {
        return SongName;
    }

    public String getArtistName() {
        return artistName;
    }
}
