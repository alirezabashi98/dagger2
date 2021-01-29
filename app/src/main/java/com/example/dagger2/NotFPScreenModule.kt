package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class NotFPScreenModule(val dpi: Int) {

    @Provides
    fun buildNotFPScreen(): Screen = NotFPScreen(dpi)

}