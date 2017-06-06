package org.palmdigital.putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
String story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
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
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj2);
        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);


        String str_adj01 = et_adj1.getText().toString();
        String str_adj02 = et_adj2.getText().toString();
        String str_noun01 = et_noun1.getText().toString();


        story = story + str_adj01 + " sauce, " + str_adj02 + " cheese, " + " and " +
                "fresh chopped " + str_noun01 + ". Next you have to bake it in" +
                " very hot ";
        Intent i = new Intent(Main3Activity.this, Main4Activity.class);
        i.putExtra("STRING_I_NEED",story);
        startActivity(i);
    }
}
