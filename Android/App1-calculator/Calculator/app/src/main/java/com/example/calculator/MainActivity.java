package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPlus(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber + secondNumber;
            calculate.setText(String.valueOf(result));
    }

    public void onClickMinus(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber - secondNumber;
        calculate.setText(String.valueOf(result));
    }
    public void onClickMnoz(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber * secondNumber;
        calculate.setText(String.valueOf(result));
    }
    public void onClickDziel(View view){
        TextView calculate =(TextView) findViewById(R.id.result);
        Spinner spinner1 = findViewById(R.id.spinner);
        Spinner spinner2 = findViewById(R.id.spinner2);

        int firstNumber = Integer.parseInt(spinner1.getSelectedItem().toString());
        int secondNumber = Integer.parseInt(spinner2.getSelectedItem().toString());
        int result = firstNumber / secondNumber;
        calculate.setText(String.valueOf(result));
    }
}
