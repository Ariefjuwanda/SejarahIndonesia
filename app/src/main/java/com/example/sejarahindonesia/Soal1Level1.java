package com.example.sejarahindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Soal1Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1level1);
        ImageButton viewnilai = findViewById(R.id.viewNilai);
        Button btnulang = findViewById(R.id.buttonUlang);

        viewnilai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Soal1Level1.this, Level1.class));
            }
        });

        btnulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Soal1Level1.this,Level1Done.class));
            }
        });

    }
}