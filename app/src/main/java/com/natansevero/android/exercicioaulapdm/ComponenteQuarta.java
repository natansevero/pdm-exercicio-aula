package com.natansevero.android.exercicioaulapdm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by natan on 13/06/17.
 */
public class ComponenteQuarta extends LinearLayout {

    private EditText campoTexto;
    private Button botao;

    public ComponenteQuarta(final Context context) {
        super(context);

        setOrientation(LinearLayout.VERTICAL);

        setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        campoTexto = new EditText(context);
        campoTexto.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        addView(campoTexto);

        botao = new Button(context);
        botao.setText("Mostrar Texto");
        botao.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        addView(botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conteudoCampo = campoTexto.getText().toString();

                Toast.makeText(context, conteudoCampo, Toast.LENGTH_SHORT).show();
            }
        });
    }



}
