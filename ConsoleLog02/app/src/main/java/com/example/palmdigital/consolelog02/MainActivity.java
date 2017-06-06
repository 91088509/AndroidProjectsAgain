package com.example.palmdigital.consolelog02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
private int myInt;
    private double myDouble;
    private String myString;
private boolean myBoolean;
    private float myFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt - " + myInt);
        double myDouble = setDoubleValue();
        Log.i("info", "myDouble " + myDouble);
        boolean myBoolean = setBooleanValue();
        Log.i("info", "myBoolean " + myBoolean);
        float myFloat = setFloatValue();
        Log.i("info", "myFloat " + myFloat);
//      declare a float variable called myFloat
//      set its value with a function you write setFloatValue
//      have your function return the sum of two floats(4.5 + 2.3)
//      log myFloat out to Android Monitor logcat

    }
    public float setFloatValue()
    {
        return(4.5f + 2.3f);
    }
    public double setDoubleValue()
    {
        return 10.987;
    }
    public int setIntValue()
    {
        return 10;
    }
    public boolean setBooleanValue()
    {
        return true;
    }
}
