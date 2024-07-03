package com.leomarkpaway.repositorypatternwithmanualdi.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.leomarkpaway.repositorypatternwithmanualdi.MyApp
import com.leomarkpaway.repositorypatternwithmanualdi.R
import com.leomarkpaway.repositorypatternwithmanualdi.viewmodel.MainViewModel
import com.leomarkpaway.repositorypatternwithmanualdi.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var editNote: EditText
    private lateinit var saveButton: Button
    private lateinit var noteList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = MainViewModelFactory(MyApp.appModule.noteRepository)
        viewModel = ViewModelProvider(viewModelStore, factory)[MainViewModel::class.java]

        editNote = findViewById(R.id.edt_note)
        saveButton = findViewById(R.id.btn_save_note)
        noteList = findViewById(R.id.rv_note_list)

        onSaveNote()
        setupNoteList()

    }

    private fun onSaveNote() {
        var note: String? = null

        editNote.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                note = s.toString()
            }
        })

        saveButton.setOnClickListener {
            if (!note.isNullOrEmpty()) {
                viewModel.saveNote(note!!)
            }
        }

    }

    private fun setupNoteList() {
        TODO("Not yet implemented")
    }

}