package com.example.contextmenuwithspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] names = {
            "Vatsal",
            "Meet",
            "Daksh",
            "Akshat"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter namesAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, names);
        namesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(namesAdapter);
        registerForContextMenu(spinner);
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
        menu.setHeaderTitle("Select the Action");
    }

    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.call) {
            Toast.makeText(getApplicationContext(), "Call", Toast.LENGTH_LONG).show();
        }
        if (item.getItemId() == R.id.sms) {
            Toast.makeText(getApplicationContext(), "SMS", Toast.LENGTH_LONG).show();
        }


        return false;
    }
}