package com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.database.AppDatabase.Companion.VERSION_NUMBER
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.doa.NoteDao
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.entity.Note

@Database(
    entities = [Note::class],
    version = VERSION_NUMBER,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDao

    companion object {
        const val VERSION_NUMBER = 1
        const val DATABASE_NAME = "noted_database"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = context.createRoomDataBase<AppDatabase>(DATABASE_NAME)
                INSTANCE = instance
                instance
            }
        }
    }
}

inline fun <reified T : RoomDatabase> Context.createRoomDataBase(databaseName: String) =
    Room.databaseBuilder(
        this.applicationContext,
        T::class.java,
        databaseName
    ).build()