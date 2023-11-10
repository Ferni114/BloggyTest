package com.example.aplicacionandroidtest.DI.Modules

import android.content.Context
import androidx.room.Room
import com.example.aplicacionandroidtest.DI.MainDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideRoomInstance(@ApplicationContext context: Context): MainDatabase {
        return Room.databaseBuilder(
            context, MainDatabase::
            class.java, "database"
        ).build()
    }
}