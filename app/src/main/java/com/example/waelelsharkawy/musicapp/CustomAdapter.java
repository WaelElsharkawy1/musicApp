package com.example.waelelsharkawy.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Song> {

    ArrayList<Song> SongList = new ArrayList<>();

    public CustomAdapter(Context context, int textViewResourceId, ArrayList<Song> objects) {
        super(context, textViewResourceId, objects);
        SongList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.row_layout, null);
        TextView txt_song_name = v.findViewById(R.id.song_name);
        TextView txt_artist_name = v.findViewById(R.id.artist_name);
        txt_song_name.setText(SongList.get(position).getSongName());
        txt_artist_name.setText(SongList.get(position).getArtistName());
        return v;
    }
}
