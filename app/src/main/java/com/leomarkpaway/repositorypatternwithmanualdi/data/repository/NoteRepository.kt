package com.leomarkpaway.repositorypatternwithmanualdi.data.repository

import androidx.lifecycle.LiveData
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.doa.NoteDao
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.entity.Note

interface NoteRepository {
   suspend fun saveNote(note: Note)
   suspend fun getAllNote() : LiveData<List<Note>>
}

class NoteRepositoryImpl(private val todoDao: NoteDao) : NoteRepository {

    override suspend fun saveNote(note: Note) = todoDao.saveNote(note)
    override suspend fun getAllNote() = todoDao.getAllNote()

}