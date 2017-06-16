package com.natansevero.android.exercicioaulapdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // Exercicio 3
        //setContentView(new BoxComp(this));

        // Exemplo 4
        setContentView(new ComponenteQuarta(this));
    }
}
