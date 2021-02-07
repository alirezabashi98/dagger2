package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mobile: Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as app).getDataComponent().getMobileComponentBuilder().buildGorillaGlass(4).buildDpi(360).build()
        component.injectField(this)
        mobile.run()

    }
}