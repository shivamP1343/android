package com.example.pncapp;
import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.CollationElementIterator;
import java.util.Calendar;

public class Lab1Q5 extends AppCompatActivity {
    EditText edtName,edtpassword,edtaddress,date,edtage;
    RadioButton radMale,radFemale;
    Spinner spProgram;
    Button btnSubmit;
    TextView txtResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_q5);
        edtName=findViewById(R.id.edtName);
        edtpassword=findViewById(R.id.edtPassword);
        edtaddress=findViewById(R.id.edtAddress);
        radMale=findViewById(R.id.maleRadioButton);
        radFemale=findViewById(R.id.femaleRadioButton);
        spProgram=findViewById(R.id.stateSpinner);
        date = (EditText) findViewById(R.id.date);
        edtage=findViewById(R.id.editTextAge);
        btnSubmit=findViewById(R.id.btnSubmit);
        txtResult=findViewById(R.id.textViewData);
        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Get the entered data
                String userName = edtName.getText().toString().trim();
                String password = edtpassword.getText().toString().trim();
                String address = edtaddress.getText().toString().trim();
                String gender = " ";
                if(radMale.isChecked())
                    gender ="Male";
                else
                    gender="Female";
                int age = Integer.parseInt(edtage.getText().toString().trim());
                String dateOfBirth = date.getText().toString().trim();
                String state = spProgram.getSelectedItem().toString();

                // Create the result string
                StringBuilder result = new StringBuilder();
                result.append("User Name: ").append(userName).append("\n");
                result.append("Password: ").append(password).append("\n");
                result.append("Address: ").append(address).append("\n");
                result.append("Gender: ").append(gender).append("\n");
                result.append("Age: ").append(age).append("\n");
                result.append("Date of Birth: ").append(dateOfBirth).append("\n");
                result.append("State: ").append(state);

                // Display the result
                txtResult.setText(result.toString());
            }

        });
    }
}