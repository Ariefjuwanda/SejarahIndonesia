package com.example.sejarahindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        ImageButton btnlevel1 = findViewById(R.id.buttonLevel1);
        ImageButton btnlevel2 = findViewById(R.id.buttonLevel2);
        ImageButton btnlevel3 = findViewById(R.id.buttonLevel3);
        ImageButton btnlevel4 = findViewById(R.id.buttonLevel4);

        btnlevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(level.this,Level1.class));
            }
        });
    }
}