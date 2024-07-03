package com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.doa

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.entity.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNote(note: Note)

    @Query("SELECT * FROM notes ORDER BY title ASC")
    fun getAllNote(): LiveData<List<Note>>

}