package com.example.todoapp.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities ={ItemModel.class},exportSchema = false, version = 1)
public abstract class ProjectDatabase extends RoomDatabase{

    public static final String DATABASE_NAME = "project.db";
    public static final Object LOCK = new Object();
    public static ProjectDatabase instance;
    public Dao dao;

    public static  ProjectDatabase getInstance(Context context){
        if (instance== null){
            synchronized (LOCK) {
                if (instance == null) {
                    instance = Room.
                            databaseBuilder(context.getApplicationContext(),
                                    ProjectDatabase.class, DATABASE_NAME)
                            //.allowMainThreadQueries() allow to run im main thread
                            .build();
                }
            }
        }
        return instance;
    }

}
