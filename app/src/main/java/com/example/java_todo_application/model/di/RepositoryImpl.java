package com.example.java_todo_application.model.di;

import com.example.java_todo_application.model.local.Todo;
import com.example.java_todo_application.model.repo.Repository;
import java.util.concurrent.Executor;
import javax.inject.Inject;


public class RepositoryImpl implements Repository {

    private TodoDAO todoDao;
    private Executor executor;


    @Inject
    public RepositoryImpl(TodoDAO todoDao, Executor executor) {
        this.todoDao = todoDao;
        this.executor = executor;
    }

    @Override
    public void getTodos() {
         todoDao.getAll();
    }

    @Override
    public void insertTodos(Todo todo) {
        todoDao.insertAll(todo);
    }

    @Override
    public void deleteTodos(Todo todo) {
        todoDao.delete(todo);

    }

    @Override
    public void updateTodo(Todo todo) {
        todoDao.insertAll(todo);
    }
}
