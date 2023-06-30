package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lab3Q4 extends AppCompatActivity {
    private EditText usernameEditText, emailEditText, passwordEditText;
    private Button loginButton;
    private DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_q4);
        // databaseHelper.insertUser();
        usernameEditText = findViewById(R.id.usernameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        databaseHelper = new DatabaseHelper(this);
        AddData();
    }
    public  void AddData() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = databaseHelper.insertData(
                        usernameEditText .getText().toString(),
                        emailEditText.getText().toString(),
                        passwordEditText.getText().toString());
                // validating if the text fields are empty or not.
                if(isInserted == true)
                    Toast.makeText(Lab3Q4.this,"Login Success",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Lab3Q4.this,"Login Failed",Toast.LENGTH_LONG).show();
            }
        });
    }
}