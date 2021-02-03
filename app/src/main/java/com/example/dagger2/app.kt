package com.example.dagger2

import android.app.Application

class app : Application() {

    private lateinit var component: StorageComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerStorageComponent.create()

    }

    fun getDataComponent(): StorageComponent = component

}