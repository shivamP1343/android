package com.example.pncapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] title;
    String[] price;
    int[] image;
    public MyGridAdapter(Activity context, String[] title, String[]
            price, int[] image) {
        //ArrayAdapter needs String so we are supplying title
        super(context, R.layout.customgrid_items,title);
        this.context=context;
        this.title=title;
        this.price=price;
        this.image=image;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.customgrid_items,
                null,true);
//wiring widgets
        TextView txtTitle = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById
                (R.id.image);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtPrice = (TextView) rowView.findViewById
                (R.id.price);
        txtTitle.setText(title[position]);
        imageView.setImageResource(image[position]);
        txtPrice.setText(price[position]);
        return rowView;
    };
}
