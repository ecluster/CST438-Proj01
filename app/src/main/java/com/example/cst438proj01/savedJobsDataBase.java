package com.example.cst438proj01;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {savedJob.class}, version = 1, exportSchema = false)
public abstract class savedJobsDataBase extends RoomDatabase {
    public static final String SAVED_JOB_TABLE = "SAVED_JOB_TABLE";
    private static savedJobsDataBase instance;
    public abstract savedJobsDAO savedJobsDAO();

    public static synchronized savedJobsDataBase getInstance (Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, savedJobsDataBase.class, "saved_jobs_table")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();

        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new savedJobsDataBase.PopulateDbAsyncTask(instance).execute();
        }
    };


    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private savedJobsDAO shoppingCartDAO;
        private PopulateDbAsyncTask(savedJobsDataBase db) {
            shoppingCartDAO = db.savedJobsDAO();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }


}

