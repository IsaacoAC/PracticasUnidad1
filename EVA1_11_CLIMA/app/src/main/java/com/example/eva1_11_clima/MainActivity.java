package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lstVwCLima;
    Wheater[] cities = {
        new Wheater("chihuahua", 22, "nublado", R.drawable.cloudy),
            new Wheater("Juarez", 0, "Nevado", R.drawable.snow),
            new Wheater("Madera", -5, "Nevado", R.drawable.snow),
            new Wheater("Mexicali", 38, "Soleado", R.drawable.sunny),
            new Wheater("Mazatlan", 28, "Soleado", R.drawable.sunny),
            new Wheater("Ojinaga", 15, "Peligro de Tornado", R.drawable.tornado),
            new Wheater("Parral", 13, "Tormenta Electrica", R.drawable.thunderstorm),
            new Wheater("Zacatecas", 20, "Probabilidad de lluvia", R.drawable.light_rain),
            new Wheater("Merida", 32, "Soleado", R.drawable.sunny),
            new Wheater("Veracruz", 22, "Lluvioso", R.drawable.rainy),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwCLima = findViewById(R.id.lstVwClima);
        lstVwCLima.setAdapter(new WeatherAdapter(this,R.layout.mi_layout,cities));
    }
}
