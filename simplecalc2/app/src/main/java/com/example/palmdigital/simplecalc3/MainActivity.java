package com.example.palmdigital.simplecalc3;

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
    ImageView buttonInputPlus;
    ImageView buttonInputMinus;
    ImageView buttonInputMultiply;
    ImageView buttonInputDivide;
    ImageView buttonInputMod;
    ImageView buttonInputEqual;
    Integer num1;
    Double myDouble;
    Integer num2;
    Integer sum;
    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView buttonInput0 = (ImageView) findViewById(R.id.zero);
        buttonInput0.setOnClickListener(this);
        ImageView buttonInput1 = (ImageView) findViewById(R.id.one);
        buttonInput1.setOnClickListener(this);
        ImageView buttonInput2 = (ImageView) findViewById(R.id.two);
        buttonInput2.setOnClickListener(this);
        ImageView buttonInput3 = (ImageView) findViewById(R.id.three);
        buttonInput3.setOnClickListener(this);
        ImageView buttonInput4 = (ImageView) findViewById(R.id.four);
        buttonInput4.setOnClickListener(this);
        ImageView buttonInput5 = (ImageView) findViewById(R.id.five);
        buttonInput5.setOnClickListener(this);
        ImageView buttonInput6 = (ImageView) findViewById(R.id.six);
        buttonInput6.setOnClickListener(this);
        ImageView buttonInput7 = (ImageView) findViewById(R.id.seven);
        buttonInput7.setOnClickListener(this);
        ImageView buttonInput8 = (ImageView) findViewById(R.id.eight);
        buttonInput8.setOnClickListener(this);
        ImageView buttonInput9 = (ImageView) findViewById(R.id.nine);
        buttonInput9.setOnClickListener(this);
        ImageView buttonInput0x = (ImageView) findViewById(R.id.zero2);
        buttonInput0x.setOnClickListener(this);
        ImageView buttonInput1x = (ImageView) findViewById(R.id.one2);
        buttonInput1x.setOnClickListener(this);
        ImageView buttonInput2x = (ImageView) findViewById(R.id.two2);
        buttonInput2x.setOnClickListener(this);
        ImageView buttonInput3x = (ImageView) findViewById(R.id.three2);
        buttonInput3x.setOnClickListener(this);
        ImageView buttonInput4x = (ImageView) findViewById(R.id.four2);
        buttonInput4x.setOnClickListener(this);
        ImageView buttonInput5x = (ImageView) findViewById(R.id.five2);
        buttonInput5x.setOnClickListener(this);
        ImageView buttonInput6x = (ImageView) findViewById(R.id.six2);
        buttonInput6x.setOnClickListener(this);
        ImageView buttonInput7x = (ImageView) findViewById(R.id.seven2);
        buttonInput7x.setOnClickListener(this);
        ImageView buttonInput8x = (ImageView) findViewById(R.id.eight2);
        buttonInput8x.setOnClickListener(this);
        ImageView buttonInput9x = (ImageView) findViewById(R.id.nine2);
        buttonInput9x.setOnClickListener(this);
        buttonInputPlus = (ImageView) findViewById(R.id.plus);
        buttonInputPlus.setOnClickListener(this);
        buttonInputMinus = (ImageView) findViewById(R.id.minus);
        buttonInputMinus.setOnClickListener(this);
        buttonInputMultiply = (ImageView) findViewById(R.id.multiply);
        buttonInputMultiply.setOnClickListener(this);
        buttonInputDivide = (ImageView) findViewById(R.id.divide);
        buttonInputDivide.setOnClickListener(this);
        buttonInputMod = (ImageView) findViewById(R.id.mod);
        buttonInputMod.setOnClickListener(this);
        buttonInputEqual = (ImageView) findViewById(R.id.equal);
        buttonInputEqual.setOnClickListener(this);

        textDisplay2 = (TextView) findViewById(R.id.textDisplay2);
        textDisplay1 = (TextView) findViewById(R.id.textDisplay1);
        textDisplay3 = (TextView) findViewById(R.id.textDisplay3);

        operator = "add";
    }

    @Override
    public void onClick(View view)
    {
        checkForNumber(view);
        checkForOperator(view);
        setBackgroundColor(view);
        calculateResult(view);
    }

    private void setBackgroundColor(View view) {
        if (view.getId() == R.id.plus)
        {
            buttonInputPlus.setBackgroundColor(0xff0000ff);
            buttonInputMinus.setBackgroundColor(0);
            buttonInputMultiply.setBackgroundColor(0);
            buttonInputDivide.setBackgroundColor(0);
            buttonInputMod.setBackgroundColor(0);
        }
        else if(view.getId() == R.id.minus)
        {
            buttonInputMinus.setBackgroundColor(0xff0000ff);
            buttonInputPlus.setBackgroundColor(0);
            buttonInputMultiply.setBackgroundColor(0);
            buttonInputDivide.setBackgroundColor(0);
            buttonInputMod.setBackgroundColor(0);
        }
        else if(view.getId() == R.id.multiply)
        {
            buttonInputMultiply.setBackgroundColor(0xff0000ff);
            buttonInputDivide.setBackgroundColor(0);
            buttonInputMinus.setBackgroundColor(0);
            buttonInputPlus.setBackgroundColor(0);
            buttonInputMod.setBackgroundColor(0);
        }
        else if(view.getId() == R.id.divide)
        {
            buttonInputMultiply.setBackgroundColor(0);
            buttonInputDivide.setBackgroundColor(0xff0000ff);
            buttonInputMinus.setBackgroundColor(0);
            buttonInputPlus.setBackgroundColor(0);
            buttonInputMod.setBackgroundColor(0);
        }
        else if(view.getId() == R.id.mod)
        {
            buttonInputMultiply.setBackgroundColor(0);
            buttonInputDivide.setBackgroundColor(0);
            buttonInputMinus.setBackgroundColor(0);
            buttonInputPlus.setBackgroundColor(0);
            buttonInputMod.setBackgroundColor(0xff0000ff);
        }
    }

    private void calculateResult(View view)
    {

        if (view.getId() == R.id.equal)
        {
            Log.i("info", "equal works");

            if (operator == "add")
                {
                    sum = num1 + num2;
                    textDisplay3.setText("" + sum);
                }
            if (operator == "minus")
                {
                    sum = num1 - num2;
                    textDisplay3.setText("" + sum);
                }
            if (operator == "multiply")
            {
                sum = num1 * num2;
                textDisplay3.setText("" + sum);
            }
            if (operator == "mod")
            {
                sum = num1 % num2;
                textDisplay3.setText("" + sum);
            }
            if (operator == "divide")
            {
                if (num2 == 0){
                    textDisplay3.setText("ERROR");
                }else {
                    int a = num1 / num2;
                    double b = (double) num1 / (double) num2;
                    textDisplay3.setText("" + b);
                }
            }

        }
    }


    private void checkForOperator(View view)
    {
        if (view.getId() == R.id.plus)
        {
            Log.i("info", "plus works");
            operator = "add";
        }
        if (view.getId() == R.id.minus)
        {
            Log.i("info", "plus works");
            operator = "minus";
        }
        if (view.getId() == R.id.multiply)
        {
            Log.i("info", "times works");
            operator = "multiply";
        }
        if (view.getId() == R.id.divide)
        {
            Log.i("info", "divide works");
            operator = "divide";
        }
        if (view.getId() == R.id.mod)
        {
            Log.i("info", "mod works");
            operator = "mod";
        }
    }

    private void checkForNumber(View view)
    {
        if (view.getId() == R.id.zero)
        {
            Log.i("info", "0 works");
            textDisplay1.setText("0");
            num1 = 0;
        }
        if (view.getId() == R.id.one)
        {
            Log.i("info", "1 works");
            textDisplay1.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.two)
        {
            Log.i("info", "2 works");
            textDisplay1.setText("2");
            num1 = 2;
        }
        if (view.getId() == R.id.three)
        {
            Log.i("info", "3 works");
            textDisplay1.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.four)
        {
            Log.i("info", "4 works");
            textDisplay1.setText("4");
            num1 = 4;
        }
        if (view.getId() == R.id.five)
        {
            Log.i("info", "5 works");
            textDisplay1.setText("5");
            num1 = 5;
        }
        if (view.getId() == R.id.six)
        {
            Log.i("info", "6 works");
            textDisplay1.setText("6");
            num1 = 6;
        }
        if (view.getId() == R.id.seven)
        {
            Log.i("info", "7 works");
            textDisplay1.setText("7");
            num1 = 7;
        }
        if (view.getId() == R.id.eight)
        {
            Log.i("info", "8 works");
            textDisplay1.setText("8");
            num1 = 8;
        }
        if (view.getId() == R.id.nine)
        {
            Log.i("info", "9 works");
            textDisplay1.setText("9");
            num1 = 9;
        }
        if (view.getId() == R.id.zero2)
        {
            Log.i("info", "0 works");
            textDisplay2.setText("0");
            num2 = 0;
        }
        if (view.getId() == R.id.one2)
        {
            Log.i("info", "1 works");
            textDisplay2.setText("1");
            num2 = 1;
        }
        if (view.getId() == R.id.two2)
        {
            Log.i("info", "2 works");
            textDisplay2.setText("2");
            num2 = 2;
        }
        if (view.getId() == R.id.three2)
        {
            Log.i("info", "3 works");
            textDisplay2.setText("3");
            num2 = 3;
        }
        if (view.getId() == R.id.four2)
        {
            Log.i("info", "4 works");
            textDisplay2.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.five2)
        {
            Log.i("info", "5 works");
            textDisplay2.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.six2)
        {
            Log.i("info", "6 works");
            textDisplay2.setText("6");
            num2 = 6;
        }
        if (view.getId() == R.id.seven2)
        {
            Log.i("info", "7 works");
            textDisplay2.setText("7");
            num2 = 7;
        }
        if (view.getId() == R.id.eight2)
        {
            Log.i("info", "8 works");
            textDisplay2.setText("8");
            num2 = 8;
        }
        if (view.getId() == R.id.nine2)
        {
            Log.i("info", "9 works");
            textDisplay2.setText("9");
            num2 = 9;
        }
    }
}

//line 260