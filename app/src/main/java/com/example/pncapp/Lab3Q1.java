package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lab3Q1 extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_q1);

        list=findViewById(R.id.mylist);
        String hardwares[]={"Shivam","Satyam","Suman","Sumit","Sunil","Sese","Sauju","Sushant"};
        final ArrayAdapter adapter= new ArrayAdapter<String>(this, R.layout.list_item,R.id.listtext,hardwares);
        list.setAdapter(adapter);
        //add event into list view
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String val= (String) adapter.getItem(position);
                Toast.makeText(Lab3Q1.this, val, Toast.LENGTH_LONG).show();
            }
        });
    }
}