package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class FPScreen @Inject constructor() : Screen {


    override fun run() {

        Log.i("TAG_TEST", "Create Screen ...")

    }

}