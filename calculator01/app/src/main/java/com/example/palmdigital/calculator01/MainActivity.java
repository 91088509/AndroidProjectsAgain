package com.example.palmdigital.calculator01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.text1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView button1 = (ImageView) findViewById(R.id.one);
        ImageView button2 = (ImageView) findViewById(R.id.two);
        ImageView button3 = (ImageView) findViewById(R.id.three);
        ImageView button4 = (ImageView) findViewById(R.id.four);
        ImageView button5 = (ImageView) findViewById(R.id.five);
        ImageView button6 = (ImageView) findViewById(R.id.six);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        TextView text1 = (TextView) findViewById(R.id.numberInput1);
        TextView text2 = (TextView) findViewById(R.id.numberInput2);
        TextView text3 = (TextView) findViewById(R.id.numberInput3);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.one) {
            Log.i("attencion", "button1 works");


        }else if (view.getId() == R.id.one) {
            Log.i("attencion", "button2 works");
        }

    }
}
