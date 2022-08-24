package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        Button submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Items : ");
                if(checkBox1.isChecked())
                {
                    result.append("\n Pizza : 200/-Rs");
                    amount += 200;
                }
                if (checkBox2.isChecked())
                {
                    result.append("\n Burger : 100/-Rs");
                    amount += 100;
                }
                if (checkBox3.isChecked())
                {
                    result.append("\n Coffee : 50/-Rs");
                    amount += 50;
                }
                if (checkBox4.isChecked())
                {
                    result.append("\n Sandwich : 50/-Rs");
                    amount += 50;
                }
                result.append("\n Total : " + amount);
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}