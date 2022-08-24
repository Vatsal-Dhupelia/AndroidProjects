package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Circle", Toast.LENGTH_LONG).show();
                draw("Circle");
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Rectangle", Toast.LENGTH_LONG).show();
                draw("Rectangle");
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Line", Toast.LENGTH_LONG).show();
                draw("Line");
                return true;
        }
        return false;
    }

    public void draw(String s)
    {
        Bitmap bg = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        ImageView imageView = (ImageView) findViewById (R.id.imageView);
        BitmapDrawable ob = new BitmapDrawable(getResources(), bg);
        imageView.setBackground(ob);
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(40);
        if(s == "Circle")
        {
            canvas.drawText("Circle", 420, 150, paint);
            canvas.drawCircle(200, 200, 50, paint);
        }
        if(s == "Rectangle")
        {
            canvas.drawText("Rectangle", 420, 150, paint);
            canvas.drawRect(400, 200, 650, 700, paint);
        }
        if(s == "Line")
        {
            canvas.drawText("Line", 420, 150, paint);
            canvas.drawLine(100, 50, 100, 50, paint);
        }
    }
}