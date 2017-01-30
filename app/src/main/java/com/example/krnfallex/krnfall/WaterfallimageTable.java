package com.example.krnfallex.krnfall;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.ArrayList;
import java.util.HashMap;


public class WaterfallimageTable {

    private MyDatabase myDatabase;
    private SQLiteDatabase writeSQLite, readSQLite;

    public static final String waterfall_image = "waterfall_image";
    public static final String image_id = "image_id";
    public static final String waterfall_id = "waterfall_id";
    public static final String image_path = "image_path";

    public WaterfallimageTable(Context context) {
        myDatabase = new MyDatabase(context);
        writeSQLite = myDatabase.getWritableDatabase();
        readSQLite = myDatabase.getReadableDatabase();
    }

    public ArrayList<byte[]> getListImage(int id) {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        //HashMap<String, byte[]> falldb = new HashMap<String, byte[]>();
        //String selectQuery = "SELECT * FROM " + waterfall_image + "WHERE waterfall_id = " + id;
        String selectQuery = "SELECT * FROM " + waterfall_image + " WHERE " + waterfall_id + " = " + id;

        ArrayList<byte[]> waterfallListImage = new ArrayList<byte[]>();

        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {

                //falldb.put(image_path, cursor.getBlob(cursor.getColumnIndex(image_path)));
                waterfallListImage.add(cursor.getBlob(cursor.getColumnIndex(image_path)));

            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return waterfallListImage;
    }





}
