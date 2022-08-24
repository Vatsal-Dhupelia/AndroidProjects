package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    int image[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        String value = getIntent().getStringExtra("index");
        int a = Integer.parseInt(value);
        int b = a + 1;

        imageView.setImageResource(image[b]);
    }
}