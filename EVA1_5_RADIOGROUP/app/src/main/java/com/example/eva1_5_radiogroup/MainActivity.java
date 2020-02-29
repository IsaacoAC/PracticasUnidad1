package com.example.eva1_5_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup RdGrpMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RdGrpMusica = findViewById(R.id.RdGrpMusica);
        RdGrpMusica.setOnCheckedChangeListener(this);
    }



    @Override
    public void onCheckedChanged(RadioGroup RdGrpMusica, int checkedId) {
        //checkId es el Id del radio button seleccionado
        //findViewById regresa el VIew usando el Id
        RadioButton TextoRadio;
        TextoRadio = findViewById(checkedId);
        Toast.makeText(this,TextoRadio.getText(),Toast.LENGTH_LONG).show();
    }
}
