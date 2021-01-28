package com.example.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobile = Mobile(
            Board(Storage(), Camera()),
            Screen(Lcd(), Touch())
        )

    }
}