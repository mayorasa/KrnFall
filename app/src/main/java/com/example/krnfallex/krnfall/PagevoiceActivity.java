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
                    if (text.equals("น้ำตกเอราวัณ") || text.contains("เอรา"))
                    {
                        intent = new Intent(PagevoiceActivity.this, PageInfoActivity.class);
                        intent.putExtra("waterfall_id", 18);
                        startActivity(intent);
                        //startActivity(new Intent(PagevoiceActivity.this,PageInfoActivity.class));
                    }
                    else if (text.equals("Erawan waterfall"))
                    {
                        startActivity(new Intent(PagevoiceActivity.this,page6Activity.class));
                    }
                }

                    break;
                }

        }
    }
}