package com.example.palmdigital.toast03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "And a long toast.", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Another Toast.", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Toast.", Toast.LENGTH_LONG).show();


    }
}
