package com.example.palmdigital.simplecalcv4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textDisplay1;
    TextView textDisplay2;
    TextView textDisplay3;
    String number1 = "";
    String number2 = "";
    String Operator = "add";
    Integer result;
    ImageView plus;
    ImageView minus;
    ImageView multiply;
    ImageView divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declare first buttons
        ImageView zeroButton1 = (ImageView) findViewById(R.id.zeroButton1);
        ImageView oneButton1 = (ImageView) findViewById(R.id.oneButton1);
        ImageView twoButton1 = (ImageView) findViewById(R.id.twoButton1);
        ImageView threeButton1 = (ImageView) findViewById(R.id.threeButton1);
        ImageView fourButton1 = (ImageView) findViewById(R.id.fourButton1);
        ImageView fiveButton1 = (ImageView) findViewById(R.id.fiveButton1);
        ImageView sixButton1 = (ImageView) findViewById(R.id.sixButton1);
        ImageView sevenButton1 = (ImageView) findViewById(R.id.sevenButton1);
        ImageView eightButton1 = (ImageView) findViewById(R.id.eightButton1);
        ImageView nineButton1 = (ImageView) findViewById(R.id.nineButton1);
        //set button click listeners
        zeroButton1.setOnClickListener(this);
        oneButton1.setOnClickListener(this);
        twoButton1.setOnClickListener(this);
        threeButton1.setOnClickListener(this);
        fourButton1.setOnClickListener(this);
        fiveButton1.setOnClickListener(this);
        sixButton1.setOnClickListener(this);
        sevenButton1.setOnClickListener(this);
        eightButton1.setOnClickListener(this);
        nineButton1.setOnClickListener(this);
        //declare second buttons
        ImageView zeroButton2 = (ImageView) findViewById(R.id.zeroButton2);
        ImageView oneButton2 = (ImageView) findViewById(R.id.oneButton2);
        ImageView twoButton2 = (ImageView) findViewById(R.id.twoButton2);
        ImageView threeButton2 = (ImageView) findViewById(R.id.threeButton2);
        ImageView fourButton2 = (ImageView) findViewById(R.id.fourButton2);
        ImageView fiveButton2 = (ImageView) findViewById(R.id.fiveButton2);
        ImageView sixButton2 = (ImageView) findViewById(R.id.sixButton2);
        ImageView sevenButton2 = (ImageView) findViewById(R.id.sevenButton2);
        ImageView eightButton2 = (ImageView) findViewById(R.id.eightButton2);
        ImageView nineButton2 = (ImageView) findViewById(R.id.nineButton2);
        //set button click listeners
        zeroButton2.setOnClickListener(this);
        oneButton2.setOnClickListener(this);
        twoButton2.setOnClickListener(this);
        threeButton2.setOnClickListener(this);
        fourButton2.setOnClickListener(this);
        fiveButton2.setOnClickListener(this);
        sixButton2.setOnClickListener(this);
        sevenButton2.setOnClickListener(this);
        eightButton2.setOnClickListener(this);
        nineButton2.setOnClickListener(this);
        ImageView equals = (ImageView) findViewById(R.id.equal);
        equals.setOnClickListener(this);
        ImageView clear = (ImageView) findViewById(R.id.clear);
        clear.setOnClickListener(this);
         plus = (ImageView) findViewById(R.id.plus);
        plus.setOnClickListener(this);
         minus = (ImageView) findViewById(R.id.minus);
        minus.setOnClickListener(this);
         multiply = (ImageView) findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
         divide = (ImageView) findViewById(R.id.divide);
        divide.setOnClickListener(this);
        //ImageView equalButton = (ImageView) findViewById(R.id.nineButton1);
        textDisplay1 = (TextView) findViewById(R.id.textDisplay1);
        textDisplay2 = (TextView) findViewById(R.id.textDisplay2);
        textDisplay3 = (TextView) findViewById(R.id.textDisplay3);


    }

    public void onClick(View view) {


            if (view.getId() == R.id.zeroButton1) {
if (number1 != "") {
    number1 = number1 + "0";
    textDisplay1.setText(number1 + "");
}
            }
        if (view.getId() == R.id.oneButton1) {
            number1 = number1 + "1";
            textDisplay1.setText(number1 + "");
            }
        if (view.getId() == R.id.twoButton1) {
            number1 = number1 + "2";
            textDisplay1.setText(number1 + "");
            }
        if (view.getId() == R.id.threeButton1) {
            number1 = number1 + "3";
            textDisplay1.setText(number1 + "");
        }
        if (view.getId() == R.id.fourButton1) {
            number1 = number1 + "4";
            textDisplay1.setText(number1 + "");
        }
        if (view.getId() == R.id.fiveButton1) {
            number1 = number1 + "5";
            textDisplay1.setText(number1 + "");
        }
        if (view.getId() == R.id.sixButton1) {
            number1 = number1 + "6";
            textDisplay1.setText(number1 + "");
        }
        if (view.getId() == R.id.sevenButton1) {
            number1 = number1 + "7";
            textDisplay1.setText(number1 + "");
        }
        if (view.getId() == R.id.eightButton1) {
            number1 = number1 + "8";
            textDisplay1.setText(number1 + "");
        }
        if (view.getId() == R.id.nineButton1) {
            number1 = number1 + "9";
            textDisplay1.setText(number1 + "");
        }
        if (number1 != "") {
            if (view.getId() == R.id.zeroButton2) {
                number2 = number2 + "0";
                textDisplay2.setText(number2 + "");
            }
        }
        if (view.getId() == R.id.oneButton2) {
            number2 = number2 + "1";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.twoButton2) {
            number2 = number2 + "2";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.threeButton2) {
            number2 = number2 + "3";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.fourButton2) {
            number2 = number2 + "4";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.fiveButton2) {
            number2 = number2 + "5";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.sixButton2) {
            number2 = number2 + "6";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.sevenButton2) {
            number2 = number2 + "7";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.eightButton2) {
            number2 = number2 + "8";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.nineButton2) {
            number2 = number2 + "9";
            textDisplay2.setText(number2 + "");
        }
        if (view.getId() == R.id.equal) {
            int parse1 = Integer.parseInt(number1);
            int parse2 = Integer.parseInt(number2);
            if (Operator == "add") {
                result = parse1 + parse2;
                textDisplay3.setText(result + "");
                Log.i("info", result + "");
            }
            if (Operator == "subtract") {
                result = parse1 - parse2;
                textDisplay3.setText(result + "");
                Log.i("info", result + "");
            }
            if (Operator == "multiply") {
                result = parse1 * parse2;
                textDisplay3.setText(result + "");
                Log.i("info", result + "");
            }
            if (Operator == "divide") {
                result = parse1 / parse2;
                textDisplay3.setText(result + "");
                Log.i("info", result + "");
            }
                                        }
        if (view.getId() == R.id.clear) {
            textDisplay1.setText("");
            textDisplay2.setText("");
            textDisplay3.setText("");
            number1 = "";
            number2 = "";
        }
        if (view.getId() == R.id.plus) {
            Operator = "add";
            plus.setBackgroundColor(0xff00ff00);
            minus.setBackgroundColor(0);
            multiply.setBackgroundColor(0);
            divide.setBackgroundColor(0);
        }
        if (view.getId() == R.id.minus) {
            Operator = "subtract";
            plus.setBackgroundColor(0);
            minus.setBackgroundColor(0xff00ff00);
            multiply.setBackgroundColor(0);
            divide.setBackgroundColor(0);
        }
        if (view.getId() == R.id.multiply) {
            Operator = "multiply";
            plus.setBackgroundColor(0);
            minus.setBackgroundColor(0);
            multiply.setBackgroundColor(0xff00ff00);
            divide.setBackgroundColor(0);
        }
        if (view.getId() == R.id.divide) {
            Operator = "divide";
            plus.setBackgroundColor(0);
            minus.setBackgroundColor(0);
            multiply.setBackgroundColor(0);
            divide.setBackgroundColor(0xff00ff00);
        }
        }
}
