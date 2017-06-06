package com.example.palmdigital.buttonchallenge1;

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
        Button buttonObject1 = (Button) findViewById(R.id.button1);
        Button buttonObject2 = (Button) findViewById(R.id.button2);
        Button buttonObject3 = (Button) findViewById(R.id.button3);
        buttonObject1.setText("Contacts");
        buttonObject2.setText("Email");
        buttonObject3.setText("Messages");
        buttonObject1.setBackgroundColor(0xff0000ff);
        buttonObject2.setBackgroundColor(0xff00ff00);
        buttonObject3.setBackgroundColor(0xffff0000);
        buttonObject3.setOnClickListener(this);
        buttonObject2.setOnClickListener(this);
        buttonObject1.setOnClickListener(this);

    }
    public void onClick(View view)
        {
            if (view.getId() == R.id.button1) {
                Toast.makeText(this, "You opened your Contacts", Toast.LENGTH_SHORT).show();
                Log.i("ATENCION", "You opened your Contacts");
            }else if (view.getId() == R.id.button2) {
                Toast.makeText(this, "You opened your Email", Toast.LENGTH_SHORT).show();
                Log.i("ATENCION", "You opened your Email");
            }else if (view.getId() == R.id.button3) {
                Toast.makeText(this, "You opened your Messages", Toast.LENGTH_SHORT).show();
                Log.i("ATENCION", "You opened your Messages");
            }

        }
}
