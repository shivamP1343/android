package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbsoulteLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absoulte_layout);

        Button btn=findViewById(R.id.register_button);
        Button btn1=findViewById(R.id.back_button);
        //adding click event and listener
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent absoulte_layout = new Intent(getApplicationContext(), AbsoulteLayout.class);
                startActivity(absoulte_layout);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//displaying message
                Intent absoulte_layout = new Intent(getApplicationContext(), Lab1Q3.class);
                startActivity(absoulte_layout);
            }
        });
    }
}