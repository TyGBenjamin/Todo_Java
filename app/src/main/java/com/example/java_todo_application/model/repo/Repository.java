package com.example.java_todo_application.model.repo;

import com.example.java_todo_application.model.local.Todo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Repository {
    public void getTodos();

    public void insertTodos(Todo todo);

    public void deleteTodos(Todo todo);

    public void updateTodo(Todo todo);


//    @Nullable
//    Object getTodos(@NotNull Continuation var1);
//
//    @Nullable
//    Object deleteTodo(@NotNull Todo var1, @NotNull Continuation var2);
//
//    @Nullable
//    Object insertTodo(@NotNull Todo var1, @NotNull Continuation var2);
//
//    @Nullable
//    Object updateTodo(@NotNull Todo var1, @NotNull Continuation var2);
}
