package org.palmdigital.madlibspizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//checkforVowel();

}
//public void checkforVowel()
//{
//    String str ="a njCSBF yiALguercronym";
//
//        if(str.charAt(1) == 'a'){
//
//           Log.i("whateber", "yes");
//        }
//
//}

    public void makeStory(View view)
    {
        EditText et_adj1 = (EditText) findViewById(R.id.edit_text_adj1);
        EditText et_nation1 = (EditText) findViewById(R.id.edit_text_nation1);
        EditText et_name1 = (EditText) findViewById(R.id.edit_text_name1);
        EditText et_noun1 = (EditText) findViewById(R.id.edit_text_noun1);
        EditText et_adj2 = (EditText) findViewById(R.id.edit_text_adj2);
        EditText et_adj3 = (EditText) findViewById(R.id.edit_text_adj3);
        EditText et_adj4 = (EditText) findViewById(R.id.edit_text_adj4);
        EditText et_noun2 = (EditText) findViewById(R.id.edit_text_noun2);
        EditText et_pnoun1 = (EditText) findViewById(R.id.edit_text_pnoun1);




        TextView tv_story = (TextView) findViewById(R.id.text_view_story);


        String str_Adj1 = et_adj1.getText().toString();
        String str_Nation1 = et_nation1.getText().toString();
        String str_Name1 = et_name1.getText().toString();
        String str_Noun1 = et_noun1.getText().toString();
        String str_Noun2 = et_noun2.getText().toString();
        String str_Adj2 = et_adj2.getText().toString();
        String str_Adj3 = et_adj3.getText().toString();
        String str_Adj4 = et_adj4.getText().toString();
        String str_pNoun1 = et_pnoun1.getText().toString();



        String story = "Pizza was invented by a ";
        story = story + str_Adj1 + " " + str_Nation1 + " chef named " + str_Name1
        + " 3;.To make a pizza, you need to take a lump of " + str_Noun1 + " and make a thin,round " +
          str_Adj2 + " " + str_Noun2 + "." + " Then you cover it with " + str_Adj3 + " sauce," +
                str_Adj4 + " cheese, and fresh chopped " + str_pNoun1;
        ;

        tv_story.setText(story);
    }

}
