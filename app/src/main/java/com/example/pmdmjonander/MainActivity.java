package com.example.pmdmjonander;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAñadir;
    private EditText etMarcador, etLongitud, etLatitud;
    private String marcador, longitud, latitud;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAñadir=findViewById(R.id.buttonAñadir);
        etMarcador=findViewById(R.id.editTextMarcador);
        etLongitud=findViewById(R.id.editTextLongitud);
        etLatitud=findViewById(R.id.editTextLatitud);




        btnAñadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (etMarcador.getText().toString().equals("") ||etLongitud.getText().toString().equals("")|| etLatitud.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, R.string.vacio, Toast.LENGTH_SHORT).show();
                } else{
                    Intent mapa = new Intent(MainActivity.this, Mapa.class);


                    System.out.println(etMarcador.getText().toString());
                    System.out.println(etLongitud.getText().toString());
                    System.out.println(etLatitud.getText().toString());

                    marcador  = etMarcador.getText().toString();
                    mapa.putExtra("marcador", marcador );
                    longitud  = etLongitud.getText().toString();
                    mapa.putExtra("longitud", longitud );
                    latitud  = etLatitud.getText().toString();
                    mapa.putExtra("latitud", latitud  );



                    startActivity(mapa);
                }


            }
        });


    }
}
