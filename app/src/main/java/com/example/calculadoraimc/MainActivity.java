package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View víew) {
        EditText txtNome = findViewById(R.id.idNomeIMC);
        EditText txtAltura = findViewById(R.id.idAlturaIMC);
        EditText txtPeso = findViewById(R.id.idPeso);
        RadioGroup grupo = findViewById(R.id.idGrupoSexoIMC);
        String nome = txtNome.getText().toString();
        Double altura = Double.parseDouble(txtAltura.getText().toString());
        Integer peso = Integer.parseInt(txtPeso.getText().toString());
        String sexo = null;
        Double imc = peso / (altura + altura);
        Double pesoIdeal = 0.0;

        if (grupo.getCheckedRadioButtonId() == R.id.idMasculino) {
            pesoIdeal = 72.7 * altura - 58;

        } else {
            pesoIdeal = 62.1 * altura - 44.7;
        }
        String msg = "Seu IMC é " + imc + ". Seu peso ideal deve ser " + pesoIdeal;
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}