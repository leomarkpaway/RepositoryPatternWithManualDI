package com.leomarkpaway.repositorypatternwithmanualdi.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.leomarkpaway.repositorypatternwithmanualdi.MyApp
import com.leomarkpaway.repositorypatternwithmanualdi.R
import com.leomarkpaway.repositorypatternwithmanualdi.viewmodel.MainViewModel
import com.leomarkpaway.repositorypatternwithmanualdi.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = MainViewModelFactory(MyApp.appModule.noteRepository)
        viewModel = ViewModelProvider(viewModelStore, factory)[MainViewModel::class.java]

    }
    
}