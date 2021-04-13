package com.example.sejarahindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ImageView;


public class Bantuan extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);
        ImageView btnulang = findViewById(R.id.btnulang);

        btnulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bantuan.this,MenuUtama.class));
            }
        });


    }
}