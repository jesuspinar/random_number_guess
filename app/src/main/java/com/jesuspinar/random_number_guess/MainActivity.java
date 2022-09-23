package com.jesuspinar.random_number_guess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final static int START_ATTEMPS = 3;
    private final static int END_ATTEMPS = 0;
    private final static int MIN_NUM = 0;
    private final static int MAX_NUM = 9;

    private TextView txt_pickedNum;
    private TextView txt_numAttemps;
    private int numAttemps;
    private int num2guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num2guess = getRandom(MIN_NUM,MAX_NUM);

        txt_numAttemps = findViewById(R.id.txtNumAttemps);
        txt_pickedNum = findViewById(R.id.txtPickedNum);

        numAttemps = START_ATTEMPS;
        txt_numAttemps.setText(String.valueOf(START_ATTEMPS));

        initButtonsListeners();
    }

    private void initButtonsListeners() {
        View.OnClickListener listener = v -> {
            switch (v.getId()){
                case R.id.button0: txt_pickedNum.setText("0");checkWin(0);break;
                case R.id.button1: txt_pickedNum.setText("1");checkWin(1);break;
                case R.id.button2: txt_pickedNum.setText("2");checkWin(2);break;
                case R.id.button3: txt_pickedNum.setText("3");checkWin(3);break;
                case R.id.button4: txt_pickedNum.setText("4");checkWin(4);break;
                case R.id.button5: txt_pickedNum.setText("5");checkWin(5);break;
                case R.id.button6: txt_pickedNum.setText("6");checkWin(6);break;
                case R.id.button7: txt_pickedNum.setText("7");checkWin(7);break;
                case R.id.button8: txt_pickedNum.setText("8");checkWin(8);break;
                case R.id.button9: txt_pickedNum.setText("9");checkWin(9);break;
            }
        };
        Button button0 = findViewById(R.id.button0); button0.setOnClickListener(listener);
        Button button1 = findViewById(R.id.button1); button1.setOnClickListener(listener);
        Button button2 = findViewById(R.id.button2); button2.setOnClickListener(listener);
        Button button3 = findViewById(R.id.button3); button3.setOnClickListener(listener);
        Button button4 = findViewById(R.id.button4); button4.setOnClickListener(listener);
        Button button5 = findViewById(R.id.button5); button5.setOnClickListener(listener);
        Button button6 = findViewById(R.id.button6); button6.setOnClickListener(listener);
        Button button7 = findViewById(R.id.button7); button7.setOnClickListener(listener);
        Button button8 = findViewById(R.id.button8); button8.setOnClickListener(listener);
        Button button9 = findViewById(R.id.button9); button9.setOnClickListener(listener);
    }

    private void checkWin(int numPicked) {
        if(numPicked == num2guess && numAttemps >= END_ATTEMPS ){
            Toast.makeText(this,"You win !!", Toast.LENGTH_LONG).show();
            finishAffinity();
        }
        else if(numAttemps <= END_ATTEMPS){
            Toast.makeText(this,"You lose !!", Toast.LENGTH_LONG).show();
            finishAffinity();
        }
        else{
            numAttemps--;
            txt_numAttemps.setText(String.valueOf(numAttemps));
            Toast.makeText(this,"Try again", Toast.LENGTH_SHORT).show();
        }
    }

    public int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min+1)+min;
    }

}