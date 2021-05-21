package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button euro = (Button)findViewById(R.id.euro);
        Button dolar = (Button)findViewById(R.id.dolar);
        Button pesos = (Button)findViewById(R.id.pesos);

        euro.setOnClickListener(this);
        dolar.setOnClickListener(this);
        pesos.setOnClickListener(this);


    }
    final ImageView imagen = (ImageView) findViewById(R.id.imagen);
    final TextView resultado = (TextView) findViewById(R.id.resultado);
    final EditText cantidad = (EditText) findViewById(R.id.cantidad);

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.euro:
                try {
                    int eu = Integer.parseInt(cantidad.getText().toString());
                    resultado.setText(""+eu/845.03);

                }catch (NumberFormatException ex){
                    resultado.setText("Error, inserte un numero");
                }
                break;
            case R.id.dolar:
                try {
                    int dolar = Integer.parseInt(cantidad.getText().toString());
                    resultado.setText(""+dolar/710.60);

                }catch (NumberFormatException ex){
                    resultado.setText("Error, inserte un numero");
                }
                break;
            case R.id.pesos:
                try {
                    int pesos = Integer.parseInt(cantidad.getText().toString());
                    resultado.setText(""+pesos*0.13);

                }catch (NumberFormatException ex){
                    resultado.setText("Error, inserte un numero");
                }
                break;

        }

    }
}