package com.example.aplicacionandroidtest.DI

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.aplicacionandroidtest.Data.DAO.BlogDAO
import com.example.aplicacionandroidtest.Data.Models.BlogModel

@Database(entities=[BlogModel::class],version=1)
abstract class MainDatabase: RoomDatabase() {
    abstract suspend fun blogDAO(): BlogDAO
}