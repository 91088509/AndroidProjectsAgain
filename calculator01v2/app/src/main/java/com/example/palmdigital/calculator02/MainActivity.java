package com.example.palmdigital.calculator02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textDisplay1;
    TextView textDisplay2;
    TextView textDisplay3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView buttonInput1 = (ImageView) findViewById(R.id.button1);
        buttonInput1.setOnClickListener(this);
        ImageView buttonInput2 = (ImageView) findViewById(R.id.button2);
        buttonInput2.setOnClickListener(this);
        ImageView buttonInput3 = (ImageView) findViewById(R.id.button3);
        buttonInput3.setOnClickListener(this);
        ImageView buttonInput4 = (ImageView) findViewById(R.id.button4);
        buttonInput4.setOnClickListener(this);
        ImageView buttonInput5 = (ImageView) findViewById(R.id.button5);
        buttonInput5.setOnClickListener(this);
        ImageView buttonInput6 = (ImageView) findViewById(R.id.button6);
        buttonInput6.setOnClickListener(this);
        ImageView add = (ImageView) findViewById(R.id.equal);
        add.setOnClickListener(this);
        textDisplay1 = (TextView) findViewById(R.id.textDisplay1);
        textDisplay2 = (TextView) findViewById(R.id.textDisplay2);
        textDisplay3 = (TextView) findViewById(R.id.textDisplay3);
    }
    Integer number1 = 0;
    Integer number2 = 0;
    String sum = "";
    public void onClick(View view){
        if (view.getId() == R.id.button1){
            Log.i("info", "You pressed button1");
            textDisplay1.setText("1");
            number1 = 1;
        }
        if (view.getId() == R.id.button2){
            Log.i("info", "You pressed button2");
            textDisplay1.setText("2");
            number1 = 2;
        }
        if (view.getId() == R.id.button3){
            Log.i("info", "You pressed button3");
            textDisplay1.setText("3");
            number1 = 3;
        }
        if (view.getId() == R.id.button4){
            Log.i("info", "You pressed button4");
            textDisplay2.setText("4");
            number2 = 4;
        }
        if (view.getId() == R.id.button5){
            Log.i("info", "You pressed button5");
            textDisplay2.setText("5");
            number2 = 5;
        }
        if (view.getId() == R.id.button6){
            Log.i("info", "You pressed button6");
            textDisplay2.setText("6");
            number2 = 6;
        }
        if (view.getId() == R.id.equal){
            Log.i("info", "You added");
            sum = number1 + number2 + "";
            textDisplay3.setText(sum);

        }
    }
}
