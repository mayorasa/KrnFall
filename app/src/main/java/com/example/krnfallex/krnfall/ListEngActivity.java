package com.example.krnfallex.krnfall;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.pdf.PdfDocument;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListEngActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter listAdapter;
    WaterfallInfoTable waterfallnfoTable;
    ArrayList<HashMap<String, Object>> ListEngActivity;
    String name_eng ;
    int waterfall_id;
    SQLiteDatabase db;
    ImageView listmg;
    private MyDatabase myDatabase;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        setContentView(R.layout.activity_list_eng);
        listView = (ListView) findViewById(R.id.listView);
        waterfallnfoTable = new WaterfallInfoTable(this);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                waterfall_id = Integer.parseInt(ListEngActivity.get(i).get(waterfallnfoTable.waterfall_id).toString());
                name_eng = ListEngActivity.get(i).get(waterfallnfoTable.name_eng).toString();
                Intent intent;
                intent = new Intent(ListEngActivity.this, PageInfoEngActivity.class);
                intent.putExtra("waterfall_id", waterfall_id);
                startActivity(intent);

            };

        });
        ListEngActivity = waterfallnfoTable.getImageEng();

        listAdapter = new SimpleAdapter(ListEngActivity.this, ListEngActivity, R.layout.falllist, new String[]{waterfallnfoTable.listmg,waterfallnfoTable.name_eng}, new int[]{R.id.listmg,});

        listView.setAdapter(listAdapter);

        editText1 = (EditText)findViewById(R.id.editText);
        editText1.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable arg0) {
                //ArrayList<String, String> src_list = new ArrayList<String, string>();
                ArrayList<HashMap<String, Object>> src_list = new ArrayList<HashMap<String, Object>>();
                //ArrayList<HashMap<String, Objects>> src_list = new ArrayList<HashMap<String, Objects>>();
                int textlength = editText1.getText().length();
                if (textlength > 0) {
                    for (int i = 0; i < ListEngActivity.size(); i++) {
                        try {
                            HashMap<String, Object> hm = new HashMap<String, Object>();
                            if (containsIgnoreCase(ListEngActivity.get(i).get(waterfallnfoTable.name_eng).toString(), editText1.getText().toString())) {
                                hm.put("listmg", Integer.toString(waterfallnfoTable.imgsListEng[i]));
                                src_list.add(hm);
                            }
                        } catch (Exception e) {
                        }
                    }

                    listAdapter = new SimpleAdapter(ListEngActivity.this, src_list, R.layout.falllist, new String[]{waterfallnfoTable.listmg, waterfallnfoTable.name_eng}, new int[]{R.id.listmg,});
                    listView.setAdapter(listAdapter);
                }
                else
                {
                    listAdapter = new SimpleAdapter(ListEngActivity.this, ListEngActivity, R.layout.falllist, new String[]{waterfallnfoTable.listmg,waterfallnfoTable.name_eng}, new int[]{R.id.listmg,});
                    listView.setAdapter(listAdapter);
                }

            }
            public void beforeTextChanged(CharSequence s, int start
                    , int count, int after) { }
            public void onTextChanged(CharSequence s, int start
                    , int before, int count) { }

        });


    }

    public boolean containsIgnoreCase( String nameeng, String search_nameeng ) {
        if(search_nameeng.equals(""))
            return true;
        if(nameeng == null || search_nameeng == null || nameeng .equals(""))
            return false;

        Pattern p = Pattern.compile(search_nameeng,Pattern.CASE_INSENSITIVE+Pattern.LITERAL);
        Matcher m = p.matcher(nameeng);
        return m.find();
    }

    public Bitmap getImageEng(int i){

        String qu = "select listmg waterfall table where feedid=" + i ;
        Cursor cur = db.rawQuery(qu, null);

        if (cur.moveToFirst()){
            byte[] imgByte = cur.getBlob(0);
            cur.close();
            return BitmapFactory.decodeByteArray(imgByte, 0, imgByte.length);
        }
        if (cur != null && !cur.isClosed()) {
            cur.close();
        }

        return null ;
    }

    public void clickvoicelistth(View view) {
        startActivity(new Intent(ListEngActivity.this, PagevoiceActivity.class));
    }
    public void listmap(View view) {
        Intent intent;
        intent = new Intent(ListEngActivity.this, MapsActivity.class);
        intent.putExtra("waterfall_id", waterfall_id);
        intent.putExtra("name_eng", name_eng);
        startActivity(intent);





    }
    public void buttonback(View view) {
        startActivity(new Intent(ListEngActivity.this, MainActivity.class));
    }
}