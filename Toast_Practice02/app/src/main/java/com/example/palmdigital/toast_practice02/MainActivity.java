package com.example.palmdigital.toast_practice02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "My name is Slim Shady.", Toast.LENGTH_LONG).show();
        Toast.makeText(this, "My favorite animal is an pug.", Toast.LENGTH_LONG).show();
    }
}
