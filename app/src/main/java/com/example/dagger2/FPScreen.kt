package com.example.dagger2

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class FPScreen @Inject constructor(@Named("Dpi")val dpi: Int,@Named("GorillaGlass") val gorillaGlass: Int) : Screen {


    override fun run() {

        Log.i(
            "TAG_TEST",
            "Create Screen ... & value dpi : $dpi & Level GorillaGlass : $gorillaGlass"
        )

    }

}