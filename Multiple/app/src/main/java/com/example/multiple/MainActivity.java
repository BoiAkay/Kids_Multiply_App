package com.example.multiple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                changeTable(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void changeTable(int i)
    {
        ArrayList<String> table = new ArrayList<>();
        for (int j=1;j<=10;j++)
        {
            String str = Integer.toString(i)+" X "+Integer.toString(j)+" = "+Integer.toString(i*j);
            table.add(str);
        }

        ListView myListView = findViewById(R.id.myListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,table);
        myListView.setAdapter(arrayAdapter);
        String text = "Table of "+Integer.toString(i);
        Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();
    }

}