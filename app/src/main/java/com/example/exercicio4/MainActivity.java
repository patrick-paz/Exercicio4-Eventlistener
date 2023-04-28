package com.example.exercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

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

        btnEnviar.setOnClickListener(this);
        skbTamanho.setOnSeekBarChangeListener(this);



        chkMaiuscula.setOnCheckedChangeListener(this);
        chkItalico.setOnCheckedChangeListener(this);
        chkNegrito.setOnCheckedChangeListener(this);

        rdgCor.setOnCheckedChangeListener(this);



    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        String c = Integer.toString(progress);
        txtTamanho.setText(progress + "sp");
        txtTexto.setTextSize(progress);
;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {

        txtTexto.setText(edtTexto.getText());

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(chkNegrito.isChecked() && chkItalico.isChecked()) {
            txtTexto.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        }else if(chkNegrito.isChecked()) {
            txtTexto.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        }else if(chkItalico.isChecked()){
            txtTexto.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        }else{
            txtTexto.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        }

        if(chkMaiuscula.isChecked()){
            txtTexto.setAllCaps(true);
        } else{
            txtTexto.setAllCaps(false);
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(rdbAzul.isChecked()){
            txtTexto.setTextColor(rdbAzul.getTextColors());
        } else if(rdbVermelho.isChecked()){
            txtTexto.setTextColor(rdbVermelho.getTextColors());
        } else if(rdbVerde.isChecked()){
            txtTexto.setTextColor(rdbVerde.getTextColors());
        } else {

        }
    }
}