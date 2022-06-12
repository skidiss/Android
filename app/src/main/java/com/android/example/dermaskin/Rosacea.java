package com.android.example.dermaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Rosacea extends AppCompatActivity {
    ImageButton btnback;
    Button btnjerawat,btnpenjelasan,btnpenyebab,btnpenyembuhan;
    TextView descpenyakit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rosacea);
        ImageButton btnback = (ImageButton) findViewById(R.id.btnback);
        Button btnjerawat = (Button) findViewById(R.id.btnjerawat);
        Button btnpenyebab = (Button) findViewById(R.id.btnpenyebab);
        Button btnpenjelasan = (Button) findViewById(R.id.btnpenjelasan);
        Button btnpenyembuhan = (Button) findViewById(R.id.btnpenyembuhan);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rosacea.this,MainActivity.class));
            }
        });
        btnjerawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Rosacea.this,Jerawat.class));
            }
        });
        btnpenjelasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView descpenyakit = (TextView) findViewById(R.id.descpenyakit);
                descpenyakit.setText(R.string.desc_penjelasan_Rosacea);
            }
        });
        btnpenyebab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView descpenyakit = (TextView) findViewById(R.id.descpenyakit);
                descpenyakit.setText(R.string.desc_penyebab_Rosacea);
            }
        });
        btnpenyembuhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView descpenyakit = (TextView) findViewById(R.id.descpenyakit);
                descpenyakit.setText(R.string.desc_penyembuhan_Rosacea);
            }
        });
    }
}