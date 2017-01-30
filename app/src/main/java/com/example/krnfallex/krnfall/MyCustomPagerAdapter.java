package com.example.krnfallex.krnfall;


import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MyCustomPagerAdapter extends PagerAdapter{
    Context context;
    //int images[];
    ArrayList<Bitmap> imageBitmap;
    LayoutInflater layoutInflater;


    //public MyCustomPagerAdapter(Context context, int images[]) {
     //   this.context = context;
       // this.images = images;
       // layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    //}

    public MyCustomPagerAdapter(Context context, ArrayList<Bitmap> imageBitmap) {
        this.context = context;
        this.imageBitmap = imageBitmap;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageBitmap.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = layoutInflater.inflate(R.layout.itemimageslide, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        //imageView.setImageResource(images[position]);
        imageView.setImageBitmap(imageBitmap.get(position));

        container.addView(itemView);

        //listening to image click
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "you clicked image " + (position + 1), Toast.LENGTH_LONG).show();
            }
        });

        return itemView;
    }

    //@Override
    //public Object instantiateItem(ViewGroup container, final int position) {
        //View itemView = layoutInflater.inflate(R.layout.itemimageslide, container, false);

        //ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        //imageView.setImageResource(images[position]);

        //container.addView(itemView);

        //listening to image click
        //imageView.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //Toast.makeText(context, "you clicked image " + (position + 1), Toast.LENGTH_LONG).show();
            //}
        //});

        //return itemView;
    //}

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
