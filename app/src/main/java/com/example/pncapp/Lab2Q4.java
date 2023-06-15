package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab2Q4 extends AppCompatActivity {
    private EditText editTextPrincipal, editTextRate, editTextTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_q4);

        editTextPrincipal = findViewById(R.id.editTextPrincipal);
        editTextRate = findViewById(R.id.editTextRate);
        editTextTime = findViewById(R.id.editTextTime);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double principal = Double.parseDouble(editTextPrincipal.getText().toString());
                double rate = Double.parseDouble(editTextRate.getText().toString());
                double time = Double.parseDouble(editTextTime.getText().toString());

                double simpleInterest = (principal * rate * time) / 100;

                Intent intent = new Intent(Lab2Q4.this, ResultActivity.class);
                intent.putExtra("simpleInterest", simpleInterest);
                startActivity(intent);
            }
        });
    }
}