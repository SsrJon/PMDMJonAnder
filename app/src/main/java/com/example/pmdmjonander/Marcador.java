package com.example.pmdmjonander;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Marcador extends AppCompatActivity {

    private Button btnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcador);

        btnAtras=findViewById(R.id.buttonAtrasMarcador);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Marcador.this, Mapa.class);
                String marcador  = getIntent().getStringExtra("marcadorM");
                intent.putExtra("marcador", marcador );
                String longitud  = getIntent().getStringExtra("longitudM");
                intent.putExtra("longitud", longitud );
                String latitud  = getIntent().getStringExtra("latitudM");
                intent.putExtra("latitud", latitud  );
                startActivity(intent);
            }
        });


    }
}
