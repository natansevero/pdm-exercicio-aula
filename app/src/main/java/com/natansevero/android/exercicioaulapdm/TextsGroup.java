package com.natansevero.android.exercicioaulapdm;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by natan on 13/06/17.
 */
public class TextsGroup extends LinearLayout {
    private TextView titulo;
    private TextView desc;

    public TextsGroup(Context context, String tituloTexto, String descTexto) {
        super(context);

        // Setando Orientação
        setOrientation(LinearLayout.VERTICAL);

        // Setanto tamando do LinearLayout
        LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(lp);

        // Configuração da view
        titulo = new TextView(context);
        titulo.setText(tituloTexto);
        titulo.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        addView(titulo);

        // Configuração da view
        desc = new TextView(context);
        desc.setText(descTexto);
        desc.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        addView(desc);

    }
}
