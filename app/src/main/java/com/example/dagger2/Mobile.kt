package com.example.dagger2

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(board: Board, screen: Screen) {

    fun run() {
        Log.i("TAG_TEST", "create Mobile ... ")
    }

    @Inject
    fun setGuard(guard: Guard) {

        guard.setGuardForMobile(this)

    }

}