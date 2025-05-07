package com.example.provapratica;

import android.content.Context;
import android.content.Intent;

public class trocarTelas {

    private final Context context;

    public trocarTelas(Context context) {
        this.context = context;
    }

    public void abrirTelaMultiplicacao() {
        Intent in = new Intent(context, TelaMultiplicacao.class);
        context.startActivity(in);
    }

    public void abrirTelaAdicao() {
        Intent in = new Intent(context, TelaAdicao.class);
        context.startActivity(in);
    }

    public void abrirTelaSubtracao() {
        Intent in = new Intent(context, TelaSubtracao.class);
        context.startActivity(in);
    }

    public void abrirTelaDivisao() {
        Intent in = new Intent(context, TelaDivisao.class);
        context.startActivity(in);
    }

    public void abrirHome(){
        Intent in = new Intent(context, MainActivity.class);
        context.startActivity(in);
    }
}
