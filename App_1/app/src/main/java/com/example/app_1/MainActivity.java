package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=findViewById(R.id.cuadrito1);
        valor2=findViewById(R.id.cuadrito2);
        resultado=findViewById(R.id.resultado);



    }
    public void sumar(View view){
        int suma= Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
        resultado.setText(suma+"");
    }
    public void restar(View view) {
        int diferencia = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
        resultado.setText(diferencia + "");
    }
    public void multiplicar(View view) {
        int producto = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
        resultado.setText(producto + "");
    }
    public void dividir(View view) {
        int division = Integer.parseInt(valor1.getText().toString()) / Integer.parseInt(valor2.getText().toString());
        resultado.setText(division + "");
    }
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public void calcularFibonacci(View view) {
        int n = Integer.parseInt(valor1.getText().toString());
        int resultadoFibonacci = fibonacci(n);
        resultado.setText(resultadoFibonacci + "");
    }

}