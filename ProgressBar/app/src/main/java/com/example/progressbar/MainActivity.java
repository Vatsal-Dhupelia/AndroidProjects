package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText editText2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText editText3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        EditText editText4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        EditText editText5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        EditText editText6 = (EditText) findViewById(R.id.editTextTextPersonName6);
        EditText editText7 = (EditText) findViewById(R.id.editTextTextPersonName7);
        EditText editText8 = (EditText) findViewById(R.id.editTextTextPersonName8);
        Button submit = (Button) findViewById(R.id.button);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = 0;
                if(editText1.getText().length() != 0)
                {
                    result++;
                }
                if(editText2.getText().length() != 0)
                {
                    result++;
                }
                if(editText3.getText().length() != 0)
                {
                    result++;
                }
                if(editText4.getText().length() != 0)
                {
                    result++;
                }
                if(editText5.getText().length() != 0)
                {
                    result++;
                }
                if(editText6.getText().length() != 0)
                {
                    result++;
                }
                if(editText7.getText().length() != 0)
                {
                    result++;
                }
                if(editText8.getText().length() != 0)
                {
                    result++;
                }
                int finalResult = (100/8)*result;
                progressBar.setProgress(finalResult);
            }
        });
    }
}