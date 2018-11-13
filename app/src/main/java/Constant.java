public interface Constant {
    String TABLE_FOOD = "FOOD";
    String COLUMN_FOOODNAME = "Foodname";
    String COLUMN_FOODIMG = "Foodimg";
    String COLUMN_FOODGIA ="Foodgia";
    String CREATE_TABLE_FOOD ="CREATE TABLE " + TABLE_FOOD +"(" +
            COLUMN_FOOODNAME + " VARCHAR PRIMARY KEY, " +
            COLUMN_FOODIMG + "BLOB, " +
            COLUMN_FOODGIA + "VARCHAR, " + ")";

}

