package org.palmdigital.putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
String story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                story= null;
            } else {
                story= extras.getString("STRING_I_NEED");
            }
        } else {
            story = (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }

    }
    public void next03(View view){
        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);
        EditText et_number1 = (EditText) findViewById(R.id.edit_text_number1);
        EditText et_shape1 = (EditText) findViewById(R.id.edit_text_shape1);


        String str_noun01 = et_noun1.getText().toString();
        String str_number01 = et_number1.getText().toString();
        String str_shape01 = et_shape1.getText().toString();


        story = story + str_noun01 + ". When it is done, cut it into " + str_number01+
         " " + str_shape01 + ". Some kids like ";
        Intent i = new Intent(Main4Activity.this, Main5Activity.class);
        i.putExtra("STRING_I_NEED",story);
        startActivity(i);
    }
}
