package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //4 FUNCIONES BÁSICAS
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    //FUNCIONES ADICIONALES
    private Button btn_cuadrado;
    private Button btn_cubo;
    private Button btn_raiz_cuadrada;
    private Button btn_raiz_cubo;
    private Button btn_clear;
    private Button btn_sin;
    private Button btn_cos;
    private Button btn_tan;


    private TextView txt_respuesta;
    private EditText edit_num_1;
    private EditText edit_num_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_respuesta = findViewById(R.id.respuesta);

        edit_num_1 = findViewById(R.id.num1);
        edit_num_2 = findViewById(R.id.num2);

        btn_suma = findViewById(R.id.button_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(suma( Double.parseDouble(edit_num_1.getText().toString()),Double.parseDouble(edit_num_2.getText().toString()))+"");
            }
        });

        btn_resta = findViewById(R.id.button_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(resta( Double.parseDouble(edit_num_1.getText().toString()),Double.parseDouble(edit_num_2.getText().toString()))+"");
            }
        });

        btn_multiplicacion = findViewById(R.id.button_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(multiplicacion( Double.parseDouble(edit_num_1.getText().toString()),Double.parseDouble(edit_num_2.getText().toString()))+"");
            }
        });

        btn_division = findViewById(R.id.button_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(division( Double.parseDouble(edit_num_1.getText().toString()),Double.parseDouble(edit_num_2.getText().toString()))+"");
            }
        });

        btn_cuadrado = findViewById(R.id.button_cuadrado);
        btn_cuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(cuadrado(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_cubo = findViewById(R.id.button_cubo);
        btn_cubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(cubo(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_raiz_cuadrada = findViewById(R.id.button_raiz_cuadrada);
        btn_raiz_cuadrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(raiz_cuadrada(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_raiz_cubo = findViewById(R.id.button_raiz_cubo);
        btn_raiz_cubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(raiz_cubo(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_sin = findViewById(R.id.button_sin);
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(seno(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_cos = findViewById(R.id.button_cos);
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(coseno(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_tan = findViewById(R.id.button_tan);
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_respuesta.setText(tangente(Double.parseDouble(edit_num_1.getText().toString()))+"");
            }
        });

        btn_clear = findViewById(R.id.button_clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_num_1.setText("0");
                edit_num_2.setText("0");
                txt_respuesta.setText("respuesta");
            }
        });
    }

    public double suma (double a, double b){
        return a+b;
    }

    public double resta (double a, double b){
        return a-b;
    }

    public double multiplicacion (double a, double b){
        return a*b;
    }

    public double division (double a, double b){
        double respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }
        return respuesta;
    }

    public double cuadrado (double a){
        return a*a;
    }

    public double cubo (double a){
        return (a*a)*a;
    }

    public double raiz_cuadrada (double a){
        return Math.sqrt(a);
    }

    public double raiz_cubo (double a){
        return Math.cbrt(a);
    }

    public double seno (double a){
        return Math.sin(a);
    }

    public double coseno (double a){
        return Math.cos(a);
    }

    public double tangente (double a){
        return Math.tan(a);
    }
}