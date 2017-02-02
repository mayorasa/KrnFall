package com.example.krnfallex.krnfall;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.transition.Visibility;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

import static com.example.krnfallex.krnfall.R.id.frameLayout3;
import static com.example.krnfallex.krnfall.R.id.youtubeplayerfragment;

public class PageInfoActivity extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener{

    WaterfallSeason waterfallSeason;
    WaterfallimageTable waterfallimageTable;
    WaterfallInfoTable waterfallInfoTable;
    HashMap<String, String> infodetail;
    HashMap<String, Integer> infoseason;
    TextView in_nameth, in_genaralth, in_historyth, in_feeth, in_travelth, in_url360, in_video_path, in_tellophone;
    Double tatal;
    EditText editCal_Total;
    SimpleDateFormat df_show;
    ImageButton mDialogSimple;
    String numberPhone,urlvedio;

    MyCustomPagerAdapter myCustomPagerAdapter;
    ArrayList<byte[]> listImage;
    ArrayList<Bitmap> bitmapArray;
    ViewPager viewPager;
    CheckBox checkBox;
    LinearLayout linearLayout;

    CheckBox checkBox1,checkBox2,checkBox3;
    ImageButton imageButton7,imageButton8,imageButtoncallth;

    public static final String DEVELOPER_KEY = "AIzaSyB9aLqLwp2-N_W18nWDQEPUhrdmOKij8iw";
    private static String VIDEO_ID;
    private static final int RECOVERY_DIALOG_REQUEST = 1;
    YouTubePlayerFragment myYouTubePlayerFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_info);


        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButtoncallth = (ImageButton) findViewById(R.id.imageButtoncallth);


        //YouTube
        myYouTubePlayerFragment = (YouTubePlayerFragment)getFragmentManager()
                .findFragmentById(youtubeplayerfragment);
        myYouTubePlayerFragment.initialize(DEVELOPER_KEY, this);
        //end myYouTubePlayerFragment


       // waterfallSeason.GetName();



        waterfallimageTable = new WaterfallimageTable(this);
        bitmapArray = new ArrayList<Bitmap>();
        waterfallInfoTable = new WaterfallInfoTable(this);



        viewPager = (ViewPager)findViewById(R.id.viewPager);

        linearLayout = (LinearLayout)findViewById(R.id.layoutyoutube);


        //รับค่าแต่ละหน้า Show id
        Intent intent2 = getIntent();
        final int waterfall_id = intent2.getIntExtra("waterfall_id", 0);

        waterfallSeason = new WaterfallSeason(this);
        infoseason = waterfallSeason.GetName(waterfall_id);

        Log.d("display_name", "My name is :  ==> " + infoseason.get("Summer_season"));
        Log.d("display_name", "My name is :  ==> " + infoseason.get("Winter_season"));
        Log.d("display_name", "My name is :  ==> " + infoseason.get("Rain_season"));

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        if (infoseason.get("Summer_season") == 0)
        {
            checkBox1.setChecked(true);
        }
        else
        {
            checkBox1.setChecked(false);
        }
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        if (infoseason.get("Winter_season") == 0)
        {
            checkBox2.setChecked(true);
        }
        else
        {
            checkBox2.setChecked(false);
        }
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        if (infoseason.get("Rain_season") == 0)
        {
            checkBox3.setChecked(true);
        }
        else
        {
            checkBox3.setChecked(false);
        }

        infodetail = waterfallInfoTable.WalterfallInfo(waterfall_id);

        urlvedio = infodetail.get("videoth_path");
        VIDEO_ID = urlvedio;

        in_nameth = (TextView) findViewById(R.id.namefallth);
        in_genaralth = (TextView) findViewById(R.id.txtgeneralth);
        in_feeth = (TextView) findViewById(R.id.txtfeeth);



        in_nameth.setText(infodetail.get("name_th"));
        in_genaralth.setText(infodetail.get("genaral_th"));

        Log.d("28janV1", "ทดสอบการ Get ชื่อน้ำตก ==> " + infodetail.get("name_th"));
        Log.d("28janV1", "ทดสอบการ Get Lat ==> " + infodetail.get("latitude"));
        Log.d("28janV1", "ทดสอบการ Get Lng ==> " + infodetail.get("longitude"));


        RelativeLayout d = (RelativeLayout) findViewById(R.id.imgbg);

        if (waterfall_id == 1) {
            d.setBackgroundResource(R.drawable.pagelsth1);
        }

        if (waterfall_id == 2) {
            d.setBackgroundResource(R.drawable.pagelsth2);
        }
        if (waterfall_id == 2) {
            d.setBackgroundResource(R.drawable.pagelsth2);
        }
        if (waterfall_id == 3) {
            d.setBackgroundResource(R.drawable.pagelsth3);
        }
        if (waterfall_id == 4) {
            d.setBackgroundResource(R.drawable.pagelsth4);
        }
        if (waterfall_id == 5) {
            d.setBackgroundResource(R.drawable.pagelsth5);
        }
        if (waterfall_id == 6) {
            d.setBackgroundResource(R.drawable.pagelsth6);
        }
        if (waterfall_id == 7) {
            d.setBackgroundResource(R.drawable.pagelsth7);
        }
        if (waterfall_id == 8) {
            d.setBackgroundResource(R.drawable.pagelsth8);
        }
        if (waterfall_id == 9) {
            d.setBackgroundResource(R.drawable.pagelsth9);
        }
        if (waterfall_id == 10) {
            d.setBackgroundResource(R.drawable.pagelsth10);
        }
        if (waterfall_id == 11) {
            d.setBackgroundResource(R.drawable.pagelsth11);
        }
        if (waterfall_id == 12) {
            d.setBackgroundResource(R.drawable.pagelsth12);
        }
        if (waterfall_id == 13) {
            d.setBackgroundResource(R.drawable.pagelsth13);
        }
        if (waterfall_id == 14) {
            d.setBackgroundResource(R.drawable.pagelsth14);
        }
        if (waterfall_id == 15) {
            d.setBackgroundResource(R.drawable.pagelsth15);
        }
        if (waterfall_id == 16) {
            d.setBackgroundResource(R.drawable.pagelsth16);
        }
        if (waterfall_id == 17) {
            d.setBackgroundResource(R.drawable.pagelsth17);
        }
        if (waterfall_id == 18) {
            d.setBackgroundResource(R.drawable.pagelsth18);
        }
        if (waterfall_id == 19) {
            d.setBackgroundResource(R.drawable.pagelsth19);
        }
        if (waterfall_id == 20) {
            d.setBackgroundResource(R.drawable.pagelsth20);
        }
        if (waterfall_id == 21) {
            d.setBackgroundResource(R.drawable.pagelsth21);
        }



        mDialogSimple = (ImageButton) findViewById(R.id.imageButtoncallth);
        mDialogSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberPhone = infodetail.get("tellophone");

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(PageInfoActivity.this);
                builder.setMessage(numberPhone);
                builder.setPositiveButton("โทร", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:" + numberPhone));
                        startActivity(callIntent);
                    }
                });
                builder.setNegativeButton("ยกเลิก", null);
                builder.create();

                // สุดท้ายอย่าลืม show() ด้วย
                builder.show();

                imageButton7.setImageResource(R.drawable.icinfowhite);
                imageButton8.setImageResource(R.drawable.icstar);
                imageButtoncallth.setImageResource(R.drawable.icplayyellow);
            }
        });


        /////
        listImage = waterfallimageTable.getListImage(waterfall_id);
        for (int i=0; i < listImage.size(); i++)
        {
            byte[] byteArray2 = listImage.get(i);
            Bitmap bm = BitmapFactory.decodeByteArray(byteArray2, 0 ,byteArray2.length);
            bitmapArray.add(bm);
            //Log.d("Bloblength", String.valueOf(byteArray2.length));
        }

        ////
        myCustomPagerAdapter = new MyCustomPagerAdapter(PageInfoActivity.this, bitmapArray);
        viewPager.setAdapter(myCustomPagerAdapter);
    }   // Main Class

    public void clickGpsFall(View view) {

        Intent intent = new Intent(PageInfoActivity.this, GpsFall.class);
        intent.putExtra("NameFall", infodetail.get("name_th"));
        intent.putExtra("Lat", infodetail.get("latitude"));
        intent.putExtra("Lng", infodetail.get("longitude"));
        startActivity(intent);

    }   // click

    public void clickvitualreality(View view) {

        Intent intent = new Intent(PageInfoActivity.this, VirtualReality.class);
        intent.putExtra("FallName", infodetail.get("name_th"));
        intent.putExtra("urlvr", infodetail.get("url360"));
        startActivity(intent);

    }


    public void titleview(View v) {
        TextView text = (TextView) findViewById(R.id.txtgeneralth);
        in_genaralth.setText(infodetail.get("genaral_th"));
        TextView text2 = (TextView) findViewById(R.id.textView7);
        text2.setText(R.string.txt_null);
        TextView text3 = (TextView) findViewById(R.id.txtfeeth);
        text3.setText(R.string.txt_null);
        TextView text4 = (TextView) findViewById(R.id.textView7);
        text4.setText(R.string.txt_null);
        TextView text5 = (TextView) findViewById(R.id.texttravelth);
        text5.setText(R.string.txt_null);
        TextView text6 = (TextView) findViewById(R.id.txtseason);
        text6.setText(R.string.txt_null);

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setVisibility(View.GONE);

        linearLayout.setVisibility(View.VISIBLE);
        checkBox = (CheckBox) findViewById(R.id.checkBox1);
        checkBox.setVisibility(View.GONE);
        checkBox = (CheckBox) findViewById(R.id.checkBox2);
        checkBox.setVisibility(View.GONE);
        checkBox = (CheckBox) findViewById(R.id.checkBox3);
        checkBox.setVisibility(View.GONE);

        imageButton7.setImageResource(R.drawable.icinfo);
        imageButton8.setImageResource(R.drawable.icstar);
        imageButtoncallth.setImageResource(R.drawable.icplay);

    }

    public void historyth(View v) {
        in_historyth = (TextView) findViewById(R.id.txtgeneralth);
        in_historyth.setText(infodetail.get("history_th"));
        TextView text2 = (TextView) findViewById(R.id.textView7);
        text2.setText(R.string.txt_feeth);
        in_feeth = (TextView) findViewById(R.id.txtfeeth);
        in_feeth.setText(infodetail.get("fee_th"));
        TextView text3 = (TextView) findViewById(R.id.txtseason);
        text3.setText(R.string.txt_seasonth);
        checkBox = (CheckBox) findViewById(R.id.checkBox1);
        checkBox.setVisibility(View.VISIBLE);
        checkBox = (CheckBox) findViewById(R.id.checkBox2);
        checkBox.setVisibility(View.VISIBLE);
        checkBox = (CheckBox) findViewById(R.id.checkBox3);
        checkBox.setVisibility(View.VISIBLE);
        TextView text4 = (TextView) findViewById(R.id.textView8);
        text4.setText(R.string.txt_travelth);
        in_travelth = (TextView) findViewById(R.id.texttravelth);
        in_travelth.setText(infodetail.get("travel_th"));

        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setVisibility(View.VISIBLE);

        myYouTubePlayerFragment = (YouTubePlayerFragment)getFragmentManager()
                .findFragmentById(youtubeplayerfragment);

        linearLayout.setVisibility(View.GONE);
        imageButton7.setImageResource(R.drawable.icinfowhite);
        imageButton8.setImageResource(R.drawable.icstaryellow);
        imageButtoncallth.setImageResource(R.drawable.icplay);

    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }
    //การทำงานดึง api youtube ออกมาแสดง
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
            String errorMessage = String.format(
                    "There was an error initializing the YouTubePlayer (%1$s)",
                    errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }
    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }
    //End การทำงานดึง api youtube ออกมาแสดง


}




