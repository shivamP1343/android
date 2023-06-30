package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lab3Q6 extends AppCompatActivity {
    private EditText registrationUsernameEditText;
    private EditText registrationEmailEditText;
    private EditText registrationPasswordEditText;
    private EditText loginUsernameEditText;
    private EditText loginPasswordEditText;
    private Button registerButton;
    private Button loginButton;
    private DatabaseHelper2 databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_q6);

        registrationUsernameEditText = findViewById(R.id.registrationUsernameEditText);
        registrationEmailEditText = findViewById(R.id.registrationEmailEditText);
        registrationPasswordEditText = findViewById(R.id.registrationPasswordEditText);
        loginUsernameEditText = findViewById(R.id.loginUsernameEditText);
        loginPasswordEditText = findViewById(R.id.loginPasswordEditText);
        registerButton = findViewById(R.id.registerButton);
        loginButton = findViewById(R.id.loginButton);

        databaseHelper = new DatabaseHelper2(this);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = registrationUsernameEditText.getText().toString();
                String email = registrationEmailEditText.getText().toString();
                String password = registrationPasswordEditText.getText().toString();

                User user = new User(username, email, password);
                long id = databaseHelper.insertUser(user);
                if (id != -1) {
                    Toast.makeText(Lab3Q6.this, "Registration successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Lab3Q6.this, "Failed to register", Toast.LENGTH_SHORT).show();
                }

                clearRegistrationFields();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = loginUsernameEditText.getText().toString();
                String password = loginPasswordEditText.getText().toString();

                boolean userExists = databaseHelper.checkUserExists(username, password);
                if (userExists) {
                    Toast.makeText(Lab3Q6.this, "Login successful", Toast.LENGTH_SHORT).show();
                    // Proceed to the next screen or perform further actions
                } else {
                    Toast.makeText(Lab3Q6.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }

                clearLoginFields();
            }
        });
    }

    private void clearRegistrationFields() {
        registrationUsernameEditText.setText("");
        registrationEmailEditText.setText("");
        registrationPasswordEditText.setText("");
    }

    private void clearLoginFields() {
        loginUsernameEditText.setText("");
        loginPasswordEditText.setText("");
    }

}