package com.example.kayedcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    float val1, val2;
    boolean isAdd, isSub, isDiv, isMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAdd = (Button) findViewById(R.id.button23);
        Button buttonSub = (Button) findViewById(R.id.button28);
        Button buttonMul = (Button) findViewById(R.id.button24);
        Button buttonDiv = (Button) findViewById(R.id.button27);
        Button buttonEqual = (Button) findViewById(R.id.button29);
        Button num0 = (Button) findViewById(R.id.button20);
        Button num1 = (Button) findViewById(R.id.button7);
        Button num2 = (Button) findViewById(R.id.button22);
        Button num3 = (Button) findViewById(R.id.button3);
        Button num4 = (Button) findViewById(R.id.button4);
        Button num5 = (Button) findViewById(R.id.button6);
        Button num6 = (Button) findViewById(R.id.button5);
        Button num7 = (Button) findViewById(R.id.button14);
        Button num8 = (Button) findViewById(R.id.button18);
        Button num9 = (Button) findViewById(R.id.button17);
        Button numC = (Button) findViewById(R.id.button19);
        Button numP = (Button) findViewById(R.id.button15);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        numP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        numC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText("");
                } else {
                    val1 = Float.parseFloat(editText.getText() + "");
                    isAdd = true;
                    editText.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                isSub = true;
                editText.setText(null);
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                isMul = true;
                editText.setText(null);
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                isDiv = true;
                editText.setText(null);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(editText.getText() + "");
                if (isAdd == true) {
                    editText.setText(val1 + val2 + "");
                    isAdd = false;
                }
                if (isSub == true) {
                    editText.setText(val1 - val2 + "");
                    isSub = false;
                }
                if (isMul == true) {
                    editText.setText(val1 * val2 + "");
                    isMul = false;
                }
                if (isDiv == true) {
                    editText.setText(val1 / val2 + "");
                    isDiv = false;
                }
            }
        });
    }
}