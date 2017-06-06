package org.palmdigital.hilow_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
String event = "off";
    int input;
    int tries = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        int randomValue;
        TextView text_display = (TextView)findViewById(R.id.text_display);
        Button button = (Button) findViewById(R.id.button_input);
        EditText user_input = (EditText) findViewById(R.id.editText);
        String strUserInput = user_input.getText().toString();
        if (TextUtils.isEmpty(strUserInput) == false && TextUtils.isDigitsOnly(strUserInput)) {
            input = Integer.parseInt(strUserInput);
        }
        else
        {
            input = 0;
        }
//
        if (event == "off") {
            event = "running";
            tries = 10;
            Random random = new Random();
            randomValue = random.nextInt(101);
            button.setText("guess this number");
        }
        if (event == "running") {
            if (tries == 0) {
                event = "end";
            }
            if (tries != 0) {
                tries--;
                
            }
        }
        }

    }
