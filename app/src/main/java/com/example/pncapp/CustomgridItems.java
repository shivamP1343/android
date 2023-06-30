package com.example.pncapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;

public class CustomgridItems extends AppCompatActivity {
    GridView gridView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customgrid_items);

        gridView =findViewById(R.id.mygrid);
// creating arrays
        String[] title={
                "Title 1", "Title 2",
                "Title 3", "Title 4","Title 5"};
        String[] price={
                "300",
                "400",
                "500",
                "600",
                "700"
        };
        int[] image={
//Replace with different images
                R.drawable.baseline_apps_24,
                R.drawable.baseline_apps_24,
                R.drawable.baseline_apps_24,
                R.drawable.baseline_apps_24,
                R.drawable.baseline_apps_24
        };
//passing arrays to constructor of MyListAdapter
        MyGridAdapter adapter=new MyGridAdapter
                (this,title,price,image);
        gridView.setAdapter(adapter);

    }
}