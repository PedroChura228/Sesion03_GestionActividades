package com.pucsm.conversor; // SI CAMBIASTE EL NOMBRE AL CREAR EL PROYECTO, PONLO AQUÍ

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etSoles;
    private TextView tvResultado;
    private Button btnConvertir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular componentes con el XML
        etSoles = findViewById(R.id.etSoles);
        tvResultado = findViewById(R.id.tvResultado);
        btnConvertir = findViewById(R.id.btnConvertir);

        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoSoles = etSoles.getText().toString();

                if (!textoSoles.isEmpty()) {
                    double soles = Double.parseDouble(textoSoles);
                    double tipoCambio = 3.78; // Puedes ajustar el valor actual
                    double dolares = soles / tipoCambio;

                    // Mostrar resultado formateado a 2 decimales
                    tvResultado.setText(String.format("Resultado: $ %.2f USD", dolares));
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingrese un monto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}