package com.example.chinegua.fem_interfaz_botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTexto = (TextView) findViewById(R.id.tvTexto);
        final Button boton4 = (Button) findViewById(R.id.button7);

        boton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tvTexto.setText(boton4.getText());
            }
        });

    }

    public void pulsaBoton(View v){
        Button botonpulsado = (Button) findViewById(v.getId());
        Log.i("MiW",botonpulsado.getText().toString());

        tvTexto = (TextView) findViewById(R.id.tvTexto);
        tvTexto.setText(botonpulsado.getText());
    }



}
