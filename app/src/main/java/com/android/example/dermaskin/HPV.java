package com.android.example.dermaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HPV extends AppCompatActivity {
    ImageButton btnback;
    Button btnherpes,btnpenjelasan,btnpenyebab,btnpenyembuhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hpv);
        Button btnherpes = (Button) findViewById(R.id.btnherpes);
        Button btnpenyebab = (Button) findViewById(R.id.btnpenyebab);
        Button btnpenjelasan = (Button) findViewById(R.id.btnpenjelasan);
        Button btnpenyembuhan = (Button) findViewById(R.id.btnpenyembuhan);
        ImageButton btnback = (ImageButton) findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HPV.this,MainActivity.class));
            }
        });
        btnherpes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HPV.this,Herpes.class));
            }
        });
        btnpenjelasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView descpenyakit = (TextView) findViewById(R.id.descpenyakit);
                descpenyakit.setText(R.string.desc_penjelasan_HPV);
            }
        });
        btnpenyebab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView descpenyakit = (TextView) findViewById(R.id.descpenyakit);
                descpenyakit.setText(R.string.desc_penyebab_HPV);
            }
        });
        btnpenyembuhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView descpenyakit = (TextView) findViewById(R.id.descpenyakit);
                descpenyakit.setText(R.string.desc_penyembuhan_HPV);
            }
        });
    }
}