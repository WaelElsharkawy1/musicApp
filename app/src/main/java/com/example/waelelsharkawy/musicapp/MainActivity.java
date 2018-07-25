package com.example.waelelsharkawy.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_choose_song;
    Button btn_play_list;
    Button btn_artists;
    Button btn_buy_song;
    Button btn_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_choose_song = findViewById(R.id.btn_choose_song);
        btn_play_list = findViewById(R.id.btn_play_list);
        btn_artists = findViewById(R.id.btn_artists);
        btn_buy_song = findViewById(R.id.btn_buy_song);
        btn_setting = findViewById(R.id.btn_setting);

        btn_choose_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, choose_song.class);
                startActivity(intent);
            }
        });
        btn_play_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Play_list.class);
                startActivity(intent);
            }
        });
        btn_artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Artists.class);
                startActivity(intent);
            }
        });
        btn_buy_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Buy_song.class);
                startActivity(intent);
            }
        });
        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Setting.class);
                startActivity(intent);
            }
        });

    }
}
