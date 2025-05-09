package com.example.provapratica;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaDivisao extends AppCompatActivity {
    EditText editTextNum1;
    EditText editTextNum2;
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_divisao);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editTextNum1 = findViewById(R.id.editTextNum1D);
        editTextNum2 = findViewById(R.id.editTextNum2D);
        textViewResult = findViewById(R.id.textViewResultD);
    }

    public void calcular(View v){
        String sNum1 = editTextNum1.getText().toString();
        String sNum2 = editTextNum2.getText().toString();
        float num1 = Float.parseFloat(sNum1);
        float num2 = Float.parseFloat(sNum2);
        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= num2; i++) {
            float mult = num1 / i;
            resultado
                    .append(num1)
                    .append(" / ")
                    .append(i)
                    .append(" = ")
                    .append(String.format("%.2f", mult))
                    .append("\n");
        }
        textViewResult.setText(resultado.toString());

    }

    trocarTelas trocar = new trocarTelas(this);
    public void TelaMultiplicacao(View v){
        trocar.abrirTelaMultiplicacao();
    }

    public void TelaSubtracao(View v){
        trocar.abrirTelaSubtracao();
    }
    public void TelaAdicao(View v) {
        trocar.abrirTelaAdicao();
    }
    public void TelaHome(View v) {
        trocar.abrirHome();
    }
}