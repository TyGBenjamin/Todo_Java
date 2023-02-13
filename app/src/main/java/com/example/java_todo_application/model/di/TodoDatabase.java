package com.example.java_todo_application.model.di;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.java_todo_application.model.local.Todo;

@Database(entities = {Todo.class}, version = 1)
public abstract class TodoDatabase extends RoomDatabase {
    public abstract TodoDAO todoDao();
}
