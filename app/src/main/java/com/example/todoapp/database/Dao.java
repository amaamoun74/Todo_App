package com.example.todoapp.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ItemModel itemModel);


    @Update
    void update(ItemModel itemModel);


    @Delete
    void delete(ItemModel itemModel);

    @Query("SELECT * FROM Item")
    List<ItemModel> getAllItems();

    @Query("SELECT * FROM Item WHERE title=:titleIN")
    List<ItemModel> getItemsFromSearch(String titleIN);
}
