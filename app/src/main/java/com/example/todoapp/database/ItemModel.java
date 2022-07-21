package com.example.todoapp.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Item")
public class ItemModel {
    @PrimaryKey(autoGenerate = true)
    int id;
    String title;
    String description;
    String time;

    public ItemModel(int id, String title, String description, String time) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.time = time;
    }

    public ItemModel(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public ItemModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
