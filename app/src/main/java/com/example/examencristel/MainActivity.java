package com.example.examencristel;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText etprimer, etsegundo;
    private Button btnCalcular;
    private TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etprimer = findViewById(R.id.etprimer);
        etsegundo = findViewById(R.id.etsegundo);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }



    private void calcularPromedio() {
        try {
            double primero = Double.parseDouble(etprimer.getText().toString());
            double segundo = Double.parseDouble(etsegundo.getText().toString());
            //Calcula
            double promedio = (primero + segundo) / 2;
            tvResultado.setText("Promedio: " + promedio);
        } catch (NumberFormatException e) {

        }
    }
}

