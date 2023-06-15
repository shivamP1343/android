package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab1Q6 extends AppCompatActivity {
    private static String value;
    public static String getValue() {
        return value;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_q6);
        final EditText editText = findViewById(R.id.edit_text);
        Button b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View v) {
                String value = editText.getText().toString().trim();
                Intent i = new Intent(Lab1Q6.this, SecondActivity.class);
                i.putExtra("value", value); // Pass the value to the second activity
                startActivity(i);
            }
        });
    }
}