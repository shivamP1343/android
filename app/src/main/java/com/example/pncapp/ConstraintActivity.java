package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        Button btn=findViewById(R.id.button3);
        Button btn1=findViewById(R.id.button4);

        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent constraint_layout = new Intent(getApplicationContext(), ConstraintActivity.class);
                startActivity(constraint_layout);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent constraint_layout = new Intent(getApplicationContext(), Lab1Q3.class);
                startActivity(constraint_layout);
            }
        });
    }
}