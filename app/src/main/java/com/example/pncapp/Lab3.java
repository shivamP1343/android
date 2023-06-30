package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);

        Button btn=findViewById(R.id.button);
        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab3Q1.class);
                startActivity(i);
            }
        });

        Button btn1=findViewById(R.id.button2);
        //adding click event and listener
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), RecycleView.class);
                startActivity(i);
            }
        });
        Button btn5=findViewById(R.id.button3);
        //adding click event and listener
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), CustomgridItems.class);
                startActivity(i);
            }
        });
        Button btn2=findViewById(R.id.button4);
        //adding click event and listener
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab3Q4.class);
                startActivity(i);
            }
        });
        Button btn3=findViewById(R.id.button5);
        //adding click event and listener
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab3Q5.class);
                startActivity(i);
            }
        });
        Button btn4=findViewById(R.id.button6);
        //adding click event and listener
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), Lab3Q6.class);
                startActivity(i);
            }
        });
    }
}