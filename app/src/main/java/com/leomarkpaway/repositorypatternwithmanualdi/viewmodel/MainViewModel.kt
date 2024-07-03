package com.leomarkpaway.repositorypatternwithmanualdi.viewmodel

import androidx.lifecycle.ViewModel
import com.leomarkpaway.repositorypatternwithmanualdi.data.repository.NoteRepository

class MainViewModel(private val repository: NoteRepository) : ViewModel() {}