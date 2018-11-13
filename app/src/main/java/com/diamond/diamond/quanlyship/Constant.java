package com.diamond.diamond.quanlyship;

public interface Constant {
String TABLE_FOOD="Food";
String COLUMN_FOODNAME="Foodname";
String COLUMN_FOODPICTURE="Foodpicture";
String COLUMN_FOODPRICE="Foodprice";

String CREATE_TABLE_FOOD =" CREATE TABLE " +TABLE_FOOD+ "(" +
        COLUMN_FOODNAME + " VARCHAR PRIMARY KEY,"+
        COLUMN_FOODPICTURE + " BLOB, " +
        COLUMN_FOODPRICE + " VARCHAR "
        +")";
};