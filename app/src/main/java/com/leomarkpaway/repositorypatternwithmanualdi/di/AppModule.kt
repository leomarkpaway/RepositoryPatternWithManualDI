package com.leomarkpaway.repositorypatternwithmanualdi.di

import android.content.Context
import com.leomarkpaway.repositorypatternwithmanualdi.data.repository.NoteRepository
import com.leomarkpaway.repositorypatternwithmanualdi.data.repository.NoteRepositoryImpl
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.database.AppDatabase

interface AppModule {
    val noteRepository: NoteRepository
}

class AppModuleImpl(appContext: Context) : AppModule {

    override val noteRepository: NoteRepository =
        NoteRepositoryImpl(AppDatabase.getDatabase(appContext).noteDao())

}