package com.leomarkpaway.repositorypatternwithmanualdi.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leomarkpaway.repositorypatternwithmanualdi.data.repository.NoteRepository
import com.leomarkpaway.repositorypatternwithmanualdi.data.source.local.entity.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val noteRepository: NoteRepository) : ViewModel() {

    fun saveNote(noteString: String) {
       viewModelScope.launch(Dispatchers.IO) {
           val noteItem = Note(null, noteString)
           noteRepository.saveNote(noteItem)
       }
    }

     suspend fun getAllNote() = noteRepository.getAllNote()

}