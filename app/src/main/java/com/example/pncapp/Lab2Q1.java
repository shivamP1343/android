package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class Lab2Q1 extends AppCompatActivity {
    private EditText number1EditText;
    private EditText number2EditText;
    private EditText operatorEditText;
    private Button calculateButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_q1);

        number1EditText = findViewById(R.id.editTextNumber1);
        number2EditText = findViewById(R.id.editTextNumber2);
        //operatorEditText = findViewById(R.id.editTextOperator);
       // calculateButton = findViewById(R.id.buttonCalculate);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);

       // calculateButton.setOnClickListener(new View.OnClickListener() {
        //    @Override
          //  public void onClick(View v) {
         //       calculateResult();
        //    }
       // });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('+');
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('-');
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('*');
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation('/');
            }
        });
    }
    private void performCalculation(char operator) {
        double number1 = Double.parseDouble(number1EditText.getText().toString());
        double number2 = Double.parseDouble(number2EditText.getText().toString());

        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                showToast("Addition: " + result);
                break;
            case '-':
                result = number1 - number2;
                showToast("Subtraction: " + result);
                break;
            case '*':
                result = number1 * number2;
                showToast("Multiplication: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    showToast("Division: " + result);
                } else {
                    showToast("Cannot divide by zero!");
                }
                break;
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}