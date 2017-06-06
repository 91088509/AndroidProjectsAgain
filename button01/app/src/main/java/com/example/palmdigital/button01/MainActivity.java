package com.example.palmdigital.button01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setText("Button 1");

        buttonObject1.setOnClickListener(this);
    }//end

    public void onClick(View view)
    {
        Toast.makeText(MainActivity.this, "4 * 4 = 12", Toast.LENGTH_SHORT).show();
    }
}
