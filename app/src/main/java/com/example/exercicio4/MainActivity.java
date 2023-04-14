package com.example.exercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private Button btnEnviar;
    private TextView txtTexto;
    private EditText edtTexto;
    private SeekBar skbTamanho;
    private TextView txtTamanho;
    private CheckBox chkNegrito;
    private CheckBox chkItalico;
    private CheckBox chkMaiuscula;
    private RadioGroup rdgCor;
    private RadioButton rdbVermelho;
    private RadioButton rdbVerde;
    private RadioButton rdbAzul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);
        txtTexto = findViewById(R.id.txtTexto);
        edtTexto = findViewById(R.id.edtTexto);
        skbTamanho = findViewById(R.id.skbTamanho);
        txtTamanho = findViewById(R.id.txtTamanho);
        chkNegrito = findViewById(R.id.chkNegrito);
        chkItalico = findViewById(R.id.chkItalico);
        chkMaiuscula = findViewById(R.id.chkMaiuscula);
        rdgCor = findViewById(R.id.rdgCor);
        rdbVermelho = findViewById(R.id.rdbVermelho);
        rdbVerde = findViewById(R.id.rdbVerde);
        rdbAzul = findViewById(R.id.rdbAzul);

        skbTamanho.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        String c = Integer.toString(progress);

;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}