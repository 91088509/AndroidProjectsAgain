package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity_ extends AppCompatActivity {
//feld
    String newString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_);

        //rephurense
       // TextView tv_story = (TextView) findViewById(R.id.text_view_Story);

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

          //  tv_story.setText(newString);
    }
    public void next02(View view)
    {
        //rephurenses
        EditText et_nation01 = (EditText)findViewById(R.id.);

        String str_nation01 = et_nation01.getText().toString();

        String story = newString + " " + str_nation01;

        Intent i = new Intent(this, Main3Activity_.class);
        i.putExtra("STORY_SO_FAR", story);
        startActivity(i);
    }
}
