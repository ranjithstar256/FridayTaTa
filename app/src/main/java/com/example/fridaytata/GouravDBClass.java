package com.example.fridaytata;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class GouravDBClass extends SQLiteOpenHelper {
    SQLiteDatabase sq;

    public GouravDBClass( Context context) {
        super(context, "tatasteel.db", null, 1);
        sq=getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table india (Name text, Location text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void saveoperation(String n, String l){
        ContentValues cv = new ContentValues();
        cv.put("Name",n);
        cv.put("Location",l);
        sq.insert("india",null,cv);
    }
}
