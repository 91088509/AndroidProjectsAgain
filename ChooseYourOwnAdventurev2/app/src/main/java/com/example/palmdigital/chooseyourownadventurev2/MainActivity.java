package com.example.palmdigital.chooseyourownadventurev2;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button leftButton;
    Button rightButton;
    Button backButton;
    String page = "main";
    TextView textView_story;
    TextView textView_question;
    LinearLayout background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //references

        //TextViews
        textView_story    = (TextView) findViewById(R.id.textView_story);
        textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        //Buttons
        leftButton = (Button) findViewById(R.id.button_Left);
        rightButton = (Button) findViewById(R.id.button_Right);
        backButton = (Button) findViewById(R.id.backButton);


        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        //setClickListeners

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        backButton.setOnClickListener(this);

        //layout background

        background = (LinearLayout) findViewById(R.id.activity_main);

        loadPage();
    }

    @Override
    public void onClick(View view) {


        //wake up
        if (view.getId() == R.id.button_Left)
        {
            if (page == "main") {
                //send user to Wake up activity
                page = "wakeUp";
                loadPage();
            }
            else if (page == "explore") {
                //send user to Wake up activity
                page = "backyard";
                loadPage();
            }
            else if (page == "backyard") {
                //send user to Wake up activity
                page = "main";
                loadPage();
            }
            else if (page == "toilet") {
                //send user to Wake up activity
                page = "yes";
                loadPage();
            }
        }//explore
        else if (view.getId() == R.id.button_Right)
        {
            //send user to explore activity
            if (page == "main") {
                //send user to Wake up activity
                page = "explore";
                loadPage();
            }
            else if (page == "explore") {
                //send user to Wake up activity
                page = "toilet";
                loadPage();
            }
            else if (page == "toilet") {
                //send user to Wake up activity
                page = "yes";
                loadPage();
            }
            else if (page == "backyard") {
                //send user to Wake up activity
                page = "faint";
                loadPage();
            }
        }
        else if(view.getId() == R.id.backButton){
            if (page == "wakeUp"){
                page = "main";
                loadPage();
            }
            else if (page == "explore"){
                page = "main";
                loadPage();
            }
            else if (page == "backyard"){
                page = "explore";
                loadPage();
            }
            else if (page == "toilet"){
                page = "explore";
                loadPage();
            }
            else if (page == "faint"){
                page = "backyard";
                loadPage();
            }
            else if (page == "yes"){
                page = "toilet";
                loadPage();
            }
        }
    }//end of onClick Method
    public void loadPage(){
        if (page == "main")
        {
            textView_story.setText("One morning the tortoise woke up in a dream.");
            textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");
            background.setBackgroundColor(0xff00ff00);
            leftButton.setText("Wake Up");
            rightButton.setText("Explore");
            leftButton.setVisibility(View.VISIBLE);
            rightButton.setVisibility(View.VISIBLE);;
         //set story/question
        }
        if (page == "wakeUp")
        {
            textView_story.setText("You wake up and have a boring day. The end.");
            textView_question.setText("");
            background.setBackgroundColor(0xff888888);
            leftButton.setVisibility(View.INVISIBLE);
            rightButton.setVisibility(View.INVISIBLE);
        }
        if (page == "explore")
        {
            textView_story.setText("You approach a glowing green bucket of ooze." +
                    "Worried that you will get in trouble, you pick up the bucket.");
            textView_question.setText("Do you want to pour the ooze into the 'backyard' or" +
                    " 'toilet'?");
            background.setBackgroundColor(0xff00ffff);
            leftButton.setText("Backyard");
            rightButton.setText("Toilet");
            leftButton.setVisibility(View.VISIBLE);
            rightButton.setVisibility(View.VISIBLE);
        }
        if (page == "backyard")
        {
            textView_story.setText("As you walk into the backyard a net scoops you up and a" +
                    "giant takes you to a boiling pot of water");
            textView_question.setText("As the man starts to prepare you a soup, do you 'Scream'" +
                    " 'Faint'?");
            background.setBackgroundColor(Color.parseColor("#FFA500"));
            leftButton.setText("Scream");
            rightButton.setText("Faint");
            leftButton.setVisibility(View.VISIBLE);
            rightButton.setVisibility(View.VISIBLE);
        }
        if (page == "toilet")
        {
            textView_story.setText("As you pour the ooze into the toilet, it backs up, gurgles" +
                    ", and explodes, covering you in radioactive waste.");
            textView_question.setText("Do you want to train to be a NINJA? 'Yes' or 'HECK YES'?");
            background.setBackgroundColor(0xffff0000);
            leftButton.setText("Yes");
            rightButton.setText("Heck Yes");
            leftButton.setVisibility(View.VISIBLE);
            rightButton.setVisibility(View.VISIBLE);
        }
        if (page == "yes")
        {
            textView_story.setText("Awesome dude! You live out the rest of your life fighting" +
                    " crimes and eating pizza!");
            textView_question.setText("");
            background.setBackgroundColor(Color.parseColor("#551a8b"));
            leftButton.setText("");
            rightButton.setText("");
            leftButton.setVisibility(View.INVISIBLE);
            rightButton.setVisibility(View.INVISIBLE);
        }
        if (page == "faint")
        {
            textView_story.setText("You made a delicious soup! Yum! The end.");
            textView_question.setText("");
            background.setBackgroundColor(Color.parseColor("#800080"));
            leftButton.setText("");
            rightButton.setText("");
            leftButton.setVisibility(View.INVISIBLE);
            rightButton.setVisibility(View.INVISIBLE);
        }
    }
    }

