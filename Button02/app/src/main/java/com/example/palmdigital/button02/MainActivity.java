package com.example.palmdigital.button02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = (Button)findViewById(R.id.buttonMyButton1);
        buttonObject1.setOnClickListener(this);
    }//end
    public void onClick(View view)
    {
        Log.i("Info", "Hey you pressed button 1.");
        Toast.makeText(this, "This is a toast from the Button you just pressed.", Toast.LENGTH_SHORT).show();
    }
}
