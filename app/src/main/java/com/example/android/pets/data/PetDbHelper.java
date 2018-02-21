package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by KsanaWonka on 17.02.2018.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "shelter.db";
    private static final int DATABASE_VERSION = 1;
    private final String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetContract.PetEntry.TABLE_NAME +
            " (" + PetContract.PetEntry._ID + " INTEGER, " +
            PetContract.PetEntry.COLUMN_NAME + " TEXT NOT NULL, " +
            PetContract.PetEntry.COLUMN_BREED + " TEXT, " +
            PetContract.PetEntry.COLUMN_GENDER + " INTEGER NOT NULL, " +
            PetContract.PetEntry.COLUMN_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";



    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
