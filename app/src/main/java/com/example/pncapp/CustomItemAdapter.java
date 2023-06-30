package com.example.pncapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomItemAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] title;
    String[] price;
    int[] image;

    public CustomItemAdapter(Activity context, String[] title, String[] price, int[] image) {
        super(context, R.layout.custom_list, title);
        this.context = context;
        this.title = title;
        this.price = price;
        this.image = image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowv = inflater.inflate(R.layout.custom_list, null, true);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtTitle = rowv.findViewById(R.id.title);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = rowv.findViewById(R.id.image);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtdes = rowv.findViewById(R.id.price);
        Log.d("test",title[position]);
        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtdes.setText(price[position]);
        return rowv;
    }
}