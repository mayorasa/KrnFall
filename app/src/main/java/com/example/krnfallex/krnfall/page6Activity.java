package com.example.krnfallex.krnfall;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;


public class page6Activity extends AppCompatActivity {

    ArrayList<byte[]> listImage;
    ArrayList<int[]> a;
    byte[] myImage;
    ViewPager viewPager;
    //ImageView imageView;
    int images[] = {R.drawable.pig1, R.drawable.pig2, R.drawable.pig3};
    MyCustomPagerAdapter myCustomPagerAdapter;
    WaterfallimageTable waterfallimageTable;
    ArrayList<Bitmap> bitmapArray;

    public void titleview(View v) {
        //TextView text = (TextView) findViewById(R.id.textView5);

        //text.setText(R.string.txth1);
        //viewPager = (ViewPager)findViewById(R.id.viewPager);

        //myCustomPagerAdapter = new MyCustomPagerAdapter(page6Activity.this, images);
        //viewPager.setAdapter(myCustomPagerAdapter);

        // TextView text2 = (TextView) findViewById(R.id.textView4);
        //text2.setText(R.string.txt_null);


        // ImageView kuysah = (ImageView) findViewById(R.id.viewPager);
        // kuysah.setVisibility(View.VISIBLE);

        //viewPager = (ViewPager)findViewById(R.id.viewPager);
        //viewPager.setVisibility(View.GONE);

    }


    ImageButton b;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        waterfallimageTable = new WaterfallimageTable(this);
        bitmapArray = new ArrayList<Bitmap>();

        b=(ImageButton) findViewById(R.id.imageButtoncall);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0955908383"));
                startActivity(callIntent);

            }
        });
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        //imageView = (ImageView)findViewById(R.id.eiei);

        listImage = waterfallimageTable.getListImage(1);
        //listImage.get(0);
        //myImage = listImage.get(0);
        byte[] byteArray = listImage.get(1);
        byte[] byteArray2 = listImage.get(2);
        Bitmap bm = BitmapFactory.decodeByteArray(byteArray, 0 ,byteArray.length);
        Bitmap bm2 = BitmapFactory.decodeByteArray(byteArray2, 0 ,byteArray2.length);

        bitmapArray.add(bm);
        bitmapArray.add(bm2);

        //Log.d("Bloblength", String.valueOf(byteArray.length));
        //imageView.setImageBitmap(BitmapFactory.decodeByteArray(byteArray, 0 ,byteArray.length));



        myCustomPagerAdapter = new MyCustomPagerAdapter(page6Activity.this, bitmapArray);
        viewPager.setAdapter(myCustomPagerAdapter);


    }
    public void clickreternerawaneng(View view) {
        startActivity(new Intent(page6Activity.this, page3Activity.class));

    }
    public void clickmapapi(View view) {
        //startActivity(new Intent(page6Activity.this, MapsActivity.class));

    }
    public void clicyoutube1(View view) {
        startActivity(new Intent(page6Activity.this, youtube.class));
    }
    public void infomation(View v) {

        TextView text = (TextView) findViewById(R.id.textView5);

        text.setText(R.string.txeng2);

        TextView text2 = (TextView) findViewById(R.id.textView4);
        text2.setText(R.string.txth3);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setVisibility(View.VISIBLE);


    }


}
