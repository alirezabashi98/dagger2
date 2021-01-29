package com.example.dagger2

import android.content.Context
import android.widget.Toast
import dagger.Module
import dagger.Provides

@Module(includes = [ContextModule::class])
class NotFPScreenModule(val dpi: Int) {

    @Provides
    fun buildNotFPScreen(context: Context): Screen {

        Toast.makeText(context,"getContext",Toast.LENGTH_SHORT).show()

        return NotFPScreen(dpi)
    }

}