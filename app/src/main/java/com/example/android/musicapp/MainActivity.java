package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageButton settingsButton = (ImageButton) findViewById(R.id.SettingsButton);
        ImageButton searchButton = (ImageButton) findViewById(R.id.ArtistsButton);

        settingsButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
        searchButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

    }

}