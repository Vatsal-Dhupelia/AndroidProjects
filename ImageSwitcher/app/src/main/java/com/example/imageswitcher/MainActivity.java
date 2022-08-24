package com.example.imageswitcher;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageSwitcher imageSwitcher;
    Button next;

    int image[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five};
    int count = image.length;
    int index = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        next = (Button) findViewById(R.id.button2);
        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {

                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
                return imageView;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                index++;
                if (index == count)
                    index = 0;
                imageSwitcher.setImageResource(image[index]);
            }
        });

    }

}