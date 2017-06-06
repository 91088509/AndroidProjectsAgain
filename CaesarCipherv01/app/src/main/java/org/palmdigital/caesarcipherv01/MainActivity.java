package org.palmdigital.caesarcipherv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //System.out.println("the unencrypted string is " + myInput);
        //System.out.println("The encrypted string is " + result);

    }
//    public static void main(String[] args) {
//
//    } // end of main
    //opasly7
    public void encrypt(View view)
    {
        String myInput;
        int shift_inputInt = 0;
        EditText text_input = (EditText) findViewById(R.id.text_input);
        EditText shift_input = (EditText) findViewById(R.id.shift_input);

            TextView text_display = (TextView) findViewById(R.id.textDisplay);
            String text_inputStr = text_input.getText().toString();
        if (shift_input.getText().toString().isEmpty())
        {
            shift_inputInt = 0;
        }else
        {
            shift_inputInt = Integer.parseInt(shift_input.getText().toString());
        }
        //if (shift_inputInt != 0) {
            myInput = text_inputStr;
            result = crypt(myInput, shift_inputInt, true);
            text_display.setText(result);
            Log.i("info", result);
        //}
    }
    public void decrypt(View view)
    {
        String myInput;
        int shift_inputInt = 0;
        EditText text_input = (EditText) findViewById(R.id.text_input);
        EditText shift_input = (EditText) findViewById(R.id.shift_input);
        TextView text_display = (TextView) findViewById(R.id.textDisplay);
        String text_inputStr = text_input.getText().toString();
        if (shift_input.getText().toString().isEmpty())
        {
            shift_inputInt = 0;
        }
        else
        {
            shift_inputInt = Integer.parseInt(shift_input.getText().toString());
        }
        myInput = text_inputStr;
        result = crypt(myInput, shift_inputInt, false);
        text_display.setText(result);
        Log.i("info", result);
    }
    //104
    public static String crypt(String input, int shift, boolean encrypt) {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';

        //int shift = 1;

        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        if (encrypt == true)
        {
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (toUpperCase.charAt(i) == alphabet[j]) {
                        shiftCharIndex = j + shift;
                        fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                        output = output + alphabet[fixedCharIndex];
                    } // end of if statement
                } // end of inner loop
                if (input.charAt(i) == ' ') {
                    output += " ";
                }
            } // end of outer for loop
        }
        else {
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < alphabet.length; j++) {
                    if (toUpperCase.charAt(i) == alphabet[j]) {
                        shiftCharIndex = j + (26-shift);
                        fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                        output = output + alphabet[fixedCharIndex];
                    } // end of if statement
                } // end of inner loop
                if (input.charAt(i) == ' ') {
                    output += " ";
                }
            } // end of outer for loop
        }
        return output;
    }
}

//public class _Encrypt_v02
//{
//    public static void main(String[] args)
//    {
//        String myInput = "dogs are great";
//        String result = encrypt(myInput, 27);
//        System.out.println("the unencrypted string is " + myInput);
//        System.out.println("The encrypted string is " + result);
//    } // end of main
//    public static String encrypt(String input, int shift)
//    {
//        int size = 26;
//        char[] alphabet = new char[size];
//        alphabet[0] = 'A';
//        alphabet[1] = 'B';
//        alphabet[2] = 'C';
//        alphabet[3] = 'D';
//        alphabet[4] = 'E';
//        alphabet[5] = 'F';
//        alphabet[6] = 'G';
//        alphabet[7] = 'H';
//        alphabet[8] = 'I';
//        alphabet[9] = 'J';
//        alphabet[10] = 'K';
//        alphabet[11] = 'L';
//        alphabet[12] = 'M';
//        alphabet[13] = 'N';
//        alphabet[14] = 'O';
//        alphabet[15] = 'P';
//        alphabet[16] = 'Q';
//        alphabet[17] = 'R';
//        alphabet[18] = 'S';
//        alphabet[19] = 'T';
//        alphabet[20] = 'U';
//        alphabet[21] = 'V';
//        alphabet[22] = 'W';
//        alphabet[23] = 'X';
//        alphabet[24] = 'Y';
//        alphabet[25] = 'Z';
//        //int shift = 1;
//        int shiftCharIndex;
//        int fixedCharIndex;
//        String output = "";
//        String toUpperCase = input.toUpperCase();
//        for (int i = 0; i < input.length(); i++)
//        {
//            for (int j = 0; j < alphabet.length; j++)
//            {
//                if (toUpperCase.charAt(i) == alphabet[j])
//                {
//                    shiftCharIndex = j + shift;
//                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
//                    output = output + alphabet[fixedCharIndex];
//                } // end of if statement
//            } // end of inner loop
//            if (input.charAt(i) == ' ')
//            {
//                output += " ";
//            }
//        } // end of outer for loop
//        return output;
//    }
//} // end of class