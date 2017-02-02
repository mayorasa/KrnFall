package com.example.krnfallex.krnfall;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.HashMap;

/**
 * Created by NarwhalZ on 2/2/2560.
 */

public class WaterfallSeason {

    private MyDatabase myDatabase;
    private SQLiteDatabase writeSQLite, readSQLite;

    public static final String waterfall_season = "waterfall_season";
    public static final String season_id = "season_id";
    public static final String waterfall_id = "waterfall_id";
    public static final String Summer_season = "Summer_season";
    public static final String Winter_season = "Winter_season";
    public static final String Rain_season = "Rain_season";

    public WaterfallSeason(Context context) {
        myDatabase = new MyDatabase(context);
        writeSQLite = myDatabase.getWritableDatabase();
        readSQLite = myDatabase.getReadableDatabase();
    }

    public HashMap<String, Integer> GetName(Integer id)
    {
        SQLiteDatabase db = myDatabase.getReadableDatabase();
        String selectQuery = "SELECT * FROM waterfall_season WHERE " + waterfall_id + " = " + id;

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                hm.put(Summer_season, cursor.getInt(2));
                hm.put(Winter_season, cursor.getInt(3));
                hm.put(Rain_season, cursor.getInt(4));

            } while (cursor.moveToNext());

        }

        cursor.close();
        db.close();
        return hm;

    }

}
