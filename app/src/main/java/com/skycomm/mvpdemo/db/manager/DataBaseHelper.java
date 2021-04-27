package com.skycomm.mvpdemo.db.manager;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static DataBaseHelper instance = null;
    private SQLiteDatabase sqLiteDatabase;

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public static DataBaseHelper getInstance(Context context) {
        if (instance == null) {
            synchronized (DataBaseHelper.class) {
                if (instance == null) {
                    instance = new DataBaseHelper(context, DbConstants.DB_NAME, null, DbConstants.DB_VERSION);
                }
            }
        }
        return instance;
    }


    public SQLiteDatabase openDatabase() {
        try {
            sqLiteDatabase = this.getWritableDatabase();
        } catch (Exception e) {
            e.printStackTrace();
            sqLiteDatabase = this.getReadableDatabase();
        }
        return sqLiteDatabase;
    }


    public void closeDatabase() {
        if (sqLiteDatabase != null && sqLiteDatabase.isOpen())
            sqLiteDatabase.close();
    }


    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS " + DbConstants.T_USER + "  ( "
                + DbConstants.F_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DbConstants.F_PID + " TEXT , "
                + DbConstants.F_ACCOUNT + " TEXT , "
                + DbConstants.F_PASSWORD + " TEXT , "
                + DbConstants.F_NAME + " INTEGER , "
                + DbConstants.F_SEX + " TEXT , "
                + DbConstants.F_LNG + "  TEXT ,"
                + DbConstants.F_LAT + "  TEXT ,"
                + DbConstants.F_EMOTION + "  TEXT ,"
                + DbConstants.F_AGE + "  TEXT ,"
                + DbConstants.F_SCHOOL + "  TEXT ,"
                + DbConstants.F_TELEPHONE + "  TEXT ,"
                + DbConstants.F_CREATETIME + "  TEXT ,"
                + DbConstants.F_PHOTOURL + " TEXT ) ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }


}
