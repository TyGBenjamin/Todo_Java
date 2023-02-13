package com.example.java_todo_application.model.app;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@HiltAndroidApp
public class TodoApplication extends Application{
    ExecutorService executorService = Executors.newFixedThreadPool(4);
}
