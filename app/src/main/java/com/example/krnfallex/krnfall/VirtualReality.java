package com.example.krnfallex.krnfall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class VirtualReality extends AppCompatActivity {


    private String fallnamestring,urlvrstring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_reality);

        //setup
        fallnamestring  = getIntent().getStringExtra("FallName");
        urlvrstring  = getIntent().getStringExtra("urlvr");


        Log.d("1FebV1", "Name ==> " + fallnamestring);
        Log.d("1FebV1", "Name ==> " + urlvrstring);


        String video_path = urlvrstring;
        Uri uri = Uri.parse(video_path);

        // With this line the Youtube application, if installed, will launch immediately.
        // Without it you will be prompted with a list of the application to choose.
        uri = Uri.parse("vnd.youtube:"  + uri.getQueryParameter("v"));

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
