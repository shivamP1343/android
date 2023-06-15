package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2);

        Button btn=findViewById(R.id.button15);
        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab2Q1.class);
                startActivity(i);
            }
        });

        Button btn1=findViewById(R.id.button16);
        //adding click event and listener
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab2Q2.class);
                startActivity(i);
            }
        });
        Button btn2=findViewById(R.id.button17);
        //adding click event and listener
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab2Q3.class);
                startActivity(i);
            }
        });
        Button btn3=findViewById(R.id.button18);
        //adding click event and listener
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab2Q4.class);
                startActivity(i);
            }
        });
    }
}