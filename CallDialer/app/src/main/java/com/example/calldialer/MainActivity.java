package com.example.calldialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        Button callButton = (Button) findViewById(R.id.button);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                //Uri u = Uri.parse("tel:" + s);
                //Intent intent = new Intent(Intent.ACTION_DIAL, u);
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + s));
                startActivity(intent);
            }
        });
    }
}