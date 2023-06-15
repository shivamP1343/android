package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Lab2Q2 extends AppCompatActivity {
    private EditText nameEditText;
    private EditText emailEditText;
    private RadioGroup genderRadioGroup;
    private EditText ageEditText;
    private EditText websiteEditText;
    private Button submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_q2);

        nameEditText = findViewById(R.id.editTextName);
        emailEditText = findViewById(R.id.editTextEmail);
        genderRadioGroup = findViewById(R.id.radioGroupGender);
        ageEditText = findViewById(R.id.editTextAge);
        websiteEditText = findViewById(R.id.editTextWebsite);
        submitButton = findViewById(R.id.buttonSubmit);
        resultTextView = findViewById(R.id.textViewResult);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayInformation();
            }
        });
    }
    private void displayInformation() {
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        int selectedGenderId = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton selectedGenderRadioButton = findViewById(selectedGenderId);
        String gender = selectedGenderRadioButton != null ? selectedGenderRadioButton.getText().toString() : "";
        String age = ageEditText.getText().toString().trim();
        String website = websiteEditText.getText().toString().trim();

        StringBuilder information = new StringBuilder();
        information.append("Name: ").append(name).append("\n");
        information.append("Email: ").append(email).append("\n");
        information.append("Gender: ").append(gender).append("\n");
        information.append("Age: ").append(age).append("\n");
        information.append("Website: ").append(website);

        resultTextView.setText(information.toString());
    }
}