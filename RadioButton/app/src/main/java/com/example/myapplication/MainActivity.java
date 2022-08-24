package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton radioGuj = (RadioButton) findViewById(R.id.radioButton7);
        RadioButton radioHin = (RadioButton) findViewById(R.id.radioButton8);
        RadioButton radioEng = (RadioButton) findViewById(R.id.radioButton9);
        Button submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                int id = radiogroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(id);
                result.append("Gender : " + radioButton.getText());
                result.append("\nLanguages Known : ");
                if(radioGuj.isChecked())
                {
                    result.append("\t" + radioGuj.getText());
                }
                if(radioHin.isChecked())
                {
                    result.append("\t" + radioHin.getText());
                }
                if(radioEng.isChecked())
                {
                    result.append("\t" + radioEng.getText());
                }
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}