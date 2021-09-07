package com.example.cst438proj01;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {User.class},version = 1,exportSchema = false )
public abstract class database extends RoomDatabase {
    public static final String USER_TABLE = "USER_TABLE";
    private static database userDatabase;
    private static database instance;


    public abstract UserDAO getIneptDAO();

    public static synchronized database getUserDatabase(Context context) {
        if (userDatabase == null) {
            userDatabase = Room.databaseBuilder(context.getApplicationContext(), database.class, "user_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return userDatabase;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(userDatabase).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private UserDAO userDAO;

        private PopulateDbAsyncTask(database db) {
            userDAO = db.getIneptDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            userDAO.insert(new User("testuser1","testuser1"));
            userDAO.insert(new User("admin2","admin2"));

            return null;
        }
    }
}

