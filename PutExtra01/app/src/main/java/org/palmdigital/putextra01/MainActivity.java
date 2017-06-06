package org.palmdigital.putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view) {
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_nation1 = (EditText) findViewById(R.id.edit_text_nation1);
        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);


        String str_adj01 = et_adj1.getText().toString();
        String str_nation01 = et_nation1.getText().toString();
        String str_noun01 = et_noun1.getText().toString();


        String story = "Pizza was invented by a " + str_adj01 + " " + str_nation01 + " chef named "
            + str_noun01 + "." + "To make a pizza, you need to take a lump of ";

    Intent i = new Intent(MainActivity.this, Main2Activity.class);
    i.putExtra("STRING_I_NEED",story);
        startActivity(i);
}
}