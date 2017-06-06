package com.example.palmdigital.toast_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "We need to take the Bikini Bottom and push it somewhere else", Toast.LENGTH_LONG).show();
    }
}
