package com.example.palmdigital.consolelog2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//fields - class lvl variables
    private int myInt;
    private double myDouble;
    private String myString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = " + myInt);
    }
    public int setIntValue()
    {
        return 10;
    }
}
