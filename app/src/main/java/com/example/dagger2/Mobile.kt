package com.example.dagger2

import android.util.Log
import dagger.Binds
import javax.inject.Inject

class Mobile @Inject constructor(val board: Board,val screen: Screen) {

    fun run() {
        Log.i("TAG_TEST", "Create Mobile ... ")
        screen.run()
    }

    @Inject
    fun setGuard(guard: Guard) {

        guard.setGuardForMobile(this)

    }

}