package com.example.filekadai3_kotae;


import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import androidx.annotation.Nullable;

import java.sql.Date;

public class SimpleDatabaseHelper extends SQLiteOpenHelper {

    private static final String DBNAME = "sample_db";
    private static final int VERSION = 2;

    public SimpleDatabaseHelper(@Nullable Context context) {
        super(context,SimpleDatabaseHelper.DBNAME,null,SimpleDatabaseHelper.VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //テーブル作成
        db.execSQL("CREATE TABLE books(" +
                "id INTEGER PRIMARY KEY,title TEXT,author TEXT,publisher TEXT,price INT,pub_date TEXT)");
        //追加するデータをあらかじめ配列で作っておく
        int[] ids = {1,2,3,4,5,6};
        String[] titles = {"難邸決死釣行記","Linux虎の穴","用心棒師匠　花魁の禊ぎ","超ビギナー　Linux","ダイコヒメフィッシュ","魔辻太平記"};
        String[] authors = {"立山秀利","駒場秀樹","横関智","鈴木吉彦","立山秀利","横関智"};
        String[] publishers = {"釣漢舎","衆和出版","剛胆社","衆和出版","リヌペクト","剛胆社"};
        int[] prices = {1000,2800,680,1600,1300,1500};
        String[] dates = {"2008/5/25","2008/2/15","2006/9/16","2007/12/1","2005/7/7","2006/10/30"};

        //データ挿入(forを使ったほうが楽かも)
        db.beginTransaction();
        try{
            SQLiteStatement sql = db.compileStatement(
                    "INSERT INTO books(id,title,author,publisher,price,pub_date) VALUES(?,?,?,?,?,?)"
            );
            for(int i=0;i<ids.length;i++){
                sql.bindLong(1,ids[i]);
                sql.bindString(2,titles[i]);
                sql.bindString(3,authors[i]);
                sql.bindString(4,publishers[i]);
                sql.bindLong(5,prices[i]);
                sql.bindString(6,dates[i]);
                sql.executeInsert();
                Log.d("iーーーーーーーーーーーーーー","ああああああああああああ");
            }
            db.setTransactionSuccessful();
        }catch(SQLException e){
            Log.d("鰓ーーーーーーーーーーーーーー","ああああああああああああ");
        }finally{
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS books");
        onCreate(db);
    }
}
