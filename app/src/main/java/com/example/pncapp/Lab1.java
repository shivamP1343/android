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
    }
}