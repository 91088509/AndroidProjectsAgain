package org.palmdigital.putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {
String story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
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
    public void next04(View view){
        EditText et_food1 = (EditText) findViewById(R.id.edit_text_food1);
        EditText et_food2 = (EditText) findViewById(R.id.edit_text_food2);
        EditText et_number1 = (EditText) findViewById(R.id.edit_text_number1);


        String str_food1 = et_food1.getText().toString();
        String str_number01 = et_number1.getText().toString();
        String str_food2 = et_food2.getText().toString();


        story = story + str_food1 + " pizza the best, but my favorite is the " + str_food2 +
        " pizza. If I could, I would eat pizza " + str_number01 + " times a day!";
        Intent i = new Intent(Main5Activity.this, Main6Activity.class);
        i.putExtra("STRING_I_NEED",story);
        startActivity(i);
    }
}
