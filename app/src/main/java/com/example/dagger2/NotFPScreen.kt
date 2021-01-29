package com.example.dagger2

import android.util.Log

class NotFPScreen(val dpi: Int) : Screen {

    override fun run() {
        Log.i("TAG_TEST", "Create NotFPScreen ... & value dpi : $dpi ")
    }

}