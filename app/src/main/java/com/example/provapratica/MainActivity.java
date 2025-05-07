package com.example.provapratica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    trocarTelas trocar = new trocarTelas(this);
    public void TelaMultiplicacao(View v){
        trocar.abrirTelaMultiplicacao();
    }
    public void TelaAdicao(View v){
        trocar.abrirTelaAdicao();
    }
    public void TelaSubtracao(View v){
        trocar.abrirTelaSubtracao();
    }
    public void TelaDivisao(View v) {
        trocar.abrirTelaDivisao();
    }

    public void abrirSite(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri webPage = Uri.parse("https://term.ooo/"); // Substitua pelo URL do site
        intent.setData(webPage);
        startActivity(intent);
    }
}