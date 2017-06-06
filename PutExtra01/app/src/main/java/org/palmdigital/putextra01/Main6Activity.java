package org.palmdigital.putextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
String story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
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
    public void makeStory(View view){
        TextView tv_story = (TextView)findViewById(R.id.text_view);
        tv_story.setText(story);
    }
}
