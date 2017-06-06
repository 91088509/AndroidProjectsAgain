package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
//we are outside the MainActivity class
//we are outside any methods

//Understanding how scope work in very important!!

public class MainActivity extends AppCompatActivity {
//in the MainActivity class, but I'm outisde any methods

    //fields - these variables have classwide scope -- any code in the class can see and use deez variables
    String myString;
    //declare a field that is a double named enemyHealth
    double enemyHealth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here. we are inside the onCreate() method, which is inside
        // the MainActivity class

        //when we 'declare' or 'define' a variable, we use the following format:
        //dataType variableName; <--- this is a variable delaration/definition
        //Some examples:
        int myInt; // <-- this is declaring a variable of dataType 'int' and named 'myInt'
        double myDouble; // <-- this is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; // <-- this is declaring a variable of dataType 'TextView' named 'textView_Story'

        ImageView imageView_ex; // <-- dataType is ImageView, variableName is imageView_ex

        // assigning a value to a declared variable
        //after we delcare a variable, we can assign a value to it.
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        //some examples:
        myInt = 10; //<-- setting the value of myInt to 10, myInt has dataType 'int' & 10 is an int
        myDouble = 20.12; //myDouble gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textView_st);// set the value of
                                            //textView_story to the UI element R.id.textView_st

        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);
enemyHealth = 32.3;

        //you know you can declare and assign in the same step
        //dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        //Some examples:
        int myInt2 = 25;//<-- declaration of independence and assignment
        myInt2 = 50; //<-- this is only assignment
        //THE  DIFFERENCE IS THE dataType!!!!! 'int'
        myString = "this is a string"; //<-- a declareation & assignment
        myString = "this is another STrang!"; //<-- assignment

        // *!!*WHEREVER YOU DECLARE A VARIABLE DETERMINES THAT VARIABLE'S SCOPE!!!!!*!!*
        // in other words, if i declare a variab le here in the onCreate() method, only
        //code in the onCreate() method can see it and use it
        //nothing outside of onCreate() can see it... lets prove this...

    }//end on coCreate methods

    public void myAwesomeMethod01()
    {
        myString = "whats going on here!?!";
        enemyHealth = 9.23;
    }//end of myAwesomeMethod01()
    public void myAwesomeMethod02()
    {
        enemyHealth = 4.3;
    }

}// end on class

