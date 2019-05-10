package com.diplom.uedec.teacherapplication.data;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.os.AsyncTask;

import okhttp3.Headers;

/**
 * Created by uedec on 10.05.2019.
 */

public class App extends Application {
    class CreateDataBase extends AsyncTask<RoomDatabase.Builder<AppDatabase>,Void,AppDatabase> {
        @Override
        protected AppDatabase doInBackground(RoomDatabase.Builder<AppDatabase>[] builders) {
            AppDatabase db=builders[0].build();
            database=db;
            return db;
        }
        @Override
        protected void onPostExecute(AppDatabase db)
        {

        }
    }

    public static App instance;
    public static String cookies;
    public static Headers headers;
    public static ApplicationUser user;
    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        new CreateDataBase().execute(Room.databaseBuilder(instance, AppDatabase.class, "database"));
    }

    public static App getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
