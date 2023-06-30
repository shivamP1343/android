package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Lab3Q3 extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_q3);
        list=findViewById(R.id.mylist);
        String [] title={"Title 1","Title 2","Title 3","Title 4","Title 5"};
        String [] price={"350","450", "550", "600","700"};
        int [] image={R.drawable.baseline_apps_24,R.drawable.baseline_apps_24,R.drawable.baseline_apps_24,R.drawable.baseline_apps_24,R.drawable.baseline_apps_24};
        CustomItemAdapter adapter= new CustomItemAdapter(this, title, price, image);
        list.setAdapter(adapter);
    }
}