package com.example.eva1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MiClicListener implements View.OnClickListener {
        Context context;

    public MiClicListener(Context context){
        this.context=context;
    }

    public void eventoClic(View v){
        //toast es un mensaje rapido en pantalla
        Toast.makeText(context,"evento por Clase", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

    }
}
