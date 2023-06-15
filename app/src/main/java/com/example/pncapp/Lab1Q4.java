package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab1Q4 extends AppCompatActivity {
    private EditText nameEditText;
    private Button okButton;
    private TextView messageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_q4);

        nameEditText = findViewById(R.id.nameEditText);
        okButton = findViewById(R.id.okButton);
        messageTextView = findViewById(R.id.messageTextView);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String message = "Hello, " + name + "!";
                messageTextView.setText(message);
            }
        });
    }
}