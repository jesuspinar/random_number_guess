package com.jesuspinar.random_number_guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final static int START_ATTEMPS = 3;
    private final static int END_ATTEMPS = 0;
    private final static int MIN_NUM = 0;
    private final static int MAX_NUM = 9;

    private TextView txt_numAttemps;
    private TextView txt_pickedNum;

    private int num2guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init attemps
        num2guess = getRandom(MIN_NUM,MAX_NUM);
        txt_numAttemps = findViewById(R.id.txtNumAttemps);
        txt_numAttemps.setText(num2guess +"");

        txt_pickedNum = findViewById(R.id.txtPickedNum);

        initButtonsListeners();
    }




    private void initButtonsListeners() {
        Button button0;
        Button button1;
        Button button2;
        Button button3;
        Button button4;
        Button button5;
        Button button6;
        Button button7;
        Button button8;
        Button button9;

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button0.setOnClickListener(view ->  txt_pickedNum.setText("0"));
        button1.setOnClickListener(view ->  txt_pickedNum.setText("1"));
        button2.setOnClickListener(view ->  txt_pickedNum.setText("2"));
        button3.setOnClickListener(view ->  txt_pickedNum.setText("3"));
        button4.setOnClickListener(view ->  txt_pickedNum.setText("4"));
        button5.setOnClickListener(view ->  txt_pickedNum.setText("5"));
        button6.setOnClickListener(view ->  txt_pickedNum.setText("6"));
        button7.setOnClickListener(view ->  txt_pickedNum.setText("7"));
        button8.setOnClickListener(view ->  txt_pickedNum.setText("8"));
        button9.setOnClickListener(view ->  txt_pickedNum.setText("9"));


        ///////////////////////
//        checkWin(Integer.parseInt(txt_pickedNum.getText().toString()));
    }

    private void checkWin(int numPicked) {
        int numAttemps = Integer.parseInt(txt_numAttemps.getText().toString());

        if(numPicked == num2guess && numAttemps >= END_ATTEMPS ){
            Toast.makeText(this,"You win !!", Toast.LENGTH_LONG).show();
            onDestroy();
        }
        else if(numAttemps <= END_ATTEMPS){
            Toast.makeText(this,"You lose !!", Toast.LENGTH_LONG).show();
            onDestroy();
        }
        else{
            txt_numAttemps.setText(Integer.parseInt(txt_pickedNum.getText().toString()) - 1);
        }
    }

    public int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min+1)+min;
    }

}