package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecycleView extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        recyclerView=findViewById(R.id.recyleview);
        String name[]={"Shivam","Sumit","Sunil","SeSe","Sauju"};
        String Address[]={"Lalitpur","mnr","ktm","ktm","Lalitpur"};
        int image[]={R.drawable.baseline_apps_24,R.drawable.baseline_apps_24,
                R.drawable.baseline_apps_24,R.drawable.baseline_apps_24,
                R.drawable.baseline_apps_24};
        //setting Linear Layout in recycler view
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //passing array to adapter class.
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(this,name,Address,image);
        recyclerView.setAdapter(adapter);

    }
}