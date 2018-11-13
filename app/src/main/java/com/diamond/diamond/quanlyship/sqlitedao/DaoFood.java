package com.diamond.diamond.quanlyship.sqlitedao;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.diamond.diamond.quanlyship.Constant;
import com.diamond.diamond.quanlyship.database.DatabaseHepler;
import com.diamond.diamond.quanlyship.model.Food;

public class DaoFood implements Constant {
    private DatabaseHepler databaseHepler;

    public DaoFood(DatabaseHepler databaseHepler){
        this.databaseHepler= databaseHepler;
    }

    public long inser_Food(Food food){
        SQLiteDatabase sqLiteDatabase= databaseHepler.getWritableDatabase();

        ContentValues contentValues= new ContentValues();
        contentValues.put(COLUMN_FOODNAME, food.getNamefood());
        contentValues.put(COLUMN_FOODPRICE, food.getPrice());
        contentValues.put(COLUMN_FOODPICTURE, food.getImg());

        long resut = sqLiteDatabase.insert(TABLE_FOOD, null, contentValues);
        sqLiteDatabase.close();
        return resut;
    }
}
