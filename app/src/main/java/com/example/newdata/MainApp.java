package com.example.newdata;

import android.app.Application;
import androidx.room.Room;

public class MainApp extends Application {

    private static AppDatabase appDatabase;

    public static  AppDatabase myDb(){
        return appDatabase;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();
    }
}
