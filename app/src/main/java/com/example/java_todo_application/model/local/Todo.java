package com.example.java_todo_application.model.local;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "todo")
public class Todo {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo
    public String todo;

    @ColumnInfo
    public Boolean isCompleted = false;
}
