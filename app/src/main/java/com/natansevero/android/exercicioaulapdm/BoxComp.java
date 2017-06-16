package com.natansevero.android.exercicioaulapdm;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by natan on 13/06/17.
 */
public class BoxComp extends LinearLayout {

    private ImageView img;
    private LinearLayout textGroup;

    public BoxComp(Context context) {
        super(context);

        // Setando Orientação
        setOrientation(LinearLayout.HORIZONTAL);

        // Setanto tamando do LinearLayout
        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(lp);

        // Adicionar elemento necessários
        img = new ImageView(context);
        img.setImageResource(R.drawable.cachorro);
        LayoutParams paramsImg = new LayoutParams(120, 100);
        img.setLayoutParams(paramsImg);
        addView(img);
        addView(textGroup = new TextsGroup(context, "Titulo é esse", "Descrição opa"));

    }

}
