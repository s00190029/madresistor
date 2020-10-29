package edu.rdonoghue.resistor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link
        hello = findViewById(R.id.tv_hello);

        resistorColor red = new resistorColor();
        red.band1 = 2;

        hello.setText( String.valueOf(red.band1));




    }


}
