package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab1Q3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_q3);

        Button btn=findViewById(R.id.button5);
        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), LinearActivity.class);
                startActivity(i);
            }
        });
        Button btn1=findViewById(R.id.button6);
        //adding click event and listener
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent relative_layout = new Intent(getApplicationContext(), RelativeActivity1.class);
                startActivity(relative_layout);
            }
        });
        Button btn2=findViewById(R.id.button7);
        //adding click event and listener
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent absoulte_layout = new Intent(getApplicationContext(), AbsoulteLayout.class);
                startActivity(absoulte_layout);
            }
        });
        Button btn3=findViewById(R.id.button8);
        //adding click event and listener
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent table_layout = new Intent(getApplicationContext(), TableLayout.class);
                startActivity(table_layout);
            }
        });
        Button btn4=findViewById(R.id.button9);
        //adding click event and listener
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent constraint_layout = new Intent(getApplicationContext(),ConstraintActivity.class);
                startActivity(constraint_layout);
            }
        });
    }
}