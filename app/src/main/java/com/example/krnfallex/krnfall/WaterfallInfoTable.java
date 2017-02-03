package com.example.krnfallex.krnfall;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by NarwhalZ on 6/1/2560.
 */
public class WaterfallInfoTable {

    private MyDatabase myDatabase;
    private SQLiteDatabase writeSQLite, readSQLite;

    public static final String waterfall_info = "waterfall_info";
    public static final String waterfall_id = "waterfall_id";
    public static final String name_th = "name_th";
    public static final String name_eng = "name_eng";
    public static final String genaral_th = "genaral_th";
    public static final String general_eng = "general_eng";
    public static final String history_th = "history_th";
    public static final String history_eng = "history_eng";
    public static final String fee_th = "fee_th";
    public static final String fee_eng = "eng";
    public static final String travel_th = "travel_th";
    public static final String travel_eng = "travel_eng";
    public static final String latitude = "latitude";
    public static final String longitude = "longitude";
    public static final String url360 = "url360";
    public static final String videoth_path = "videoth_path";
    public static final String videoeng_path = "videoeng_path";
    public static final String listmg = "listmg";
    public static final String tellophone = "tellophone";
    public Integer countImg = 0;

    public WaterfallInfoTable(Context context) {
        myDatabase = new MyDatabase(context);
        writeSQLite = myDatabase.getWritableDatabase();
        readSQLite = myDatabase.getReadableDatabase();
    }//Constructor


    //Add New Value
    public long addNewValueToSQLite(int int_idwaterfall, String str_nameth, String str_nameeng, String str_genaralth, String str_genaraleng,
                                    String str_historyth, String str_historyeng, String str_feeth, String str_feeeng, String str_travelth,
                                    String str_traveleng, String str_latitude, String str_longitude, String str_url360, String str_videothpath,String str_videoengpath,String str_tellophone) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(name_th, str_nameth);
        contentValues.put(name_eng, str_nameeng);
        contentValues.put(genaral_th, str_genaralth);
        contentValues.put(general_eng, str_genaraleng);
        contentValues.put(history_th, str_historyth);
        contentValues.put(history_eng, str_historyeng);
        contentValues.put(fee_th, str_feeth);
        contentValues.put(fee_eng, str_feeeng);
        contentValues.put(travel_th, str_travelth);
        contentValues.put(travel_eng, str_traveleng);
        contentValues.put(latitude, str_latitude);
        contentValues.put(longitude, str_longitude);
        contentValues.put(url360, str_url360);
        contentValues.put(videoth_path, str_videothpath);
        contentValues.put(videoeng_path, str_videoengpath);
        contentValues.put(tellophone, str_tellophone);
        long waterfall_Table_id = writeSQLite.insert(waterfall_info, null, contentValues);
        return waterfall_Table_id;
    }//Add New Value

    int[] imgsList = new int[]{
            R.drawable.listth1, R.drawable.listth2, R.drawable.listth3,
            R.drawable.listth4, R.drawable.listth5, R.drawable.listth6,
            R.drawable.listth7, R.drawable.listth8, R.drawable.listth9,
            R.drawable.listth10, R.drawable.listth11, R.drawable.listth12,
            R.drawable.listth13, R.drawable.listth14, R.drawable.listth15,
            R.drawable.listth16, R.drawable.listth17, R.drawable.listth18,
            R.drawable.listth19, R.drawable.listth20, R.drawable.listth21,
    };
    int[] imgsListEng = new int[]{
            R.drawable.listeng1, R.drawable.listeng2, R.drawable.listeng3,
            R.drawable.listeng4, R.drawable.listeng5, R.drawable.listeng6,
            R.drawable.listeng7, R.drawable.listeng8, R.drawable.listeng9,
            R.drawable.listeng10, R.drawable.listeng11, R.drawable.listeng12,
            R.drawable.listeng13, R.drawable.listeng14, R.drawable.listeng15,
            R.drawable.listeng16, R.drawable.listeng17, R.drawable.listeng18,
            R.drawable.listeng19, R.drawable.listeng20, R.drawable.listeng21,
    };

    public HashMap<String, String> WalterfallInfo(int id) {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        //String selectQuery = "SELECT * FROM " + waterfall_info + "WHERE waterfall_id=" + id;
        String selectQuery = "SELECT * FROM " + waterfall_info + " WHERE " + waterfall_id + " = " + id;
        HashMap<String, String> hm = new HashMap<String, String>();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {


                hm.put("waterfall_id", cursor.getString(cursor.getColumnIndex("waterfall_id")));
                hm.put("name_th", cursor.getString(cursor.getColumnIndex("name_th")));
                hm.put("name_eng", cursor.getString(cursor.getColumnIndex("name_eng")));
                hm.put("genaral_th", cursor.getString(cursor.getColumnIndex("genaral_th")));
                hm.put("general_eng", cursor.getString(cursor.getColumnIndex("general_eng")));
                hm.put("history_th", cursor.getString(cursor.getColumnIndex("history_th")));
                hm.put("history_eng", cursor.getString(cursor.getColumnIndex("history_eng")));
                hm.put("fee_th", cursor.getString(cursor.getColumnIndex("fee_th")));
                hm.put("fee_eng", cursor.getString(cursor.getColumnIndex("fee_eng")));
                hm.put("travel_th", cursor.getString(cursor.getColumnIndex("travel_th")));
                hm.put("travel_eng", cursor.getString(cursor.getColumnIndex("travel_eng")));
                hm.put("latitude", cursor.getString(cursor.getColumnIndex("latitude")));
                hm.put("longitude", cursor.getString(cursor.getColumnIndex("longitude")));
                hm.put("url360", cursor.getString(cursor.getColumnIndex("url360")));
                hm.put("videoth_path", cursor.getString(cursor.getColumnIndex("videoth_path")));
                hm.put("videoeng_path", cursor.getString(cursor.getColumnIndex("videoeng_path")));
                hm.put("tellophone", cursor.getString(cursor.getColumnIndex("tellophone")));
               // hm.put("tellophone", cursor.getString(cursor.getColumnIndex("tellophone")));


            } while (cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return hm;
    }

    // Image List ของภาษาอังกฤษ
    public ArrayList<HashMap<String, Object>> getImageEng() {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + waterfall_info  ;

        ArrayList<HashMap<String, Object>> waterfallList = new ArrayList<HashMap<String, Object>>();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, Object> hm = new HashMap<String, Object>();

                hm.put("waterfall_id", cursor.getString(cursor.getColumnIndex("waterfall_id")));
                hm.put("name_eng", cursor.getString(cursor.getColumnIndex("name_eng")));
                hm.put("general_eng", cursor.getString(cursor.getColumnIndex("general_eng")));
                hm.put("history_eng", cursor.getString(cursor.getColumnIndex("history_eng")));
                hm.put("fee_eng", cursor.getString(cursor.getColumnIndex("fee_eng")));
                hm.put("travel_eng", cursor.getString(cursor.getColumnIndex("travel_eng")));
                hm.put("latitude", cursor.getString(cursor.getColumnIndex("latitude")));
                hm.put("longitude", cursor.getString(cursor.getColumnIndex("longitude")));
                hm.put("url360", cursor.getString(cursor.getColumnIndex("url360")));
                hm.put("videoth_path", cursor.getString(cursor.getColumnIndex("videoth_path")));
                hm.put("videoeng_path", cursor.getString(cursor.getColumnIndex("videoeng_path")));

                if (countImg == 0) {
                    hm.put(listmg, Integer.toString(imgsListEng[0]));
                } else if (countImg == 1) {
                    hm.put(listmg, Integer.toString(imgsListEng[1]));
                } else if (countImg == 2) {
                    hm.put(listmg, Integer.toString(imgsListEng[2]));
                } else if (countImg == 3) {
                    hm.put(listmg, Integer.toString(imgsListEng[3]));
                } else if (countImg == 4) {
                    hm.put(listmg, Integer.toString(imgsListEng[4]));
                } else if (countImg == 5) {
                    hm.put(listmg, Integer.toString(imgsListEng[5]));
                } else if (countImg == 6) {
                    hm.put(listmg, Integer.toString(imgsListEng[6]));
                } else if (countImg == 7) {
                    hm.put(listmg, Integer.toString(imgsListEng[7]));
                } else if (countImg == 8) {
                    hm.put(listmg, Integer.toString(imgsListEng[8]));
                } else if (countImg == 9) {
                    hm.put(listmg, Integer.toString(imgsListEng[9]));
                } else if (countImg == 10) {
                    hm.put(listmg, Integer.toString(imgsListEng[10]));
                } else if (countImg == 11) {
                    hm.put(listmg, Integer.toString(imgsListEng[11]));
                } else if (countImg == 12) {
                    hm.put(listmg, Integer.toString(imgsListEng[12]));
                } else if (countImg == 13) {
                    hm.put(listmg, Integer.toString(imgsListEng[13]));
                } else if (countImg == 14) {
                    hm.put(listmg, Integer.toString(imgsListEng[14]));
                } else if (countImg == 15) {
                    hm.put(listmg, Integer.toString(imgsListEng[15]));
                } else if (countImg == 16) {
                    hm.put(listmg, Integer.toString(imgsListEng[16]));
                } else if (countImg == 17) {
                    hm.put(listmg, Integer.toString(imgsListEng[17]));
                } else if (countImg == 18) {
                    hm.put(listmg, Integer.toString(imgsListEng[18]));
                } else if (countImg == 19) {
                    hm.put(listmg, Integer.toString(imgsListEng[19]));
                } else if (countImg == 20) {
                    hm.put(listmg, Integer.toString(imgsListEng[20]));
                } else if (countImg == 21) {
                    hm.put(listmg, Integer.toString(imgsListEng[21]));
                }
                waterfallList.add(hm);

                countImg++;
            } while (cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return waterfallList;
    }
    // End Image List ภาษาอังกฤษ

    //Image List ภาษาไทย
    public ArrayList<HashMap<String, Object>> getImage() {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        String selectQuery = "SELECT * FROM " + waterfall_info;

        ArrayList<HashMap<String, Object>> waterfallList = new ArrayList<HashMap<String, Object>>();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                HashMap<String, Object> hm = new HashMap<String, Object>();

                hm.put("waterfall_id", cursor.getString(cursor.getColumnIndex("waterfall_id")));
                hm.put("name_th", cursor.getString(cursor.getColumnIndex("name_th")));
                hm.put("genaral_th", cursor.getString(cursor.getColumnIndex("genaral_th")));
                hm.put("history_th", cursor.getString(cursor.getColumnIndex("history_th")));
                hm.put("fee_th", cursor.getString(cursor.getColumnIndex("fee_th")));
                hm.put("travel_th", cursor.getString(cursor.getColumnIndex("travel_th")));
                hm.put("latitude", cursor.getString(cursor.getColumnIndex("latitude")));
                hm.put("longitude", cursor.getString(cursor.getColumnIndex("longitude")));
                hm.put("url360", cursor.getString(cursor.getColumnIndex("url360")));
                hm.put("videoth_path", cursor.getString(cursor.getColumnIndex("videoth_path")));
                hm.put("videoeng_path", cursor.getString(cursor.getColumnIndex("videoeng_path")));

                if (countImg == 0) {
                    hm.put(listmg, Integer.toString(imgsList[0]));
                } else if (countImg == 1) {
                    hm.put(listmg, Integer.toString(imgsList[1]));
                } else if (countImg == 2) {
                    hm.put(listmg, Integer.toString(imgsList[2]));
                } else if (countImg == 3) {
                    hm.put(listmg, Integer.toString(imgsList[3]));
                } else if (countImg == 4) {
                    hm.put(listmg, Integer.toString(imgsList[4]));
                } else if (countImg == 5) {
                    hm.put(listmg, Integer.toString(imgsList[5]));
                } else if (countImg == 6) {
                    hm.put(listmg, Integer.toString(imgsList[6]));
                } else if (countImg == 7) {
                    hm.put(listmg, Integer.toString(imgsList[7]));
                } else if (countImg == 8) {
                    hm.put(listmg, Integer.toString(imgsList[8]));
                } else if (countImg == 9) {
                    hm.put(listmg, Integer.toString(imgsList[9]));
                } else if (countImg == 10) {
                    hm.put(listmg, Integer.toString(imgsList[10]));
                } else if (countImg == 11) {
                    hm.put(listmg, Integer.toString(imgsList[11]));
                } else if (countImg == 12) {
                    hm.put(listmg, Integer.toString(imgsList[12]));
                } else if (countImg == 13) {
                    hm.put(listmg, Integer.toString(imgsList[13]));
                } else if (countImg == 14) {
                    hm.put(listmg, Integer.toString(imgsList[14]));
                } else if (countImg == 15) {
                    hm.put(listmg, Integer.toString(imgsList[15]));
                } else if (countImg == 16) {
                    hm.put(listmg, Integer.toString(imgsList[16]));
                } else if (countImg == 17) {
                    hm.put(listmg, Integer.toString(imgsList[17]));
                } else if (countImg == 18) {
                    hm.put(listmg, Integer.toString(imgsList[18]));
                } else if (countImg == 19) {
                    hm.put(listmg, Integer.toString(imgsList[19]));
                } else if (countImg == 20) {
                    hm.put(listmg, Integer.toString(imgsList[20]));
                } else if (countImg == 21) {
                    hm.put(listmg, Integer.toString(imgsList[21]));
                }
                waterfallList.add(hm);

                countImg++;
            } while (cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return waterfallList;
    }
    //End Image List ภาษาไทย


    //เอใส่เพิ่มlistview
    public ArrayList<HashMap<String, String>> getwaterfalllist(int fallid) {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        HashMap<String, String> falldb = new HashMap<String, String>();
        String selectQuery = "SELECT * FROM " + waterfall_info + " = " + fallid;


        ArrayList<HashMap<String, String>> waterfallList = new ArrayList<HashMap<String, String>>();

        Cursor cursor = db.rawQuery(selectQuery, null);
        int i = 0;
        if (cursor.moveToFirst()) {
            do {

                falldb.put(waterfall_id, cursor.getString(cursor.getColumnIndex(waterfall_id)));
                falldb.put(name_th, cursor.getString(cursor.getColumnIndex(name_th)));
                falldb.put(name_eng, cursor.getString(cursor.getColumnIndex(name_eng)));
                falldb.put(genaral_th, cursor.getString(cursor.getColumnIndex(genaral_th)));
                falldb.put(general_eng, cursor.getString(cursor.getColumnIndex(general_eng)));
                falldb.put(history_th, cursor.getString(cursor.getColumnIndex(history_th)));
                falldb.put(history_eng, cursor.getString(cursor.getColumnIndex(history_eng)));
                falldb.put(fee_th, cursor.getString(cursor.getColumnIndex(fee_th)));
                falldb.put(fee_eng, cursor.getString(cursor.getColumnIndex(fee_eng)));
                falldb.put(travel_th, cursor.getString(cursor.getColumnIndex(travel_th)));
                falldb.put(travel_eng, cursor.getString(cursor.getColumnIndex(travel_eng)));
                falldb.put(latitude, cursor.getString(cursor.getColumnIndex(latitude)));
                falldb.put(longitude, cursor.getString(cursor.getColumnIndex(longitude)));
                falldb.put(url360, cursor.getString(cursor.getColumnIndex(url360)));
                falldb.put(videoth_path, cursor.getString(cursor.getColumnIndex(videoth_path)));
                falldb.put(videoeng_path, cursor.getString(cursor.getColumnIndex(videoeng_path)));
                //falldb.put(tellophone, cursor.getString(cursor.getColumnIndex(tellophone)));
                waterfallList.add(falldb);

                i = i + 1;

            } while (cursor.moveToNext());
        }
        i = 0;
        cursor.close();
        db.close();
        return waterfallList;
    }

    public ArrayList<HashMap<String, String>> getSearch(String falln) {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        HashMap<String, String> falldb = new HashMap<String, String>();
        String selectQuery = "SELECT name_th FROM walterfall_info WHERE MATCH" + falln;

        ArrayList<HashMap<String, String>> waterfallList = new ArrayList<HashMap<String, String>>();
        Cursor cursor = db.rawQuery(selectQuery, null);
        int i = 0;
        if (cursor.moveToFirst()) {
            do {

                falldb.put(name_th, cursor.getString(cursor.getColumnIndex(name_th)));


            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return waterfallList;
    }


    public ArrayList<HashMap<String, Object>> getSearchNameTH(String nameth) {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        ArrayList<HashMap<String, Object>> nameth_list = new ArrayList<HashMap<String, Object>>();
        try {
            Cursor cursor = db.query(true, waterfall_info, new String[]{name_th},
                    "name_th LIKE '%" + nameth + "%'", null, null, null, null, null);

            if (cursor != null) {
                cursor.moveToFirst();

                do {
                    HashMap<String, Object> hm = new HashMap<String, Object>();
                    hm.put("name_th", cursor.getString(cursor.getColumnIndex("name_th")));

                    if (countImg == 0) {
                        hm.put(listmg, Integer.toString(imgsList[0]));
                    } else if (countImg == 1) {
                        hm.put(listmg, Integer.toString(imgsList[1]));
                    } else if (countImg == 2) {
                        hm.put(listmg, Integer.toString(imgsList[2]));
                    } else if (countImg == 3) {
                        hm.put(listmg, Integer.toString(imgsList[3]));
                    } else if (countImg == 4) {
                        hm.put(listmg, Integer.toString(imgsList[4]));
                    } else if (countImg == 5) {
                        hm.put(listmg, Integer.toString(imgsList[5]));
                    } else if (countImg == 6) {
                        hm.put(listmg, Integer.toString(imgsList[6]));
                    } else if (countImg == 7) {
                        hm.put(listmg, Integer.toString(imgsList[7]));
                    } else if (countImg == 8) {
                        hm.put(listmg, Integer.toString(imgsList[8]));
                    } else if (countImg == 9) {
                        hm.put(listmg, Integer.toString(imgsList[9]));
                    } else if (countImg == 10) {
                        hm.put(listmg, Integer.toString(imgsList[10]));
                    } else if (countImg == 11) {
                        hm.put(listmg, Integer.toString(imgsList[11]));
                    } else if (countImg == 12) {
                        hm.put(listmg, Integer.toString(imgsList[12]));
                    } else if (countImg == 13) {
                        hm.put(listmg, Integer.toString(imgsList[13]));
                    } else if (countImg == 14) {
                        hm.put(listmg, Integer.toString(imgsList[14]));
                    } else if (countImg == 15) {
                        hm.put(listmg, Integer.toString(imgsList[15]));
                    } else if (countImg == 16) {
                        hm.put(listmg, Integer.toString(imgsList[16]));
                    } else if (countImg == 17) {
                        hm.put(listmg, Integer.toString(imgsList[17]));
                    } else if (countImg == 18) {
                        hm.put(listmg, Integer.toString(imgsList[18]));
                    } else if (countImg == 19) {
                        hm.put(listmg, Integer.toString(imgsList[19]));
                    } else if (countImg == 20) {
                        hm.put(listmg, Integer.toString(imgsList[20]));
                    } else if (countImg == 21) {
                        hm.put(listmg, Integer.toString(imgsList[21]));
                    }

                    nameth_list.add(hm);
                } while (cursor.moveToNext());

                cursor.close();
                return nameth_list;
            }
            return nameth_list;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nameth_list;
    }

}