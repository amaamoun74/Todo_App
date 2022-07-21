package com.example.todoapp.repository;

import android.content.Context;

import com.example.todoapp.database.ItemModel;
import com.example.todoapp.database.ProjectDatabase;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AddRepository {
    private Executor executor = Executors.newSingleThreadExecutor();
    private ProjectDatabase projectDatabase;

    public AddRepository(Context context) {
        projectDatabase = ProjectDatabase.getInstance(context);
    }

    public void insertItem(ItemModel itemModel){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                projectDatabase.dao.insert(itemModel);

            }
        });
    }

    public void updateItem(ItemModel itemModel){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                projectDatabase.dao.update(itemModel);
            }
        });
    }

    public void deleteItem(ItemModel itemModel){
        executor.execute(new Runnable() {
            @Override
            public void run() {
                projectDatabase.dao.delete(itemModel);
            }
        });
    }

    public List<ItemModel> getItem(){
               return projectDatabase.dao.getAllItems();
    }


}
