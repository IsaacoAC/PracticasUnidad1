package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioButton rdbtnEsp,rdbtnIng;
    RadioGroup rdgrpIdioma;
    EditText editTextNom, editTextApe, editTextNum;
    TextView txtWiewSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdbtnEsp = findViewById(R.id.rdbtnEsp);
        rdbtnIng = findViewById(R.id.rdbtnIngles);
        rdgrpIdioma = findViewById(R.id.rdgrpIdioma);
        editTextApe = findViewById(R.id.editTextApellido);
        editTextNom = findViewById(R.id.editTextNom);
        editTextNum = findViewById(R.id.editTextNum);
        txtWiewSelect = findViewById(R.id.textViewSele);
        rdgrpIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId==R.id.rdbtnEsp){
            txtWiewSelect.setText(R.string.idioma_es);
            rdbtnEsp.setText(R.string.Espanol_esp);
            rdbtnIng.setText(R.string.ingles_esp);
        }else{
            txtWiewSelect.setText(R.string.idioma_en);
            rdbtnEsp.setText(R.string.espanol_ing);
            rdbtnIng.setText(R.string.ingles_ing);
        }
    }
}
