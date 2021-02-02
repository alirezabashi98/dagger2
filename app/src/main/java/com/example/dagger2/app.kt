package com.example.dagger2

import android.app.Application

class app : Application() {

    private lateinit var component: MobileComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerMobileComponent.builder().buildDpi(370).buildGorillaGlass(4).build()

    }

    fun getDataComponent(): MobileComponent = component

}