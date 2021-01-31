package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile
    @Inject
    lateinit var mobile2: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerMobileComponent.builder().buildDpi(370).buildGorillaGlass(4).build()
        component.injectField(this)
        mobile.run()
        mobile2.run()

    }
}