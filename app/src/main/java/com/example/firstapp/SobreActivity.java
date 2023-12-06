package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    private Integer contador;
    private TextView textContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_sobre);

        this.contador = intent.getIntExtra("contador", 0);
        textContador = findViewById(R.id.textContadorSobre);
        textContador.setText(String.valueOf(this.contador));

    }

}