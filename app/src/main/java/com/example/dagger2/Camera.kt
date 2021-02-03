package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScope
class Camera @Inject constructor() {

    init {

        Log.i("TAG_TEST", "Create Camera ...")

    }

}