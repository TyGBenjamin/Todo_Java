package com.example.java_todo_application.model.di;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.java_todo_application.model.local.Todo;
import java.util.List;

@Dao
public interface TodoDAO {
    @Query("SELECT * FROM todo")
    List<Todo> getAll();

    @Query("SELECT * FROM todo WHERE id IN (:todoIds)")
    List<Todo> loadTodoById(int[] todoIds);

    @Insert
    void insertAll(Todo... todos);

    @Delete
    void delete(Todo user);
}
