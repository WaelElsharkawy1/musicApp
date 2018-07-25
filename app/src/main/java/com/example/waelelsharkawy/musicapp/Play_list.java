package com.example.waelelsharkawy.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Play_list extends AppCompatActivity {
    Button btn_back_home;
    ListView simpleList;
    ArrayList<Song> SongList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        btn_back_home = findViewById(R.id.btn_back_home);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Play_list.this, MainActivity.class);
                startActivity(intent);
            }
        });

        simpleList = findViewById(R.id.list_playlist);
        SongList.add(new Song("what about", "wael"));
        SongList.add(new Song("Mono", "mohamed"));
        SongList.add(new Song("Ahla kalam", "Tala"));
        SongList.add(new Song("Balah", "Amr"));
        SongList.add(new Song("Elanab", "sad"));
        SongList.add(new Song("elmahkama", "Ali"));
        SongList.add(new Song("Balah", "Amr"));
        SongList.add(new Song("hakem", "hakem"));

        CustomAdapter myAdapter = new CustomAdapter(this, R.layout.row_layout, SongList);
        simpleList.setAdapter(myAdapter);
    }
}
