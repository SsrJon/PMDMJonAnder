package com.example.pmdmjonander;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMapa, btnMarcador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMapa=findViewById(R.id.buttonMapa);
        btnMarcador=findViewById(R.id.buttonMarcador);



        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mapa = new Intent(MainActivity.this, Mapa.class);
                startActivity(mapa);

            }
        });


        btnMarcador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent marcador = new Intent(MainActivity.this, Marcador.class);
                startActivity(marcador);
            }
        });

    }
}
