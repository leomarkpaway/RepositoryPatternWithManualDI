package com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.doa

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.entity.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNote(note: Note)

}