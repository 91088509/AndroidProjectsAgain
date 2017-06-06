package com.example.palmdigital.birthdaycard;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView button = (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(this);
        text = (TextView) findViewById(R.id.textview);
    }

    @Override
    public void onClick(View v) {
        int i = 0;
        while (i != 10){
i++;
            text.setTextColor(Color.parseColor(ffffff));
        }
    }
}
