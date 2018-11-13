package com.diamond.diamond.quanlyship.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.diamond.diamond.quanlyship.Constant;

public class DatabaseHepler extends SQLiteOpenHelper implements Constant {
  public DatabaseHepler(Context context){
      super(context,"QuanLyShip",null,1);
  }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_FOOD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ TABLE_FOOD);
    }
}
