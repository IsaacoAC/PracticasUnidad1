package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{

    Button btnListe;
    Button btnAnon;
    Button btnClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListe = findViewById(R.id.btnListener);
        btnAnon = findViewById(R.id.btnAnon);
        btnClase = findViewById(R.id.btnClase);

        btnListe.setOnClickListener(this);
        btnAnon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"evento por clase anonima", Toast.LENGTH_LONG).show();

            }
        });
        btnClase.setOnClickListener(new MiClicListener(getApplicationContext()) {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"evento por Clase", Toast.LENGTH_LONG).show();

            }
        });

    }

    public void eventoClic(View v){
        //toast es un mensaje rapido en pantalla
        Toast.makeText(this,"evento por XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"evento por Listener", Toast.LENGTH_LONG).show();
    }



    }

