package com.example.eva1_9_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwEtiq;
    final String sMostrar = "En 2010, Alison J. Head y Michael B. Eisenberg publicaron una investigación sobre el uso que dan a la Wikipedia los estudiantes universitarios. El estudio tuvo lugar en siete universidades de Estados Unidos, y tenía como objetivo mostrar con qué frecuencia, motivos y en qué momento de un trabajo académico, se utiliza esta enciclopedia. El resultado la posicionó como la sexta fuente de consulta y la segunda no académica; la enciclopedia predilecta para obtener un trasfondo general sobre un tema. Se ubicó por delante de sitios gubernamentales, compañeros de clase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwEtiq = findViewById(R.id.txtVwEtiq);
        txtVwEtiq.setText(sMostrar);
    }
}
