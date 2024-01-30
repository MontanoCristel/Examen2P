package com.example.examencristel;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText etparcial1, etparcial2;
    private Button btnCalcular;
    private TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etparcial1 = findViewById(R.id.etparcial1);
        etparcial2 = findViewById(R.id.etparcial2);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedio();
            }
        });
    }

    
    private Void calcularPromedio(){
        try {
            double parcial1 = Double.parseDouble(etparcial1.getText().toString());
            double parcial2 = Double.parseDouble(etparcial2.getText().toString());

            double promedio = (parcial1 + parcial2) / 2;

            tvResultado.setText(" " + promedio);
        }  catch ( NumberFormatException e ) {
            tvResultado.setText("Ingrese números válidos");
        }
    }
}

