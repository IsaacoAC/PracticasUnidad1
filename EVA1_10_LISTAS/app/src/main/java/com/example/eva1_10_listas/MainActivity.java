package com.example.eva1_10_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstMemoria;
    String[] aDatos = {
        "hola",
        "adios",
         "Bye",
         "Como",
         "Estas",
         "Bien",
         "papa",
         "maldita",
         "sea",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstMemoria = findViewById(R.id.lstMemoria);
        lstMemoria.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,aDatos));

        lstMemoria.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,aDatos[position],Toast.LENGTH_LONG).show();
    }
}
