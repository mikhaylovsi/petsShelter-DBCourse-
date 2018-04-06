package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by KsanaWonka on 17.02.2018.
 */

public final class PetContract {


    private PetContract(){}

    public static final String CONTENT_AUTHORITY = "com.example.android.pets";
    public static final Uri BASE_CONTENT_AUTHORITY = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static String PATH_PETS = "pets";


    public static class PetEntry implements BaseColumns{


        public static Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_AUTHORITY, PATH_PETS);

        public static String TABLE_NAME = "pets";
        public static String COLUMN_PET_NAME = "name";
        public static String COLUMN_BREED = "breed";
        public static String COLUMN_GENDER = "gender";
        public static String COLUMN_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;


    }

}
