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
    private final static int MIN_NUM = 1;
    private final static int MAX_NUM = 10;

    private int num2guess = getRandom(MIN_NUM,MAX_NUM);
    private TextView txt_numAttemps;
    private TextView txt_pickedNum;

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init attemps
        txt_numAttemps = findViewById(R.id.txt_numAttemps);
        txt_numAttemps.setText(START_ATTEMPS);

        initButtonsListeners();
    }

    private void initButtonsListeners() {
        int[] numPicked = new int[1];

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

        button0.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button1.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button2.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button3.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button4.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button5.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button6.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button7.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button8.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });
        button9.setOnClickListener(view -> {
            txt_pickedNum.setText(this.getText(0));
            numPicked[0] = Integer.parseInt((String) txt_pickedNum.getText());
        });

        ///////////////////////
        checkWin(numPicked[0]);
    }

    private void checkWin(int numPicked) {

    }

    public int getRandom(int min, int max){
        Random r = new Random();
        return r.nextInt(max-min+1)+min;
    }
}