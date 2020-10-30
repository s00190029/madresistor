package edu.rdonoghue.resistor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hello;

    public double calcOhms(resistorColor col1In, resistorColor col2In, resistorColor col3In){
        String twoBands = String.valueOf(col1In.band)+String.valueOf(col2In.band);
        double twoBandsNum = Double.parseDouble(twoBands);
        double calcMulti = twoBandsNum * col3In.multiplier;
        return calcMulti;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // link
        hello = findViewById(R.id.tv_hello);


        //Colors
        // BLACK
        resistorColor black = new resistorColor();
        black.band = 0;
        black.multiplier = 1;
        black.tolerance = 0.00f;
        black.color = Color.BLACK;
        // BROWN
        resistorColor brown = new resistorColor();
        brown.band = 1;
        brown.multiplier = 10;
        brown.tolerance = 0.01f;
        brown.color = Color.rgb(165,42,42);
        // RED
        resistorColor red = new resistorColor();
        red.band = 2;
        red.multiplier = 100.0;
        red.tolerance = 0.01f;
        red.color = Color.RED;
        // ORANGE
        resistorColor orange = new resistorColor();
        orange.band = 3;
        orange.multiplier = 1000;
        orange.tolerance = 0.00f;
        orange.color = Color.rgb(255,165,0);
        // YELLOW
        resistorColor yellow = new resistorColor();
        yellow.band = 4;
        yellow.multiplier = 10000;
        yellow.tolerance = 0.00f;
        yellow.color = Color.YELLOW;
        // GREEN
        resistorColor green = new resistorColor();
        green.band = 5;
        green.multiplier = 100000;
        green.tolerance = 0.005f;
        green.color = Color.GREEN;
        // BLUE
        resistorColor blue = new resistorColor();
        blue.band = 6;
        blue.multiplier = 1000000;
        blue.tolerance = 0.0025f;
        blue.color = Color.BLUE;
        // VIOLET
        resistorColor violet = new resistorColor();
        violet.band = 7;
        violet.multiplier = 10000000;
        violet.tolerance = 0.001f;
        violet.color = Color.rgb(238,130,238);
        // GRAY
        resistorColor gray = new resistorColor();
        gray.band = 8;
        gray.multiplier = 100000000;
        gray.tolerance = 0.005f;
        gray.color = Color.GRAY;
        // WHITE
        resistorColor white = new resistorColor();
        white.band = 9;
        white.multiplier = 1000000000;
        white.tolerance = 0.00f;
        white.color = Color.WHITE;
        // GOLD
        resistorColor gold = new resistorColor();
        gold.band = 0;
        gold.multiplier = 0.1;
        gold.tolerance = 0.05f;
        gold.color = Color.rgb(255,215,0);
        // SILVER
        resistorColor silver = new resistorColor();
        silver.band = 0;
        silver.multiplier = 0.01;
        silver.tolerance = 0.10f;
        silver.color = Color.rgb(192,192,192);
        // NONE
        resistorColor none = new resistorColor();
        none.band = 3;
        none.multiplier = 0;
        none.tolerance = 0.20f;
        none.color = Color.TRANSPARENT;

        double testOut = calcOhms(red,black,red);

        hello.setText(String.valueOf(testOut));




    }



}
