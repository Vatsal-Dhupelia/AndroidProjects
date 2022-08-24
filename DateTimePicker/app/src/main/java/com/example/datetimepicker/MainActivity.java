package com.example.datetimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView) findViewById(R.id.textView);
        DatePicker datePicker = (DatePicker) findViewById(R.id.calendarView);
        TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
        Button submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder string = new StringBuilder();
                string.append("Date : ");
                string.append(datePicker.getDayOfMonth() + "/");
                string.append((datePicker.getMonth() + 1) + "/");
                string.append(datePicker.getYear() + "\n");
                string.append("Time : ");
                string.append(timePicker.getCurrentHour() + " : ");
                string.append(timePicker.getCurrentMinute());
                textView1.setText(string);
            }
        });
    }
}