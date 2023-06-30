package com.example.pncapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper1 extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "feedback.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "feedback";
    private static final String COLUMN_ID = "id";
    static final String COLUMN_NAME = "name";
    static final String COLUMN_EMAIL = "email";
    static final String COLUMN_PHONE = "phone";
    static final String COLUMN_MESSAGE = "message";

    public DatabaseHelper1(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_NAME + " TEXT, "
                + COLUMN_EMAIL + " TEXT, "
                + COLUMN_PHONE + " TEXT, "
                + COLUMN_MESSAGE + " TEXT)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTableQuery = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(dropTableQuery);
        onCreate(db);
    }

    public boolean insertData(int id, String name, String email, String phone, String message) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME,name);
        contentValues.put(COLUMN_EMAIL,email);
        contentValues.put(COLUMN_PHONE,phone);
        contentValues.put(COLUMN_MESSAGE,message);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }


        public boolean updateData(String id,String name,String email,String phone,String message) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_ID,id);
        contentValues.put(COLUMN_NAME,name);
        contentValues.put(COLUMN_EMAIL,email);
        contentValues.put(COLUMN_PHONE,phone);
        contentValues.put(COLUMN_MESSAGE,message);
        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }
}

