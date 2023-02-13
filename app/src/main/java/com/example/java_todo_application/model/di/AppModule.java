package com.example.java_todo_application.model.di;

import android.content.Context;
import androidx.room.Room;
import com.example.java_todo_application.model.repo.Repository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InstallIn({SingletonComponent.class})
@Module
public final class AppModule{

    @Provides
    public static TodoDAO providesTodoDao(TodoDatabase todoDB) {return todoDB.todoDao();}



    @Provides
    @NotNull
    public final TodoDatabase providesRoomDB(@ApplicationContext @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        return ((TodoDatabase) Room.databaseBuilder(applicationContext, TodoDatabase.class, "todo-database").build());
    }

    @Provides
    @Singleton
    @NotNull
    public final Repository provideRepositoryImpl(@NotNull TodoDAO todoDao, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(todoDao, "todoDao");
        Intrinsics.checkNotNullParameter(executor, "todoDao");
        return (Repository)(new RepositoryImpl(todoDao, executor));
    }
}
