package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageButton back = (ImageButton) findViewById(R.id.BackButton);
        back.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, com.example.android.musicapp.MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

