package com.example.dagger2

import dagger.Binds
import dagger.Module

@Module
abstract class FPScreenModule {

    @Binds
    abstract fun buildScreen(fpScreen: FPScreen): Screen

}