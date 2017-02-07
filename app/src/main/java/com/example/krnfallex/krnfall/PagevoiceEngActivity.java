package com.example.krnfallex.krnfall;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class PagevoiceEngActivity extends AppCompatActivity {

    private final int SPEECH_RECOGNITION_CODE = 1;

    private TextView txtOutput;
    private ImageButton btnMicrophone;
    WaterfallInfoTable waterfallnfoTable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagevoice);

        waterfallnfoTable = new WaterfallInfoTable(this);

        txtOutput = (TextView) findViewById(R.id.txt_output);
        btnMicrophone = (ImageButton) findViewById(R.id.btn_mic);

        btnMicrophone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startSpeechToText();
            }
        });
    }

    //font
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }

    /**
     * Start speech to text intent. This opens up Google Speech Recognition API dialog box to listen the speech input.
     * */
    private void startSpeechToText() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,"th-TH");
        startActivityForResult(intent, SPEECH_RECOGNITION_CODE);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Speak something...");
        try {
            startActivityForResult(intent, SPEECH_RECOGNITION_CODE);
        } catch (ActivityNotFoundException a) {

            Intent your_browser_intent = new Intent(Intent.ACTION_VIEW,

                    Uri.parse("https://market.android.com/details?id=APP_PACKAGE_NAME"));
            startActivity(your_browser_intent);
//			Toast.makeText(getApplicationContext(),
//					"Sorry! Speech recognition is not supported in this device.",
//					Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Callback for speech recognition activity
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case SPEECH_RECOGNITION_CODE: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String text = result.get(0);
                    txtOutput.setText(text);

                    Intent intent;

                    //if (text.equals("น้ำตกเอราวัณ"))
                    if (text.equals("ตะเคียนทอง waterfall") || text.contains("ตะเคียน"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 1);
                        startActivity(intent);

                    }
                    else if (text.equals("ไดช่องถ่อง waterfall") || text.contains("ไดช่อง"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 2);
                        startActivity(intent);

                    }
                    else if (text.equals("เกริงกระเวีย waterfall") || text.contains("เกริงกระเวีย"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 3);
                        startActivity(intent);

                    }
                    else if (text.equals("เขาใหญ่ waterfall") || text.contains("เขาใหญ่"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 4);
                        startActivity(intent);

                    }
                    else if (text.equals("คลิตี้ waterfall") || text.contains("คลิตี้"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 5);
                        startActivity(intent);

                    }
                    else if (text.equals("กระเต็งเจ็ง waterfall") || text.contains("กระเต็ง"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 6);
                        startActivity(intent);

                    }
                    else if (text.equals("จ๊อกกระดิ่น waterfall") || text.contains("จ๊อกกระดิ่น"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 7);
                        startActivity(intent);

                    }
                    else if (text.equals("ห้วยแม่ขมิ้น waterfall") || text.contains("แม่ขมิ้น"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 8);
                        startActivity(intent);

                    }
                    else if (text.equals("ผาแป waterfall") || text.contains("ผาแป"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 9);
                        startActivity(intent);

                    }
                    else if (text.equals("โป่งกระดังงา waterfall") || text.contains("โป่งกระดังงา"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 10);
                        startActivity(intent);

                    }
                    else if (text.equals("ดิบใหญ่ waterfall") || text.contains("ดิบใหญ่"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 11);
                        startActivity(intent);

                    }
                    else if (text.equals("ทุ่งนางครวญ waterfall") || text.contains("นางครวญ"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 12);
                        startActivity(intent);

                    }
                    else if (text.equals("ปิเต็ง waterfall") || text.contains("ปิเต็ง"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 13);
                        startActivity(intent);

                    }
                    else if (text.equals("ไตรตรึงษ์ waterfall") || text.contains("ไตรตรึงษ์"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 14);
                        startActivity(intent);

                    }
                    else if (text.equals("ผาลาด waterfall") || text.contains("ผาลาด"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 15);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกผาตาด") || text.contains("ผาตาด"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 16);
                        startActivity(intent);

                    }
                    else if (text.equals("ธารเงิน-ธารเทอง waterfall") || text.contains("ธารเงิน") || text.contains("ธารทอง"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 17);
                        startActivity(intent);

                    }
                    else if (text.equals("เอราวัณ waterfall") || text.contains("อารา") || text.contains("erawan"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 18);
                        startActivity(intent);

                    }
                    else if (text.equals("ไทรโยคใหญ่ waterfall") || text.contains("ไทรโยคใหญ่"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 19);
                        startActivity(intent);

                    }
                    else if (text.equals("ไทรโยคน้อย waterfall") || text.contains("ไทรโยคน้อย"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 20);
                        startActivity(intent);

                    }
                    else if (text.equals("ผาสวรรค์ waterfall") || text.contains("ผาสวรรค์"))
                    {
                        intent = new Intent(PagevoiceEngActivity.this, PageInfoEngActivity.class);
                        intent.putExtra("waterfall_id", 21);
                        startActivity(intent);

                    }
                }

               // break;
            }

        }
    }
}