package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        Button btn=findViewById(R.id.btnRegister);
        Button btn1=findViewById(R.id.btnBack);
        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent table_layout = new Intent(getApplicationContext(), TableLayout.class);
                startActivity(table_layout);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent table_layout = new Intent(getApplicationContext(), Lab1Q3.class);
                startActivity(table_layout);
            }
        });
    }
}