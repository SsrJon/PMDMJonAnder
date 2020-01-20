package com.example.pmdmjonander;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMapa=findViewById(R.id.buttonAñadir);




        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mapa = new Intent(MainActivity.this, Mapa.class);
                startActivity(mapa);

            }
        });


    }
}
