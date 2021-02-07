package com.example.dagger2

import android.content.Context
import android.widget.Toast
import dagger.Module
import dagger.Provides

@Module()
class NotFPScreenModule(val dpi: Int) {

    @Provides
    fun buildNotFPScreen(): Screen {

        return NotFPScreen(dpi)
    }

}