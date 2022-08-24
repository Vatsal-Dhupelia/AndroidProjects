package com.example.lab1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bSum = (Button) findViewById(R.id.button4);
        Button bSub = (Button) findViewById(R.id.button5);
        Button bMul = (Button) findViewById(R.id.button6);
        Button bDiv = (Button) findViewById(R.id.button7);
        Button bClear = (Button) findViewById(R.id.button8);
        EditText text1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        EditText text2 = findViewById(R.id.editTextNumberDecimal2);

        bSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = text1.getText().toString();
                String val2 = text2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a + b;

                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = text1.getText().toString();
                String val2 = text2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a - b;

                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = text1.getText().toString();
                String val2 = text2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a * b;

                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = text1.getText().toString();
                String val2 = text2.getText().toString();
                int a = Integer.parseInt(val1);
                int b = Integer.parseInt(val2);
                int sum = a / b;

                Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText("");
                text2.setText("");
            }
        });

    }
}