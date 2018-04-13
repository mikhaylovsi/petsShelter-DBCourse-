package com.example.android.pets.data;

import android.content.ContentResolver;
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

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of pets.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single pet.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;



        public static String TABLE_NAME = "pets";
        public static String COLUMN_PET_NAME = "name";
        public static String COLUMN_PET_BREED = "breed";
        public static String COLUMN_PET_GENDER = "gender";
        public static String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet.
         */

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        /**
         * Returns whether or not the given gender is {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         */
        public static boolean isValidGender(int gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }


    }

}
