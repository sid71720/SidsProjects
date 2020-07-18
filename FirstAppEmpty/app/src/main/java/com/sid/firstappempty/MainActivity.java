package com.sid.firstappempty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    //Declaration of the object variables
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    Button btnEqual;
    Button btnClear;
    double firstNumber;
    double secondNumber;
    double result;
    String operator;
    public void resetValues() {
        firstNumber = 0.0;
        secondNumber = 0.0;
        result = 0.0;
        operator = "";
    }





    TextView viewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = (Button) findViewById(R.id.number1);
        btnTwo = (Button) findViewById(R.id.number2);
        btnThree = (Button) findViewById(R.id.number3);
        btnFour = (Button) findViewById(R.id.number4);
        btnFive = (Button) findViewById(R.id.number5);
        btnSix = (Button) findViewById(R.id.number6);
        btnSeven = (Button) findViewById(R.id.number7);
        btnEight = (Button) findViewById(R.id.number8);
        btnNine = (Button) findViewById(R.id.number9);
        btnZero = (Button) findViewById(R.id.number0);
        btnAdd = (Button) findViewById(R.id.addition);
        btnSub = (Button) findViewById(R.id.subtraction);
        btnDiv = (Button) findViewById(R.id.division);
        btnMult = (Button) findViewById(R.id.multiplication);
        btnEqual = (Button) findViewById(R.id.equals);
        btnClear = (Button) findViewById(R.id.clear);
        viewResult = (TextView) findViewById(R.id.editTextNumberDecimal);
        btnOne.setOnClickListener(MainActivity.this);
        btnTwo.setOnClickListener(MainActivity.this);
        btnThree.setOnClickListener(MainActivity.this);
        btnFour.setOnClickListener(MainActivity.this);
        btnFive.setOnClickListener(MainActivity.this);
        btnSix.setOnClickListener(MainActivity.this);
        btnSeven.setOnClickListener(MainActivity.this);
        btnEight.setOnClickListener(MainActivity.this);
        btnNine.setOnClickListener(MainActivity.this);
        btnZero.setOnClickListener(MainActivity.this);
        btnAdd.setOnClickListener(MainActivity.this);
        btnSub.setOnClickListener(MainActivity.this);
        btnMult.setOnClickListener(MainActivity.this);
        btnDiv.setOnClickListener(MainActivity.this);
        btnEqual.setOnClickListener(MainActivity.this);
        btnClear.setOnClickListener(MainActivity.this);
        resetValues();
    }

    @Override
    public void onClick(View v) {
        if(v == btnOne) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "1";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnTwo) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "2";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnThree) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "3";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnFour) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "4";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnFive) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "5";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnSix) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "6";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnSeven) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "7";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnEight) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "8";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnNine) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "9";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnZero) {
            CharSequence displayValue = viewResult.getText();
            CharSequence finalDisplayValue = displayValue + "0";
            viewResult.setText(finalDisplayValue);
            viewResult.setVisibility(View.VISIBLE);
        }
        else if (v == btnAdd) {
            firstNumber = Double.parseDouble(viewResult.getText().toString());
            operator = "+";
            viewResult.setText("");
        }
        else if (v == btnSub) {
            firstNumber = Double.parseDouble(viewResult.getText().toString());
            operator = "-";
            viewResult.setText("");
        }
        else if (v == btnDiv) {
            firstNumber = Double.parseDouble(viewResult.getText().toString());
            operator = "/";
            viewResult.setText("");
        }
        else if (v == btnMult) {
            firstNumber = Double.parseDouble(viewResult.getText().toString());
            operator = "x";
            viewResult.setText("");
        }
        else if (v == btnEqual) {
            secondNumber = Double.parseDouble(viewResult.getText().toString());
            if (operator == "+") {
                result = firstNumber + secondNumber;
                viewResult.setText(String.valueOf(result));
                resetValues();
        }
            else if (operator == "-") {
                result = firstNumber - secondNumber;
                viewResult.setText(String.valueOf(result));
                resetValues();
            }
            else if (operator == "/") {
                result = firstNumber / secondNumber;
                viewResult.setText(String.valueOf(result));
                resetValues();
            }
            else if (operator == "x") {
                result = firstNumber * secondNumber;
                viewResult.setText(String.valueOf(result));
                resetValues();
            }
            }
        else if (v == btnClear) {
            viewResult.setText("");
            resetValues();
        }
        }
        }





