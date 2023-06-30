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
        Button btn5=findViewById(R.id.button20);
        //adding click event and listener
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent i = new Intent(getApplicationContext(), ContextActivity.class);
                startActivity(i);
            }
        });
    }
}