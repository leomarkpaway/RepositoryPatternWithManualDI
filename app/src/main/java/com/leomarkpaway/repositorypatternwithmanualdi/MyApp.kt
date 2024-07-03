package com.leomarkpaway.repositorypatternwithmanualdi

import android.app.Application
import com.leomarkpaway.repositorypatternwithmanualdi.di.AppModule
import com.leomarkpaway.repositorypatternwithmanualdi.di.AppModuleImpl

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl(this)
    }

    companion object {
        lateinit var appModule: AppModule
    }
}