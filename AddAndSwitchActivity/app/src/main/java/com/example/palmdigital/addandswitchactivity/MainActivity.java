package com.example.palmdigital.addandswitchactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonSwitch= (Button)findViewById(R.id.button_switch);
        buttonSwitch.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        Intent i = new Intent(this, WakeUp.class);
        startActivity(i);
    }
}
