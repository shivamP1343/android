package com.example.pncapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class Lab3Q5 extends AppCompatActivity {
    private EditText edtId, edtName, edtEmail, edtPhone, edtMessage;
    private Button btnInsert,  btnSelect,btnUpdate,  btnDelete;
    TextView txtData;
    DatabaseHelper1 myDbHelper;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_q5);
        //creating object of MyDbHelper class
        myDbHelper=new DatabaseHelper1(this);
        edtId = findViewById(R.id.edtId);
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPhone = findViewById(R.id.edtPhone);
        edtMessage = findViewById(R.id.edtMessage);

        btnInsert = findViewById(R.id.btnInsert);
        btnSelect = findViewById(R.id.btnSelect);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        txtData=findViewById(R.id.txtData);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=Integer.parseInt(edtId.getText().toString());
                String name=edtName.getText().toString();
                String email =edtEmail.getText().toString();
                String phone =edtPhone.getText().toString();
                String message =edtMessage.getText().toString();
               //calling insert function
                myDbHelper.insertData(id,name,email,phone,message);
                Toast.makeText(getApplicationContext(),"Data Inserted Successfully !", Toast.LENGTH_SHORT).show();
            }
        });
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //retrieving data
                int id=0;
                String name="",email="",phone="",message="";
                //calling select function
                Cursor cursor=myDbHelper.getAllData();
                while (cursor.moveToNext()){
                    id=cursor.getInt(0);
                    name=cursor.getString(1);
                    email=cursor.getString(2);
                    phone=cursor.getString(3);
                    message=cursor.getString(4);
                }
                 //displaying data in TextView
                txtData.setText("Id="+id+"\t Name="+name+"\tEmail=" +email+"\tPhone=" +phone+"\tMessage=" +message);
            }
        });
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=edtId.getText().toString();
                String name=edtName.getText().toString();
                String email=edtEmail.getText().toString();
                String phone=edtPhone.getText().toString();
                String message=edtMessage.getText().toString();
//calling insert function
                myDbHelper.updateData(id,name,email,phone,message);
                Toast.makeText(getApplicationContext(),"Data Updated Successfully !",Toast.LENGTH_SHORT).show();
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id=edtId.getText().toString();
                //calling delete function
                myDbHelper.deleteData(id);
                Toast.makeText(getApplicationContext(),"Data Deleted Successfully !",Toast.LENGTH_SHORT).show();
            }
        });
    }

}