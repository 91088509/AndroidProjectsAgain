package org.palmdigital.fizzbuzz01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int inputNum;
    String inputString;
    TextView textDisplay;
    EditText inputedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void go(View view)
    {
        textDisplay = (TextView)findViewById(R.id.text_view_display);
        inputedText = (EditText)findViewById(R.id.edit_text);
        inputString = inputedText.getText().toString();
        inputNum = Integer.parseInt(inputString);
        calculateResult();

        inputString = ""+inputNum;
    }
    public void calculateResult()
    {
        if(inputNum % 5 == 0 && inputNum % 3 != 0);

    }
}
