package com.example.waelelsharkawy.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Buy_song extends AppCompatActivity {
    Button btn_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_song);
        btn_back_home = findViewById(R.id.btn_back_home);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Buy_song.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
