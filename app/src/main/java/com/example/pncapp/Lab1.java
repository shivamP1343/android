package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        Button btn=findViewById(R.id.button10);
        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab1Q2.class);
                startActivity(i);
            }
        });
        Button btn1=findViewById(R.id.button11);
        //adding click event and listener
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab1Q3.class);
                startActivity(i);
            }
        });
        Button btn2=findViewById(R.id.button12);
        //adding click event and listener
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab1Q4.class);
                startActivity(i);
            }
        });
        Button btn3=findViewById(R.id.button13);
        //adding click event and listener
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab1Q5.class);
                startActivity(i);
            }
        });
        Button btn4=findViewById(R.id.button14);
        //adding click event and listener
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab1Q6.class);
                startActivity(i);
            }
        });
    }
}