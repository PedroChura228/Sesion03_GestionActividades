package com.example.sesion03_gestionactividades;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("CicloVida", "Ejecutando onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CicloVida", "Ejecutando onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicloVida", "Ejecutando onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicloVida", "Ejecutando onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicloVida", "Ejecutando onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicloVida", "Ejecutando onDestroy");
    }
}