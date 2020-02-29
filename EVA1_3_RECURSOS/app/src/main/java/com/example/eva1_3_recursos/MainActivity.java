package com.example.eva1_3_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen= findViewById(R.id.imgViewImagen);
        titulo = findViewById(R.id.txtVwTitulo);
        imagen.setImageResource(R.drawable.images);
    }
}
