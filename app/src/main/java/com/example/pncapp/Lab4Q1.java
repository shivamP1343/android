package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class Lab4Q1 extends AppCompatActivity {
    private static final String API_BASE_URL = "http://localhost:5000/api/data";
    private TextView tvDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_q1);

        tvDataList = findViewById(R.id.tvDataList);
        Button btnStoreData = findViewById(R.id.btnStoreData);
        Button btnListData = findViewById(R.id.btnListData);

        btnStoreData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storeData();
            }
        });

        btnListData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listData();
            }
        });
    }

    private void storeData() {
        // Implement the code to send a POST request to store data
        // You can use a library like Gson to convert objects to JSON
        // and OkHttpClient to make the HTTP request

    }

    private void listData() {
        // Implement the code to send a GET request to retrieve and list data
        // You can use OkHttpClient to make the HTTP request and update the TextView
    }
}