package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextNom, editTextAp, editTextEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //CONECTAR COMPONENTES:
        editTextAp = findViewById(R.id.editTextAp);
        editTextNom = findViewById(R.id.editTetNom);
        editTextEdad = findViewById(R.id.editTextEdad);
        

    }
}
