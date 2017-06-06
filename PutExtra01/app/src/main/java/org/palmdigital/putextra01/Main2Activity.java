package org.palmdigital.putextra01;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
    public void next02(View view){
        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_noun2 = (EditText) findViewById(R.id.edit_text_noun2);


        String str_noun01 = et_noun1.getText().toString();
        String str_adj01 = et_adj1.getText().toString();
        String str_noun02 = et_noun2.getText().toString();


        story = story + str_noun01 + ", and make a thin round " + str_adj01 + " "
        + str_noun02 + ". Then you cover it with ";
        Intent i = new Intent(Main2Activity.this, Main3Activity.class);
        i.putExtra("STRING_I_NEED",story);
        startActivity(i);
    }
}
