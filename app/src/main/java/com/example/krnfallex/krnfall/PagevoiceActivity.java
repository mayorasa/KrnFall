package com.example.krnfallex.krnfall;

import android.content.ActivityNotFoundException;
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

public class PagevoiceActivity extends AppCompatActivity {


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

    /**
     * Start speech to text intent. This opens up Google Speech Recognition API dialog box to listen the speech input.
     * */
    private void startSpeechToText() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "th-TH");
        startActivityForResult(intent, SPEECH_RECOGNITION_CODE);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
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
                    if (text.equals("น้ำตกตะเคียนทอง") || text.contains("ตะเคียน"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 1);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกไดช่องถ่อง") || text.contains("ไดช่อง"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 2);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกเกริงกระเวีย") || text.contains("เกริงกระเวีย"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 3);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกเขาใหญ่") || text.contains("เขาใหญ่"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 4);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกคลิตี้") || text.contains("คลิตี้"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 5);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกกระเต็งเจ็ง") || text.contains("กระเต็ง"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 6);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกจ๊อกกระดิ่น") || text.contains("จ๊อกกระดิ่น"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 7);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกห้วยแม่ขมิ้น") || text.contains("แม่ขมิ้น"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 8);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกผาแป") || text.contains("ผาแป"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 9);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกโป่งกระดังงา") || text.contains("โป่งกระดังงา"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 10);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกดิบใหญ่") || text.contains("ดิบใหญ่"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 11);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกทุ่งนางครวญ") || text.contains("นางครวญ"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 12);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกปิเต็ง") || text.contains("ปิเต็ง"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 13);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกไตรตรึงษ์") || text.contains("ไตรตรึงษ์"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 14);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกผาลาด") || text.contains("ผาลาด"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 15);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกผาตาด") || text.contains("ผาตาด"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 16);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกธารเงิน-ธารเทอง") || text.contains("ธารเงิน") || text.contains("ธารทอง"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 17);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกเอราวัณ") || text.contains("อารา"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 18);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกไทรโยคใหญ่") || text.contains("ไทรโยคใหญ่"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 19);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกไทรโยคน้อย") || text.contains("ไทรโยคน้อย"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 20);
                        startActivity(intent);

                    }
                    else if (text.equals("น้ำตกผาสวรรค์") || text.contains("ผาสวรรค์"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 21);
                        startActivity(intent);

                    }
                }

                    break;
                }

        }
    }
}