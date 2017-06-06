package com.example.palmdigital.button03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button) findViewById(R.id.buttonMyButton1);
        buttonObject1.setOnClickListener(this);
        buttonObject1.setText("The ASSULE Pill");
        Button buttonObject2 = (Button) findViewById(R.id.buttonMyButton2);
        buttonObject2.setOnClickListener(this);
        buttonObject2.setText("The ROHOE Pill");

    }

    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton1) {
            Toast.makeText(this, "YOU TOOK THE ROHOE PILL", Toast.LENGTH_SHORT).show();
            Log.i("ATTENCION", "ASSULE Pill");
        }
        else
        {
            Toast.makeText(this, "YOU TOOK THE ASSULE PILL", Toast.LENGTH_SHORT).show();
            Log.i("ATTENCION", "ROHOE Pill");

        }
    }
}
